package com.set_1.go.classes;

import java.util.Scanner;

public class AllPossibleSubstringsOfAString {
    //Program to get All possible substring of a string
    //Note: Total possible substrings of a string of length n is n*(n+1)/2

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String inputString=sc.next();
        char[] arrString=inputString.toCharArray();
        method1(arrString,arrString.length);
        method2(inputString);
        method3(arrString);

    }

    public static void method1(char[] arr,int n){
        for(int lenght=1; lenght<=n;lenght++){
            for(int i=0;i<=n-lenght;i++){
                int j= i + lenght - 1;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }

    }

    public static void method2(String inputString){
        //not recommended for interviews
        for(int i=0;i<inputString.length();i++) {
            for(int j=i+1;j<=inputString.length();j++){
                System.out.println(inputString.substring(i,j));
            }
        }
    }

    public static void method3(char[] arr){
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<=arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
