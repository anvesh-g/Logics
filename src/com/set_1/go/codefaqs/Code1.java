package com.set_1.go.codefaqs;

public class Code1 {
    public static void main(String[] args) {
        System.out.println("Started Main");
        try{
            try{
                System.out.println("Inner try");
                int c=7/0;
            }catch (IllegalArgumentException e){
                System.out.println("Inner Exception");
                e.printStackTrace();
            }finally {
                System.out.println("Inner finally");
            }
        }catch (ArithmeticException e){
            System.out.println("outer Exception");
            e.printStackTrace();
        }finally{
            System.out.println("outer finally");
        }
    }
}
