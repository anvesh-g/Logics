package com.set_1.go.classes;

import com.set_1.go.classes.Employee;

import java.util.*;
import java.util.stream.Collectors;

/*  In web applications  having multi sign in  functionality
    If we want to get recent login of same user by using timestamp
* */

public class RecentSignInUser {
    public static void main(String args[]){

        String sayHello="Hello";
        System.out.println(sayHello);
        List<Employee> list=new ArrayList<Employee>();
        list.add(new Employee(1,"A", System.currentTimeMillis()));
        list.add(new Employee(2,"B",System.currentTimeMillis()));
        list.add(new Employee(1,"A",System.currentTimeMillis()+1));
        list.add(new Employee(3,"C",System.currentTimeMillis()));
        list.add(new Employee(3,"C",System.currentTimeMillis()+2));

        for (Employee e:list) {
            System.out.println(e.getId()+"=> "+e.getName()+"=> "+e.getDate());
        }


        System.out.println("==================");

        List<Employee> dups=getDuplicates(list);

        for (Employee e:dups) {
            System.out.println(e.getId()+"=> "+e.getName()+"=> "+e.getDate());
        }

        System.out.println("==================");

        Map<Integer, Optional<Employee>> dupsList=dups.stream().collect(
                Collectors.groupingBy(Employee::getId,Collectors.maxBy(Comparator.comparingLong(Employee::getDate)))
        );
        // employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getDate)));


        dupsList.values().forEach(
                a-> System.out.println(a.get().getId()+"==> "+a.get().getName()+"==> "+a.get().getDate())
        );





    }

    public static List<Employee> getDuplicates(final List<Employee> personList) {
        return getDuplicatesMap(personList).values().stream()
                .filter(duplicates -> duplicates.size() > 1)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private static Map<Integer, List<Employee>> getDuplicatesMap(List<Employee> personList) {
        return personList.stream().collect(Collectors.groupingBy(Employee::getId));
    }
}
