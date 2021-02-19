package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


@Aspect
@Component
public class AppLoging {

    ArrayList<String> methods = new ArrayList<>();
    @Before("execution(public void com.example.demo.*.*(..))")
    public void beforeAnyMethod(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        methods.add(methodSignature.toString());
    }

    @After("execution(public void com.example.demo.Dao.*())")
    public void afterAnyMethod() {
        Set<String> set = new HashSet<String>(methods);
        for (String s: set) {
            System.out.println(s + ": " + Collections.frequency(methods, s));
        }
    }
}
