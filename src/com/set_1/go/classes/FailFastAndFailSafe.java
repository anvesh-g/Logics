package com.set_1.go.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("a");
        name.add("b");
        name.add("c");
        name.add("d");
        name.add("e");
        FailFastAndFailSafe jfp=new FailFastAndFailSafe();
//        jfp.withFailFast(name);
        jfp.withFailSafe(name);

    }

    public void withFailFast(List<String> name){
        Iterator itr=name.iterator();
        int i=0;
        while(itr.hasNext()){
            i+=1;
            if(i==3){
                name.add("f");
            }
            System.out.println(itr.next());
        }
    }

    public void withFailSafe(List<String> name){
        CopyOnWriteArrayList<String> listOfNames=new CopyOnWriteArrayList(name);
        Iterator itr=listOfNames.iterator();
        while(itr.hasNext()){

            if(((String)itr.next()).equals("b")){
                listOfNames.add("test");
            }
        }
        System.out.println(listOfNames);
        System.out.println(name);
    }
}


