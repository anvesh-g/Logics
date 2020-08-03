package com.set_1.go.codefaqs.stackImplementation;

public class CustomStack {
    public static final int SIZE_OF_STACK=6;
    public int top=-1;
    int stack[]=new int[SIZE_OF_STACK];

    public boolean push(int number){
        if(top>SIZE_OF_STACK){
            System.out.println("Stack overflow");
            return false;
        }else{
            stack[++top]=number;
            System.out.println("Element inserted into the stack");
            return true;
        }
    }

    public int pop(){
        if(top<0){
            System.out.println("stack underflow");
            return -1;
        }else{
            int x=stack[top--];
            return x;
        }
    }

    public int peek(){
        if(top<0){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int x=stack[top];
            return x;
        }
    }
}
