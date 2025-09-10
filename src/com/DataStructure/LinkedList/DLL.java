package com.DataStructure.LinkedList;

public class DLL {
   private Node head;

   private class Node{
       int value;
       Node next;
       Node prev;
       public Node(int value){
           this.value=value;
       }
       public Node(int value,Node next,Node prev){
           this.value=value;
           this.next=next;
           this.prev=prev;
       }
   }

   public void addFirst(int value){
       Node node= new Node(value);
       node.next=head;
       node.prev=null;
       if(head!=null){
       head.prev=node;
       }
       head=node;
   }
   public void addLast(int value){
       Node node=new Node(value);
       Node last=head;

       if(head==null){
           head=node;
           node.prev=null;
           node.next=null;
       }
       while(last.next!=null){
           last=last.next;
       }
       last.next=node;
       node.prev=last;
       node.next=null;
   }
   //---insert at perticular index after the node
   public void insrt(int after,int value){
       Node p= find(after);
       if(p==null){
           System.out.println("Does not exits");
           return;
       }
       Node node=new Node(value);
       node.next=p.next;
       p.next=node;
       node.prev=p;
       if(node.next!=null){
       node.next.prev=node;
       }
   }
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
    //---------------------


    public void display(){
       Node node=head;
       Node last=null;

       System.out.println("---print in normal---");
       while(node!=null){
           System.out.print(node.value+" -> ");
           last=node; //here last will point to head
           node=node.next;
       }
       System.out.println("END (normal)");

       System.out.println("---print in reverse---");
       while(last!=null){
           System.out.print(last.value+" -> ");
           last=last.prev;
       }
       System.out.println("START (reverse)");
   }
}
