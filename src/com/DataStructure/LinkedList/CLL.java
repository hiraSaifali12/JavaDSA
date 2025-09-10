package com.DataStructure.LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    public CLL(){
        this.head=null;
        this.tail=null;
    }
    private class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
    public void addFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;

    }
}
