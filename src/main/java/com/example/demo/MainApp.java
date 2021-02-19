package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Dao dao = context.getBean("dao", Dao.class);

        dao.showLines();
        dao.showNumbers();
        dao.showString();
        dao.showString();

        context.close();
    }
}
