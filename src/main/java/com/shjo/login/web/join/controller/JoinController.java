package com.shjo.login.web.join.controller;

import javax.validation.Valid;

import lombok.extern.slf4j.Slf4j;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shjo.login.common.model.ResponseModel;
import com.shjo.login.web.join.model.JoinModel;
import com.shjo.login.web.join.model.JoinParamModel;
import com.shjo.login.web.join.service.JoinService;

@Slf4j
@Controller
public class JoinController {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private JoinService joinService;
	
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
	
	/**
	 * <pre>
	 * 회원 정보를 저장한다.
	 *  
	 * history
	 * 2015. 4. 17. by 조수희
	 * 초기 개발
	 * </pre>
	 *
	 * @since 2015. 4. 17.오후 3:30:07
	 * @param joinParamModel
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/insertMember", method=RequestMethod.POST)
	public @ResponseBody ResponseModel insertMember(
		@RequestBody @Valid JoinParamModel joinParamModel) throws Exception {
		log.debug("#### insertMember()");
		log.debug("#### joinParamModel: {}", joinParamModel);
		
		ResponseModel response = new ResponseModel();
		
		joinService.insertMember(modelMapper.map(joinParamModel, JoinModel.class));
		
		return response;
	}
}
