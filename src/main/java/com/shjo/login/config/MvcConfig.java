package com.shjo.login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.shjo.login.interceptors.Interceptor;

/**
 * MVC 설정 용 클래스
 * 이 클래스는 스프링의 sevlet-context.xml의 역할을 대신 함
 * @author 조수희
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(
	basePackages="com.shjo.login"
)
public class MvcConfig extends WebMvcConfigurerAdapter { // 인터셉터를 추가하기 위해 WebMvcConfigurerAdapter 를 상속
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	// 인터셉터 추가
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new Interceptor());
	}
}
