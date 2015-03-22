package com.mkyong.common.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HelloController {
    
    
    private String login = "mateusz" , password = "abc";
    private String login_1 = "mateusz" , password_1 = "bca";

	@RequestMapping(method = RequestMethod.GET)
	/*public String printWelcome(ModelMap model) {

            
            Person pe = new Person();
            pe.setName("Mateusz");
            pe.setAge(100);
            
            
		model.addAttribute("Person",pe);
		return "hello";
        

	}*/
        
        public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("message", "Strona powitalna!");
		model.setViewName("hello");
		return model;

	}
        
        public void check(){
        
        if(login.equals(login_1 )&& password.equals(password_1))
          
                System.out.println("good");
        
        else
                System.out.println("not acces");
        
        
        
        
        
        }
       
        
        
        
        
	
}