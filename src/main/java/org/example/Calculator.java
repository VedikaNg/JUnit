package org.example;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        try{
            return a/b;
        } catch (Exception e) {
            System.out.println("Division --> ERROR");
            return -1;
        }

    }
}
