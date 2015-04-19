/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baza_danych;


import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author Matt
 */
public class Baza_danych {


    public static void main(String[] args) {


        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.apache.derby.jdbc.EmbeddedDriver");
        dataSource.setUrl("jdbc:derby:c:\\temp\\database\\test01;create=true");
        dataSource.setUsername("");
        dataSource.setPassword("");

    }

}
