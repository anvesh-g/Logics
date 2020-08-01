package com.designPatterns.visitor;

public class Driver {
    public static void main(String[] args) {
        HtmlDocument document=new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.exeute(new HighlightOperation());
        document.exeute(new PlainTextOpertaion());
    }
}

