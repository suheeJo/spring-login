package com.shjo.login.web.join.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shjo.login.web.join.dao.JoinDao;
import com.shjo.login.web.join.model.JoinModel;

@Service
public class JoinService {
	
	@Autowired
	private JoinDao joinDao;
	
	/**
	 * <pre> 
	 * 회원 정보를 저장한다.
	 * 
	 * history
	 * 2015. 4. 13. by 조수희
	 * 초기 개발
	 * </pre>
	 *
	 * @since 2015. 4. 13.오후 3:09:10
	 * @param joinModel
	 * @throws Exception
	 */
	public void insertMember(JoinModel joinModel) throws Exception {
		Date currentDate = new Date();
		
		joinModel.setRegisterDate(currentDate);
		joinModel.setUpdateDate(currentDate);
		joinDao.insertMember(joinModel);
	}
}
