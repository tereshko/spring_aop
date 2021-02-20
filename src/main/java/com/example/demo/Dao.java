package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Dao {

    public void showString() {
        System.out.println("Test app");
    }

    public void showNumbers() {
        System.out.println("1111");
    }

    public void showLines() {
        for (int i=0; i<=999; i++){

        }
        System.out.println("-------");
    }

}
