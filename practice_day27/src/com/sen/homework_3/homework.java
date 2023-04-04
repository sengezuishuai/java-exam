package com.sen.homework_3;

public class homework extends Object {
}


interface Vehicles{
    default void work(){
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {

        }

    }
}

