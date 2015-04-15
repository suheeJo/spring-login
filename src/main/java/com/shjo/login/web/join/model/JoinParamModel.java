package com.shjo.login.web.join.model;

import java.util.Date;

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
	
//	@NotEmpty @Past 
	private Date birthday = null;
	
	private Date registerDate = null;
	private Date updateDate = null;
}
