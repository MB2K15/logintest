/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.logintest.security;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Matt
 */
@Controller
public class UserController {
	@Autowired
	private UserService usrService;
	
	@RequestMapping(value = "/newp")
	public String setupForm(Map<String, Object> map){
		UserModel usr = new UserModel();
		map.put("usr", usr);
		map.put("usrList",usrService.getAllUsers());
		return "user";
	}
	
	@RequestMapping(value="/user.do",method=RequestMethod.POST)
	public String doActions(@ModelAttribute UserModel usr, BindingResult res, @RequestParam String action, Map<String, Object> map){
		UserModel usrRes = new UserModel();
		switch(action.toLowerCase()){
		case "add":
			usrService.add(usr);
			usrRes=usr;
			break;
		case "edit":
			usrService.edit(usr);
			usrRes=usr;
			break;
		case "delete":
			usrService.delete(usr.getUsrId());
			usrRes=new UserModel();
			break;
		case "search":	
			UserModel foundUsr = usrService.getUser(usr.getUsrId());
			usrRes=foundUsr!=null ? foundUsr : new UserModel();
			break;
		}
		map.put("usr", usrRes);
		map.put("usrList",usrService.getAllUsers());
		return "user";
	}
}
