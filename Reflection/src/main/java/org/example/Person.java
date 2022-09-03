package org.example;

import java.util.Date;

public class Person {
    public  String Name ;
    public  int Age ;
    private Date DOB;

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public Person() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
