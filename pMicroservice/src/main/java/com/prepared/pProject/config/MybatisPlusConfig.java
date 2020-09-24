package com.prepared.pProject.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.prepared.pProject.config.commons.Database;
import com.prepared.pProject.config.datasource.DynamicDataSource;
import com.prepared.pProject.config.properties.BaseDataSourceProperties;
import com.prepared.pProject.config.properties.FirstDataSourceProperties;
import com.prepared.pProject.config.properties.SecondDataSourceProperties;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import java.sql.SQLException;
import java.util.HashMap;

/**
 * @author z2010
 * Version 1.36
 */

@Configuration
@EnableTransactionManagement(order = 2)//由于引入多数据源，所以让spring事务的aop要在多数据源切换aop的后面
@MapperScan(basePackages = {"com.ehl.koms.is.data.db.mapper"})
public class MybatisPlusConfig implements TransactionManagementConfigurer {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private BaseDataSourceProperties baseDataSourceProperties;

	private SecondDataSourceProperties secondDataSourceProperties;

	private FirstDataSourceProperties firstDataSourceProperties;


	@Autowired
	public void setBaseDataSourceProperties(BaseDataSourceProperties baseDataSourceProperties) {
		this.baseDataSourceProperties = baseDataSourceProperties;
	}

	@Autowired
	public void setSmcDataSourceProperties(SecondDataSourceProperties secondDataSourceProperties) {
		this.secondDataSourceProperties = secondDataSourceProperties;
	}

	@Autowired
	public void setAppDataSourceProperties(FirstDataSourceProperties firstDataSourceProperties) {
		this.firstDataSourceProperties = firstDataSourceProperties;
	}

	/**
	 * 第一个库
	 */
	private DruidDataSource secondDataSourceProperties() throws SQLException {
		DruidDataSource dataSource = new DruidDataSource();
		baseDataSourceProperties.config(dataSource);
		firstDataSourceProperties.config(dataSource);
		return dataSource;
	}

	/**
	 * 第二个库
	 */
	private DruidDataSource appDataSource() throws SQLException {
		DruidDataSource dataSource = new DruidDataSource();
		baseDataSourceProperties.config(dataSource);
		secondDataSourceProperties.config(dataSource);
		return dataSource;
	}

	/**
	 * 多数据源连接池配置
	 */
	@Bean
	public DynamicDataSource multipleDataSource() {
		try {
			DynamicDataSource dynamicDataSource = new DynamicDataSource();
			HashMap<Object, Object> hashMap = new HashMap<>();
			//应用数据库加载
			DruidDataSource appDataSource = appDataSource();
			appDataSource.init();
			logger.info("应用数据库初始化完成！");
			//数据库加载
			if (StringUtils.isNoneBlank(secondDataSourceProperties.getUrl())
					&& StringUtils.isNoneBlank(secondDataSourceProperties.getUsername())) {
				DruidDataSource smcDataSource = appDataSource();
				smcDataSource.init();
				hashMap.put(Database.SECOND.id(), smcDataSource);
				logger.info("系统管理中心数据库初始化完成！");
			}
			hashMap.put(Database.FIRST.id(), appDataSource);
			dynamicDataSource.setTargetDataSources(hashMap);
			dynamicDataSource.setDefaultTargetDataSource(appDataSource);
			return dynamicDataSource;
		} catch (SQLException ex) {
			logger.error("加载数据源过程中出现异常：", ex);
			throw new RuntimeException(ex);
		}
	}


	/**
	 * mybatis-plus分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	/**
	 * 事务配置,考虑多数据源情况下
	 *
	 * @return PlatformTransactionManager
	 */
	@Bean
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(multipleDataSource());
	}

	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return txManager();
	}
}
