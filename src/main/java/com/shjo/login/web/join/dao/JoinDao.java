package com.shjo.login.web.join.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.shjo.login.web.join.model.JoinParamModel;

@Repository
public class JoinDao {
    private static final String NAMESPACE = "com.shjo.login.web.join.dao.JoinMapper.";

    private SqlSession sqlSession;
    
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
    public void insertMember(JoinParamModel joinModel) throws Exception {
    	sqlSession.insert(NAMESPACE + "insertMember", joinModel);
    }

}
