package com.set_1.go.classes;

import com.set_1.go.interfaces.Add;
import com.set_1.go.interfaces.ConstructorRef;
import com.set_1.go.interfaces.LengthOfString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleLambdaExpressions {

    public void SimpleLambdaExpressions(){
        System.out.println("Printing constructor");
    }

    public static void main(String args[]) {
        // Addition of two numbers
        System.out.println(addition(10, 20));
        //Get length of input String
        System.out.println(getLength("Hello Welcome!!"));
        //Implementing  Runnable interface
        multiThreading();
        //Sort Elements of the list in Ascending order
        System.out.println(sortElementsOfListInAsc());
        //Sort Elements of the list in Descending order
        System.out.println(sortElementOfListInDesc());
        //Even number From List
        System.out.println(getEvenNumbersFromList());
        //Convert Elements of list to upper case
        System.out.println(convertCityNamesToUpperCase());
        //Multiplication of two numbers
        System.out.println(multiplicationOfTwoNumbers(2,3));
        //Return elements which are even and divisible by 5
        System.out.println(evenAndDivisibleByFive());
        //Addition by method reference
        System.out.println(addByMethodRef(10,20));
        //Constructor reference
        System.out.println(constructorRef());
        //Sort elements of the list using streams
        System.out.println(sortElementsOfListUsingStreams());
        //get even numbers from list using streams
        System.out.println(evenNumbersFromListUsingStreams());
        //convert elements to upper case using streams
        System.out.println(elementsToUpperCaseUsingStream());
        //get minimum element from list
        System.out.println(getMinFromList());
        //get maximum element from list
        System.out.println(getMaxFromList());
        //convert list to array
        System.out.println(convertListToArray());

    }

    public static int addition(int a, int b) {
        Add add = (x, y) -> x + y;
        return add.add(a, b);
    }

    public static int getLength(String s) {
        LengthOfString l = x -> x.length();
        return l.getLength(s);
    }

    public static void multiThreading() {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread " + i);
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread " + i);
        }
    }

    public static List<Integer> sortElementsOfListInAsc(){
        List<Integer> list = getElements();
        Collections.sort(list, (a,b) -> (a > b) ? 1 : (a < b) ? -1 : 0);
        return list;
    }

    public static List<Integer> sortElementOfListInDesc(){
        List<Integer> list=getElements();
        Collections.sort(list,(a,b)-> (a>b) ? -1 : (a<b) ? 1 : 0);
        return list;
    }

    public static List<Integer> getEvenNumbersFromList(){
        List<Integer> evenNumbers=new ArrayList<Integer>();
        Predicate<Integer> p=  x -> x % 2 == 0;
        for (int x:getElements()) {
            if(p.test(x)){
                evenNumbers.add(x);
            }
        }
        return evenNumbers;
    }

    public static List<String> convertCityNamesToUpperCase(){
        List<String> cities=new ArrayList<String>();
        Function<String,String> func = x -> x.toUpperCase();
        for (String eachCity:getListOfCities()) {
            cities.add(func.apply(eachCity));
        }
        return cities;
    }

    public static int multiplicationOfTwoNumbers(int a, int b){
        BiFunction<Integer,Integer,Integer> biFunc= (x,y) -> x*y;
        return biFunc.apply(a,b);
    }

    public static List<Integer> evenAndDivisibleByFive(){
        List<Integer> evenAndDivByFive=new ArrayList<Integer>();
        Predicate<Integer> evenPredicate = x -> x%2==0;
        Predicate<Integer> divisibleByFivePredicate= x -> x%5 ==0;
        for (Integer i:getElements()) {
            if(evenPredicate.and(divisibleByFivePredicate).test(i)){
                evenAndDivByFive.add(i);
            }
        }
        return evenAndDivByFive;
    }

    public static int addByMethodRef(int a,int b){
        Add add=SimpleLambdaExpressions::addition;
        return add.add(a,b);
    }

    public static SimpleLambdaExpressions constructorRef(){
        ConstructorRef c=SimpleLambdaExpressions::new;
        return c.getSomething();
    }

    public static List<Integer> sortElementsOfListUsingStreams(){
        return getElements().stream().sorted((a,b)-> (a > b) ? 1 : (a < b) ? -1 : 0).collect(Collectors.toList());
    }

    public static List<Integer> evenNumbersFromListUsingStreams(){
        return getElements().stream().filter(a->a%2==0).collect(Collectors.toList());
    }

    public static List<String> elementsToUpperCaseUsingStream(){
        return getListOfCities().stream().map(x->x.toUpperCase()).collect(Collectors.toList());
    }

    public static int getMinFromList(){
        return getElements().stream().sorted().min((a,b) -> (a > b) ? 1 : (a <  b) ? -1 :0).get();
    }

    public static int getMaxFromList(){
        return getElements().stream().sorted().max((a,b) -> (a > b) ? 1 : (a <  b) ? -1 :0).get();
    }

    public static Integer[] convertListToArray(){
        return getElements().stream().toArray(Integer[]::new);
    }

    public static List<Integer> getElements() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(25);
        return list;
    }

    public static List<String> getListOfCities(){
        List<String> list=new ArrayList<String>();
        list.add("Hyderabad");
        list.add("Pune");
        list.add("Bangalore");
        list.add("Chennai");
        list.add("Mumbai");
        return list;
    }

}
