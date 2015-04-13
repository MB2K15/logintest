package com.mkyong.common.controller;


import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {


    private static final String MY_LOGIN = "mateusz";
    private static final String MY_PASSWORD = "abc";
    private int liczba_1;

    //Mapowanie dla strony domyslnej
    @RequestMapping(value = "/index")
    public String helloPage() {
        return "index";
    }

    //Mapowanie po wyslaniu formularza
    @RequestMapping(value = "/login", method = RequestMethod.POST) //
    public ModelAndView welcome(@RequestParam(value = "username") String login,
                                @RequestParam(value = "password") String password) {
        ModelAndView model = new ModelAndView();

        
        //Tutaj sprawdzamy poprawnosc loginu i hasla
        if (checkLoginAndPassword(login, password)) {
            //Jesli poprawne stosowna wiadomosc
            model.addObject("message", "Strona powitalna!");
            model.setViewName("add"); //view set
        } else {
            //Jesli nie poprawne wiadomosc
            model.addObject("message", "Login albo haslo niepoprawne");
            model.setViewName("login");
            
        }
        
        
        return model;
    }
    
    @RequestMapping(value = "/info")
    public ModelAndView print()
    {
    ModelAndView model = new ModelAndView();
    
    model.addObject("number" , rand());
    return model;
    
    }

    //Funkcja sprawdza poprawnosc loginu i hasla
    public boolean checkLoginAndPassword(String login, String password) {
        return MY_LOGIN.equals(login) && MY_PASSWORD.equals(password);
    }
    
    public int rand (){
        
        
        
        Random r = new Random();
        
        liczba_1 = r.nextInt(20);
        return liczba_1;
    }
    }


