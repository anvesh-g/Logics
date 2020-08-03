package com.set_1.go.codefaqs.linkedlistimplementation;

public class Driver {
    public static void main(String[] args) {
        SingleLinkedList linkedList=new SingleLinkedList();
        int arr[]={1,2,4,5};

        linkedList.insertElementInTheList(arr);
        linkedList.numberOfNodesInTheList();
        linkedList.traverseElementsIntheList();
        linkedList.insertAfterKthNode(2,3);
        linkedList.insertAtFirst(0);
        linkedList.insertAtLast(6);
        linkedList.traverseElementsIntheList();
        System.out.println("============");
        linkedList.deleteFirstNode();
        linkedList.deleteLastNode();
        linkedList.traverseElementsIntheList();
        linkedList.deleteKthNode(3);
        linkedList.traverseElementsIntheList();

        System.out.println(" circular ");

        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);

        n1.setLink(n2);
        n2.setLink(n3);
        n3.setLink(n4);
        n4.setLink(n5);
        n5.setLink(n2);


        boolean isCircular=linkedList.isCircularList(n1);
        System.out.println(isCircular);
        int length=linkedList.lenghtOfCircularList(n1);
        System.out.println("Total length "+length);

        SingleLinkedList linkedList2=new SingleLinkedList();
        linkedList2.insertElementsInCircularList(arr);
    }
}
