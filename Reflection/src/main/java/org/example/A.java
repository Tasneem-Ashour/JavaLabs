package org.example;

public class A {
    public  static int getAattributeNumber(){
        var person = new Person();
         int length = person.getClass().getDeclaredFields().length;
        return length;
    }
}
