package com.set_1.go.classes;

import com.set_1.go.interfaces.Add;
import com.set_1.go.interfaces.ConstructorRef;
import com.set_1.go.interfaces.LengthOfString;
import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

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
        //Sort map based on keys
        System.out.println(sortMapBasedOnKeys());
        //get Element count in the list
        System.out.println(getElementCount(25));
        //difference between two lists
        System.out.println(getDifferenceBetweenTwoLists());
        //get distinct values from list
        System.out.println(getDistinctValuesFromList());
        //return elements which satisfies the predicate
        IntPredicate condition = a-> a>5;
        System.out.println(getElementsSatisfyingTheCondition(condition));
        //get duplicate values from list
        BiPredicate<List<Integer>,Integer> p = (List<Integer> list,Integer element) -> list.stream().filter(i -> i == element).count() > 1;
        System.out.println(getDuplicateValuesFromList(p));

        //get Duplicate elements with count
        System.out.println(getDuplicateElementsWithCount());

        //sort characters in string
        System.out.println(sortCharactersInString("anvesh"));
        //alternate Uppercase lowercase in string
        System.out.println(alternateUpperLowerString("anvesh"));
        //count lower case letters in a string
        System.out.println(getCountOfLowerCaseLetters("AnvesH"));

        //diff between map and flatmap
        List<String> li=new ArrayList<>();
        li.add("STACKK");
        li.add("OOVVERRFLOW");
        mapVsFlatMap(li);

        //getLatestRecordFromDuplicateRecords
        //first get duplicate records based on id then get latest from duplicates based on date
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"A", System.currentTimeMillis()));
        list.add(new Employee(2,"B",System.currentTimeMillis()));
        list.add(new Employee(1,"A",System.currentTimeMillis()+1));
        list.add(new Employee(3,"C",System.currentTimeMillis()));
        list.add(new Employee(3,"C",System.currentTimeMillis()+2));
        getLatestRecordFromDuplicateRecords(list).forEach(
                a->{
                    System.out.println(a.get().getId()+"=> "+a.get().getName()+"=> "+a.get().getDate());
                }
        );

    }

    public static void mapVsFlatMap(List<String> li){
        List<String[]> li2=li.stream().map(s->s.split("")).distinct().collect(Collectors.toList());
        List<Stream<String>> li3=li.stream().map(s->s.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(li2+"\n"+li3);
        List<String> li4=li.stream().map(s->s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println("-- "+li4);

    }

    private static List<Optional<Employee>> getLatestRecordFromDuplicateRecords(List<Employee> listOfEmployees){
        return listOfEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getId))
                .values()
                .stream()
                .filter(employees -> employees.size() > 1)
                .flatMap(Collection::stream)
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Employee::getId,Collectors.maxBy(Comparator.comparingLong(Employee::getDate))))
                .values().stream().collect(Collectors.toList());

    }

    public static int getCountOfLowerCaseLetters(String text){
//        Arrays.stream(text.toCharArray()).filter(i-> i >= 97 && i <= 122).count();
        return 0;
    }

    public static String alternateUpperLowerString(String text){
        AtomicInteger count= new AtomicInteger();
        return Arrays.stream(text.split("")).map(i-> count.get() % 2 == 0 ? text.charAt(count.get())+"".toUpperCase() : text.charAt(count.get())+"".toLowerCase()).peek(i-> count.getAndIncrement())
                .collect(Collectors.joining());
    }


    public static String sortCharactersInString(String input) {
        return Arrays.stream(input.split("")).sorted().collect(Collectors.joining());
    }

    public static Map<Integer,Long> getDuplicateElementsWithCount(){
        return getElements().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

    public static List<Integer> getDuplicateValuesFromList(BiPredicate<List<Integer>,Integer> p){
        return getElements().stream().filter(i->p.test(getElements(),i)).distinct().collect(Collectors.toList());

    }


    public static List<Integer> getElementsSatisfyingTheCondition(IntPredicate condition){
        return getElements().stream().filter(a->condition.test(a)).collect(Collectors.toList());
    }

    public static List<Integer> getDistinctValuesFromList(){
        return getElements().stream().distinct().collect(Collectors.toList());
    }

    public static List<Integer> getDifferenceBetweenTwoLists(){
        return getElements2().stream().filter(a->getElements().contains(a)).collect(Collectors.toList());
    }

    public static long getElementCount(int element){
        return getElements().stream().filter(a->a==element).count();
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

    public static Map<Integer,String> sortMapBasedOnKeys(){
        Map<Integer,String> map=new LinkedHashMap<>(getSampleMap());
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2));
        return map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,LinkedHashMap::new));
    }

    public static List<Integer> getElements() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(25);
        list.add(25);
        return list;
    }

    public static List<Integer> getElements2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(0);
        list.add(15);
        list.add(5);
        list.add(45);
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

    public static Map<Integer,String> getSampleMap(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(23,"A");
        map.put(42,"B");
        map.put(18,"C");
        map.put(15,"D");
        map.put(10,"E");
        map.put(20,"F");
        return map;
    }

}
