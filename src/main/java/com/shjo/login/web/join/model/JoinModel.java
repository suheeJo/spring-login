package com.shjo.login.web.join.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinModel {
	private String id = null;
	private String password = null;
	private String name = null;
	private String gender = null;
	private Date birthday = null;
	private Date registerDate = null;
	private Date updateDate = null;
}
