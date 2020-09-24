package com.prepared.pProject;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnApplicationTests {

	private SqlSessionFactory factory;

	@Before("")
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void showDefaultCacheConfiguration() {
		System.out.println("一级缓存范围: " + factory.getConfiguration().getLocalCacheScope());
		System.out.println("二级缓存是否被启用: " + factory.getConfiguration().isCacheEnabled());
	}
}
