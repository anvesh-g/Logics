package com.set_1.go.codefaqs.linkedlistimplementation;

public class Node {
    private int info;
    private Node link;

    public Node(int info) {
        this.info = info;
        this.link = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
