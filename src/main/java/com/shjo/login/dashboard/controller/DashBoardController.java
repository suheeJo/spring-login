package com.shjo.login.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shjo.login.annotation.CheckLogin;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class DashBoardController {
	
	/**
	 * <pre> 
	 * 대시보드 페이지를 반환한다.
	 * 
	 * history
	 * 2015. 4. 7. by 조수희
	 * 초기 개발
	 * </pre>
	 *
	 * @since 2015. 4. 7.오후 4:00:56
	 * @return
	 * @throws Exception
	 */
	@CheckLogin
	@RequestMapping(value="/dashboard")
	public String getDashBoardPage() throws Exception {
		log.debug("#### getDashBoardPage()");
		return "dashboard/index";
	}
}
