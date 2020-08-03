package com.set_1.go.codefaqs.linkedlistimplementation;

public class SingleLinkedList {
    private Node start;

    public SingleLinkedList() {
        this.start = null;
    }

    public boolean isCircularList(Node node){
        boolean isCircular=false;
        if(node== null){
            //If node is null it is considered as circular
            isCircular=true;
            return isCircular;
        }else{
            //Hare and Tortoise Algorithmcircular
            Node slow=node;
            Node fast = node;
            boolean isFirst=true;
            while(slow!=null){
                if(!isFirst && slow==fast){

                    isCircular=true;
                    break;
                }
                slow=slow.getLink();
                fast= fast.getLink().getLink()!=null ? fast.getLink().getLink():null;
                isFirst=false;
            }
        }
        return isCircular;
    }

    public int lenghtOfCircularList(Node node){
        int length=0;
        int slowCount=0;
        int fastCount=0;
        if(node== null){
            //If node is null it is considered as circular
            return length;
        }else{
            //Hare and Tortoise Algorithm
            Node slow=node;
            Node fast = node;
            boolean isFirst=true;
            while(slow!=null){
                if(!isFirst && slow==fast){
                    int lengthOfCycle=lenghtOfCycle(slow,fast);
                    int lengthOfNoCycle=lenghtOfNoCycle(slow,node);

                    System.out.println("Length of cycle "+lengthOfCycle);
                    System.out.println("Length of no cycle "+lengthOfNoCycle);
                    break;
                }
                slow=slow.getLink();
                fast= fast.getLink().getLink()!=null ? fast.getLink().getLink():null;
                isFirst=false;
            }
        }

        return length;
    }

    public void insertElementsInCircularList(int arr[]){
        for (int a:arr) {
            Node n= new Node(a);
            if(this.start==null){
                //first element
                this.start=n;
                this.start.setLink(this.start);
            }else{
                Node temp=this.start;
                n.setLink(temp);
                while(temp.getLink()!=this.start){
                    temp=temp.getLink();
                }
                temp.setLink(n);
            }
            this.start=n;
        }
        System.out.println(isCircularList(this.start));
    }

    public int lenghtOfNoCycle(Node slow,Node node){
        int length=0;
        while(length==0 || node!=slow){
            node=node.getLink();
            slow=slow.getLink();
            length++;
        }
        return length;
    }

    public int lenghtOfCycle(Node slow,Node fast){
        int length=0;
        while(length==0 || fast!=slow){
            fast=fast.getLink();
            length++;
        }
        return length;
    }

    public void deleteKthNode(int k){
        if(k==1){
            deleteFirstNode();
        }else{
            if(this.start==null){
                System.out.println("Empty list");
            }else{
                int position=1;
                Node p=this.start;
                while(p!=null){
                    if(position==k-1){
                        p.setLink(p.getLink().getLink());

                        break;
                    }else{
                        p=p.getLink();
                        position++;
                    }
                }
            }
        }
    }

    public void deleteLastNode(){
        if(this.start==null){
            System.out.println("List is empty");
        }else{
            Node p=this.start;
            while(p.getLink().getLink()!=null){
                p=p.getLink();
            }
            p.setLink(null);
        }
    }

    public void deleteFirstNode(){
        if(this.start==null){
            System.out.println("List is empty");
        }else{
            this.start=this.start.getLink();
        }
    }

    public void insertAfterKthNode(int n,int data){
        Node temp=new Node(data);
        if(this.start==null){
            if (n==0){
                this.start=temp;
            }else{
                System.out.println("List is empty and element cannot be inserted after "+n +"th position");
            }
        }else{
            int position=1;
            Node p=this.start;
            while(p!=null){
                if(position==n){
                    temp.setLink(p.getLink());
                    p.setLink(temp);
                    break;
                }else{
                    p=p.getLink();
                    position++;
                }
            }
        }

    }

    public void insertAtFirst(int number){
        Node temp=new Node(number);
        if(this.start==null){
            this.start=temp;
        }else{
            temp.setLink(this.start);
            this.start=temp;
        }

    }

    public void insertElementInTheList(int arr[]){
        for (int element: arr) {
            if(this.start==null){
                Node temp=new Node(element);
                this.start=temp;
            }else{
                insertAtLast(element);
            }

        }
    }

    public void insertAtLast(int n){
        Node temp=new Node(n);
        if(this.start==null){
            this.start=temp;
        }
        Node p=this.start;
        while(p.getLink()!=null){
            p=p.getLink();
        }
        p.setLink(temp);
    }

    public void traverseElementsIntheList(){
        Node p;
        if(this.start == null){
            System.out.println("List is Empty");
            return;
        }
        System.out.print("List is : ");
        p=start;
        while(p!=null){
            System.out.print(p.getInfo()+" ");
            p=p.getLink();
        }
        System.out.println();
    }

    public void numberOfNodesInTheList(){
        Node p;
        int numberOfNodes=0;
        if(this.start==null){
            System.out.println("List is Empty ");
            return;
        }
        p=this.start;
        while(p!=null){
            numberOfNodes++;
            p=p.getLink();
        }
        System.out.println("Number of Node in the list are "+numberOfNodes);
    }

    public void checkIfElementPresentInTheList(int number){
        Node p;
        int position=1;
        if(this.start==null){
            System.out.println("List is empty- element not found");
        }
        p=this.start;
        while(p!=null){
            if(p.getInfo() == number){
                System.out.println("Element fount at position "+position);
                break;
            }else{
                position++;
                p=p.getLink();
            }
        }
        if(p==null){
            System.out.println("Element not present in the list");
        }
    }

    public Node getLastNodeOfTheList(){
        Node p;
        if(this.start==null){
            System.out.println("List is empty");
            return null;
        }
        p=this.start;
        while(p!=null){
            p=p.getLink();
        }
        return p;
    }

    public Node secondLastNodeOfTheList(){
        Node p;
        if(this.start==null){
            System.out.println("No elements are present in the list");
            return null;
        }else{
            p=this.start;
            while(p.getLink().getLink()!=null){
                p=p.getLink();
            }
            return p;
        }
    }

    public Node getNodeWithParticularInfo(int number){
        Node p;
        if (this.start==null){
            System.out.println("List is empty");
            return null;
        }
        p=this.start;
        while(p!=null && p.getInfo()!=number){
            p=p.getLink();
        }

        return p;
    }

    public Node getPreNodeWithParticularInfo(int number){
        Node p;
        if (this.start==null){
            System.out.println("List is empty");
            return null;
        }
        p=this.start;
        while(p!=null && p.getLink().getInfo()!=number){
            p=p.getLink();
        }
        return p;
    }

    public Node findReferenceToTheNodeAtKthPos(int k){
        Node p;
        if(this.start==null){
            System.out.println("List is empty");
            return null;
        }
        p=this.start;
        int position=1;
        while(p!=null){
            if(position==k){
                break;
            }else{
                p=p.getLink();
                position++;
            }
        }
        return p;
    }
}
