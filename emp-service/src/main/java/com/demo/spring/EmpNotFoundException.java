package com.demo.spring;

public class EmpNotFoundException extends RuntimeException {
    public EmpNotFoundException(String s) {
        super(s);
    }
}
