/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examplee;

/**
 *
 * @author Matt
 */

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



public class AppConfig {
 
	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() {
	    DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
	    driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/products");
	    driverManagerDataSource.setUsername("root");
	    driverManagerDataSource.setPassword("Krak1234#");
	    return driverManagerDataSource;
	}
 
//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//	    viewResolver.setViewClass(JstlView.class);
//	    viewResolver.setPrefix("/WEB-INF/pages/");
//	    viewResolver.setSuffix(".jsp");
//	    return viewResolver;
//	}
 
}
