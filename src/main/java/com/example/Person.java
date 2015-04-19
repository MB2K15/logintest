/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;



/**
 *
 * @author Matt
 */
public class Person {
    
    
    private String Name;
    private int age ;
    private String Last_Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLast_name() {
        return Last_Name;
    }

    public void setLast_name(String Last_name) {
        this.Last_Name = Last_name;
    }
    

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", age=" + age + ", Last_Name=" + Last_Name + '}';
    }
    
    
    
}
