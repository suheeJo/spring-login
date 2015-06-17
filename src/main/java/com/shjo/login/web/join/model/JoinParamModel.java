package com.shjo.login.web.join.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.hibernate.validator.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinParamModel {
	@NotEmpty 
	private String id = null;
	
	@NotEmpty 
	private String password = null;
	
	@NotEmpty 
	private String name = null;
	
	@NotEmpty 
	private String gender = null;
	
	@NotNull
	private long birthday = 0L;
	
	// JoinParam에서 사용
	public Date getBirthDay() {
		if(birthday > 0) {
			return new Date(birthday * 1000);
		}
		return null;
	}
}
