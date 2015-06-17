package com.shjo.login.web.join.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shjo.login.web.join.model.JoinModel;

@Repository
public class JoinDao {
    private static final String NAMESPACE = "com.shjo.login.web.join.dao.JoinMapper.";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

	/**
     * <pre> 
     * 회원 정보를 저장한다.
     * 
     * history
     * 2015. 4. 13. by 조수희
     * 초기 개발
     * </pre>
     *
     * @since 2015. 4. 13.오후 3:05:13
     * @param joinModel
     * @throws Exception
     */
    public void insertMember(JoinModel joinModel) throws Exception {
    	sqlSessionTemplate.insert(NAMESPACE + "insertMember", joinModel);
    }
}
