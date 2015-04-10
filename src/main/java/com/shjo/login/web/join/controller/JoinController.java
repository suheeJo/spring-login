package com.shjo.login.web.join.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class JoinController {
	
	/**
	 * <pre>
	 * 회원가입 페이지를 반환한다.
	 *  
	 * history
	 * 2015. 4. 10. by 조수희
	 * 초기 개발
	 * </pre>
	 *
	 * @since 2015. 4. 10.오후 5:38:25
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String getJoinPage() throws Exception {
		log.debug("#### getJoinPage()");
		return "join/index";
	}
}
