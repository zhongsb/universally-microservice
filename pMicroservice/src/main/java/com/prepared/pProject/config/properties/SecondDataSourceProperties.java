package com.prepared.pProject.config.properties;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * Created by Gensokyo V.L. on 2017/7/29.
 * Version 1.36
 */

@Component
@ConfigurationProperties(prefix = SecondDataSourceProperties.PREFIX)
public class SecondDataSourceProperties {

	public static final String PREFIX = "datasource.sources.second";

	//private String url = "jdbc:oracle:thin:@//127.0.0.1:1521/EHL";
	private String url = "";

	private String username = "";

	private String password = "";

	/**
	 * 默认只启用SQL防火墙过滤器
	 */
	private String filters = "wall";


	public void config(DruidDataSource dataSource) throws SQLException {
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setFilters(filters);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}
}
