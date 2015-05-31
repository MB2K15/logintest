/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logintest.security;

import java.util.List;

/**
 *
 * @author Matt
 */
public interface UserDao {
	public void add(UserModel usr);
	public void edit(UserModel usr);
	public void delete(int usrId);
	public UserModel getUser(int usrId);
	public List getAllUsers();
}
