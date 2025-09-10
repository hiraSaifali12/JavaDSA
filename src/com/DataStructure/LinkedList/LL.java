package com.DataStructure.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    LL() {
        this.size = 0;
    }

    //-------------Node----------------------

    private class Node{
       private int value;
       private Node next;
       public Node (int value){
           this.value=value;
       }
       public Node (int value,Node next){
           this.value=value;
           this.next=next;
       }

    }

    //-------------Insert----------------------

    public void addFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
        //TC-constant

    }
    public void addLast(int value){
        Node node=new Node(value);
        if(tail==null){
            addFirst(value);
        }
        tail.next=node;
        tail=node;
        size++;
        //TC-constant

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
        //TC- On
    }
    public void addInbt(int value,int index){
        if(index == 0){
            addFirst(value);
            return;
        }
        if(index == size){
            addLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
           temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;

    }
    //-------------Delete----------------------

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
      Node secondlast =get(size-2);
        int val = tail.value; // this will remove by garbage collector letter on
        tail=secondlast;
        tail.next=null;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteInBt(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev= get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;

        return val;
        //TC - On
    }

    //--find the value is present or not and return the index

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node= node.next;
        }
        return null;
        // TC- On
    }

}
