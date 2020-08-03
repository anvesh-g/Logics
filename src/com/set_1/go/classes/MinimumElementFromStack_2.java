package com.set_1.go.classes;

import java.util.Stack;

// From already inserted stack
public class MinimumElementFromStack_2 {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<Integer>();
        s1.add(5);
        s1.add(3);
        s1.add(1);
        s1.add(2);
        s1.add(0);
       int min=getMinimumElement(s1);
        System.out.println("Minimum element "+min);
    }

    public static int getMinimumElement(Stack<Integer> s1){
        Integer minimumElement=null;
        Stack<Integer> minimumStack=new Stack<Integer>();
        for (int i=0;i<s1.size();i++) {
            if(minimumStack.isEmpty()){
                minimumStack.push(s1.pop());
            }else{
                if(minimumStack.peek()>s1.peek()){
                    minimumStack.push(s1.pop());
                }else{
                    s1.pop();
                }
            }
        }
        minimumElement=minimumStack.peek();

            return minimumElement;


    }
}
