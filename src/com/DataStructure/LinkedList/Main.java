package com.DataStructure.LinkedList;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        //-- single Linked List-----


    /*LL list=new LL();
    list.addFirst(3);
    list.addFirst(2);
    list.addFirst(8);
    list.addFirst(17);
    list.addFirst(20);
    //list.addLast(99);
    //list.addLast(101);
    //list.addInbt(100,3);
    list.display();
    //list.deleteFirst();
    //System.out.println(list.deleteFirst());
   // list.display();
    //System.out.println(list.deleteLast());
   // list.display();
        // System.out.println(list.deleteInBt(2));
       // list.find(2);

        System.out.println(list.find(2) != null ? list.find(2) : "Not Found");


        list.display();
        */


        //------Doubly LinkedList

       DLL dll=new DLL();
       dll.addFirst(4);
       dll.addFirst(8);
       dll.addFirst(3);
       dll.addFirst(5);
       dll.addFirst(9);

       dll.addLast(30);
       dll.insrt(3,77);
       dll.display();












    }
}
