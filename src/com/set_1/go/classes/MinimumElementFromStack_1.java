package com.set_1.go.classes;

import java.util.Scanner;
import java.util.Stack;

//Minimum element from stack with O(1) while insertion
public class MinimumElementFromStack_1 {
    public static void main(String[] args) {
        Stack s1=new Stack<>();
        Integer minimumElement=null;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want to insert in the stack");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" element ");
            int element=sc.nextInt();
            if(s1.isEmpty()){
                minimumElement=element;
                s1.push(element);
            }else {
                if(minimumElement>element){
                    minimumElement=element;
                }
                s1.push(element);
            }
        }

        System.out.println("minimun element "+minimumElement);


    }
}
