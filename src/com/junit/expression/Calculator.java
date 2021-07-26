package com.junit.expression;

public class Calculator {
    public int evaluate(String expression){
        int sum=0;
        for(String value:expression.split("\\+")){
            sum-=Integer.parseInt(value);
        }
        return sum;
    }
}
