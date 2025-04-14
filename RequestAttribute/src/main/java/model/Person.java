package model;

//JavaBean has 3 roles:

import java.io.Serializable;

/*
 * 1. Implements Serializable
 * 2. No arg constructor
 * 3. Private members w/ getters and setters
 */
public class Person implements Serializable {
    private String firstname;
    private String lastname;
    private int age;

    public Person(){
        this.firstname = "Bob";
        this.lastname = "Jenkins";
        this.age = 28;
    }

    public Person(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    //For the firstname
    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //For the lastname
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //For the age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
