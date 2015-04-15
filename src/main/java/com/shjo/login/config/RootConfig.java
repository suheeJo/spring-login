package com.shjo.login.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * 루트 설정용 클래스
 * 이 클래스는 스프링의 root-context.xml의 역할을 대신 함
 * @author 조수희
 *
 */
@Configuration
public class RootConfig {
	
	@Value("${mysql.driverClassName}")
	private String driverClassName;
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.userName}")
	private String userName;
	
	@Value("${mysql.userPassword}")
	private String userPassword;
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(userPassword);
		
		return dataSource;
	}
	
	// transactionManager 설정
	/*
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
	*/

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:**/dao/*.xml"));
        return sqlSessionFactoryBean.getObject();
	}
}
