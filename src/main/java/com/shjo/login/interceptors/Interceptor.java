package com.shjo.login.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import com.shjo.login.annotation.CheckLogin;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Interceptor extends HandlerInterceptorAdapter{
	
	// controller 이벤트 호출 전
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.debug("#### preHandle()");
		
		//@CheckLogin 어노테이션이 컨트롤러에 사용되었는지 체크함
		CheckLogin usingAuth = ((HandlerMethod) handler).getMethodAnnotation(CheckLogin.class);
 
        //NoCheckLogin 어노테이션이 없음으로 무조건 로그인 체크
        if(usingAuth != null) {
    		if(WebUtils.getSessionAttribute(request, "user") == null){
	    		response.sendRedirect(request.getContextPath() + "/login");
	    		return false;
    		}
        }
	
		return true;
	}
}
