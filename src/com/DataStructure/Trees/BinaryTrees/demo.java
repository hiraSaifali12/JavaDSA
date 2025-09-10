package com.DataStructure.Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class demo {
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
    public static Node Build(int[] nodes){
        idx++;
        if(nodes[idx]==-1) return null;
        Node node=new Node(nodes[idx]);
       node.left=Build(nodes);
       node.right=Build(nodes);
       return node;
    }
}
public static void preorder(Node node){
    if(node==null) return;
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);


}
public static void inorder(Node node){
    if(node==null) return;
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);

}
public static void postorder(Node node){
    if(node==null) return ;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data+" ");

}

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt =new BinaryTree();
      Node root=  bt.Build(nodes);
        //System.out.println(root.data);
        preorder(root);
        inorder(root);
        postorder(root);

    }
}

