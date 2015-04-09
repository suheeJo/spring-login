package com.shjo.login.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * WebApplicationInitializer를 상속하면, 서블릿 컨테이너가 실행될 때 onStartup() 메소드가 자동으로 호출됨
 * 이 클래스는 web.xml 의 역할을 대신하거나 보충함
 * @author 조수희
 *
 */
public class Initizlizer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));
 
        this.addDispatcherServlet(servletContext);
        this.addUtf8CharacterEncodingFilter(servletContext);
	}
	
	/**
	 * <pre> 
	 * Dispatcher Servlet 추가
	 * CORS를 가능하게 하기 위해서 dispatchOptionsRequest 설정을 true로 함
	 * 
	 * history
	 * 2015. 4. 8. by 조수희
	 * 초기 개발
	 * </pre>
	 *
	 * @since 2015. 4. 8.오후 3:05:03
	 * @param serveContext
	 */
	private void addDispatcherServlet(ServletContext serveContext) {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.getEnvironment().addActiveProfile("production");
		applicationContext.register(MvcConfig.class);
		
		ServletRegistration.Dynamic dispatcher = serveContext.addServlet("dispatcher", new DispatcherServlet(applicationContext));
		 dispatcher.setLoadOnStartup(1);
	        dispatcher.addMapping("/");
	        dispatcher.setInitParameter("dispatchOptionsRequest", "true"); // CORS 를 위해서 option request 도 받아들인다.
	}
	
	/**
	 * <pre>
	 * UTF-8 캐릭터 인코딩 필터 추가
	 *  
	 * history
	 * 2015. 4. 8. by 조수희
	 * 초기 개발
	 * </pre>
	 *
	 * @since 2015. 4. 8.오후 3:06:05
	 * @param servletContext
	 */
	private void addUtf8CharacterEncodingFilter(ServletContext servletContext) {
		FilterRegistration.Dynamic filter = servletContext.addFilter("CHARACTER_ENCODING_FILTER", CharacterEncodingFilter.class);
        filter.setInitParameter("encoding", "UTF-8");
        filter.setInitParameter("forceEncoding", "true");
        filter.addMappingForUrlPatterns(null, false, "/*");
	}
}
