package com.designPatterns.behavioralPatterns.iterator;

public class ListIterator implements Iterator<String>{

    private BrowserHistory browserHistory;
    private int index;

    public ListIterator(BrowserHistory browserHistory){
        this.browserHistory=browserHistory;
    }

    @Override
    public boolean hasNext() {
        return (index < browserHistory.getUrls().size());
    }

    @Override
    public String current() {
        return browserHistory.getUrls().get(index);
    }

    @Override
    public void next() {
        index++;
    }
}
