package com.set_1.go.codefaqs.customExceptions;

public class Driver {
    public static void main(String[] args) {
        Driver driver=new Driver();
        try {
            driver.divide(10,0);
        } catch (MyOwnException e) {
            e.printStackTrace();
        }
        try {
            driver.divide(10,1);
        } catch (MyOwnException e) {
            e.printStackTrace();
        }


    }

    public void divide(int a, int b) throws MyOwnException{
        if(b==0){
            throw new MyOwnException("Divide by Zero not possible");
        }else{
            System.out.println(a/b);
        }

    }
}
