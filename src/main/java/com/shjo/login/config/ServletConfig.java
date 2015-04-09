package com.shjo.login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
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
@Configuration // 설정용 클래스라는 것을 스프링에게 알려주는 역할
@EnableWebMvc // WebMvcConfigurationSupport에 정의된 Spring MVC 설정들을 임포트한다.
@ComponentScan(
	basePackages="com.shjo.login"
) // 자동으로 빈 등록
public class ServletConfig extends WebMvcConfigurerAdapter { // 인터셉터를 추가하기 위해 WebMvcConfigurerAdapter 를 상속
	
	// @RequestMapping에 매핑된 URL이 아니면 defulat servlet을 타게 함
	@Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
    
	// 사용자에게 결과를 랜더링하여 보여주기 위해 사용
	@Bean
//	@Profile({"production"})
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
