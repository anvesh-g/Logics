package com.designPatterns.chainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest httpRequest){
        if(doHandle(httpRequest)){
            return;
        }
        if (this.next!=null)
            this.next.handle(httpRequest);

    }
    public abstract boolean doHandle(HttpRequest httpRequest);
}
