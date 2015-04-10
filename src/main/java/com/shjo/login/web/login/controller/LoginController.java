package com.shjo.login.web.login.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class LoginController {

	/**
	 * <pre> 
	 * 로그인 페이지를 반환한다.
	 * 
	 * history
	 * 2015. 4. 7. by 조수희
	 * 초기 개발
	 * </pre>
	 *
	 * @since 2015. 4. 7.오후 4:00:11
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage() throws Exception {
		log.debug("#### getLoginPage()");
		
		return "index";
	}
}
