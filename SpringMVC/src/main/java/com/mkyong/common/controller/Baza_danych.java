/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.common.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Matt
 */
public class Baza_danych {
    
    
    
    
    public static void main(String [] args)
    {
    
        try{
            
            
            String host = "jdbc:derby://localhost:1527/Produkty";
            String user = "customer";
            String password = "klient";
            Connection con = DriverManager.getConnection(host,user,password);
        } 
        
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    
    }
    
}
