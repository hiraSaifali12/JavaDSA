package com.DataStructure.Trees.BinaryTrees;

import com.SystemDesign.SOLID.InterfaceForLiskov;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterationInTree {
static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
static class BinaryTree{
    static int idx=-1;
    public static Node BuildTree(int[] nodes){
        idx++;
        if(nodes[idx]==-1) return null;
        Node newNode=new Node(nodes[idx]);
        newNode.left=BuildTree(nodes);
        newNode.right=BuildTree(nodes);
        return newNode;
    }
}
public static List<Integer> preOrder(Node root){
    //root,left,right
    List<Integer> res=new ArrayList<>();
    if(root==null) return res;
    Stack<Node> st=new Stack<>();
    st.push(root);
    while(!st.isEmpty()){
    Node val=st.pop();
    res.add(val.data);
   if(val.right!=null){
        st.push(val.right);
    }
   if(val.left!=null){
            st.push(val.left);
   }
    }
    return res;
}
public static List<Integer> inOrder(Node root){
    //left root right
    List<Integer> res=new ArrayList<>();
    Stack<Node>st=new Stack<>();
   Node node=root;
    while(node!=null || !st.isEmpty()){
        while(node!=null){
            st.push(node);
            node=node.left;
        }
       node= st.pop();
        res.add(node.data);
        node=node.right;
    }
    return res;
}
public static List<Integer> postOrder2Stack(Node root){
    List<Integer> res=new ArrayList<>();
    if(root==null) return res;
    Stack<Node> st1=new Stack<>();
    Stack<Node> st2=new Stack<>();
    st1.push(root);
    while(!st1.isEmpty()){
        Node cur =st1.pop();
        st2.push(cur);
        if(cur.left!=null) st1.push(cur.left);
        if(cur.right!=null) st1.push(cur.right);
    } while(!st2.isEmpty()){

        res.add(st2.pop().data);
    }
    return res;
}
public static List<Integer> postOrder(Node root){
    List<Integer> res=new ArrayList<>();
    if(root==null) return res;
    Stack<Node>st=new Stack<>();
    Node cur=root;
    while(cur!=null|| !st.isEmpty()){
        if(cur!=null){
            st.push(cur);
            cur=cur.left;
        }
        else{
            Node temp= st.peek().right;
            if(temp==null){
                 temp=  st.peek();
                 st.pop();
                res.add(temp.data);
                while(st.isEmpty() && temp==st.peek().right){
                    temp=st.pop();
                    res.add(temp.data);
                }

            }
            else{
                cur=temp;
            }

        }

    }
    return res;
}
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree BT=new BinaryTree();
       Node root= BT.BuildTree(nodes);
        System.out.println(root.data);

      //  List<Integer> result =preOrder(root);
       // System.out.println("preOrder:"+result);
      //  List<Integer>res=inOrder(root);
      //  System.out.println("inOrder:"+res);
        //List<Integer> PostRes= postOrder2Stack(root);
      //  System.out.println("post order using 2 stack :"+ PostRes);
        List<Integer> PostRes1= postOrder(root);
         System.out.println("post order using 1 stack :"+ PostRes1);

 }
}
