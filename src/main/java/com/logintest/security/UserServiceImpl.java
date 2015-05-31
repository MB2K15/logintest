/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logintest.security;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Matt
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao usrDao;
	@Transactional
	public void add(UserModel usr) {
		usrDao.add(usr);
	}

	@Transactional
	public void edit(UserModel usr) {
		usrDao.edit(usr);
	}

	@Transactional
	public void delete(int usrId) {
		usrDao.delete(usrId);
	}

	@Transactional
	public UserModel getUser(int usrId) {
		return usrDao.getUser(usrId);
	}

	@Transactional
	public List getAllUsers() {
		return usrDao.getAllUsers();
	}

}
