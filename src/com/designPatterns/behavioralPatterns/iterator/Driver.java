package com.designPatterns.behavioralPatterns.iterator;

public class Driver {
    public static void main(String[] args) {
        var history=new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        Iterator<String> itr=history.createIterator();
        while (itr.hasNext()){
            var url=itr.current();
            System.out.println(url);
            itr.next();
        }

    }
}
