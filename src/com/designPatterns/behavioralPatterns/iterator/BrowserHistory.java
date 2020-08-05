package com.designPatterns.behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> urls=new ArrayList<>();

    public void push(String url){
        this.urls.add(url);
    }

    public String pop(){
        var lastIndex=this.urls.size()-1;
        var lastUrl=urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public List<String> getUrls() {
        return urls;
    }
}
