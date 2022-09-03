package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflection {

    public static void getFilesNmaeAndType(){
        Field[] files = Person.class.getDeclaredFields();
        for (int i = 0; i < files.length; i++) {
            if(Modifier.isPublic(files[i].getModifiers())){
                String result = String.format("Type:%s Name:%s",files[i].getType(),files[i].getName());

                System.out.println(result);
            }



        }


    }
}
