package com.example.Mybatis_Update.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@MapperScan("com.example.Mybatis_Update.mapper")
public class AppConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	@Primary
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		
		SqlSessionFactory sessionFactory = factoryBean.getObject();
		sessionFactory.getConfiguration().setJdbcTypeForNull(JdbcType.NULL);
		sessionFactory.getConfiguration().setDefaultStatementTimeout(15);
		
		return sessionFactory;	
		
	}
	
	
	@Bean(name = "update")
	public SqlSessionFactory sqlSessionFactoryupdate() throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		
		SqlSessionFactory sessionFactory = factoryBean.getObject();
		sessionFactory.getConfiguration().setJdbcTypeForNull(JdbcType.NULL);
		sessionFactory.getConfiguration().setDefaultStatementTimeout(15);
		sessionFactory.getConfiguration().addMappers("com.example.Mybatis_Update.mapper");
		
		return sessionFactory;	
		
	}
	

}
