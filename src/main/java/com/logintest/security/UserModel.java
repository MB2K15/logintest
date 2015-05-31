/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logintest.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Matt
 */
@Table(name = "usermodel")
@Entity
public class UserModel {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int usrId;
	@Column
	private String usrName;
	@Column
	private String usrPasswd;
	@Column
	private String usrDesc;
	
	public UserModel(){}
	
	public UserModel(int usrId, String usrName, String usrPasswd, String usrDesc) {
		super();
		this.usrId = usrId;
		this.usrName = usrName;
		this.usrPasswd = usrPasswd;
		this.usrDesc = usrDesc;
	}
	public int getUsrId() {
		return usrId;
	}
	public void setUsrId(int usrId) {
		this.usrId = usrId;
	}
	public String getUsrName() {
		return usrName;
	}
	public void setUsrName(String usrName) {
		this.usrName = usrName;
	}
	public String getUsrPasswd() {
		return usrPasswd;
	}
	public void setUsrPasswd(String usrPasswd) {
		this.usrPasswd = usrPasswd;
	}
	public String getUsrDesc() {
		return usrDesc;
	}
	public void setUsrDesc(String usrDesc) {
		this.usrDesc = usrDesc;
	}

	
}

