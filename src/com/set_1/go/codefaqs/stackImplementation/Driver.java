package com.set_1.go.codefaqs.stackImplementation;

public class Driver {
    public static void main(String[] args) {
        CustomStack cs=new CustomStack();
        cs.push(1);
        cs.push(2);
        cs.push(3);
        cs.push(4);
        cs.push(5);
        cs.push(6);
        for (int x:cs.stack){
            System.out.print(x+" ");
        }
        System.out.println();

        int x1=cs.pop();
        System.out.println("pop "+x1);

        int x2=cs.peek();
        System.out.println("peek "+x2);

    }
}
