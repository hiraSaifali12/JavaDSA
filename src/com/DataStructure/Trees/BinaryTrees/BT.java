package com.DataStructure.Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BT {
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
        public static Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx]==-1) return null;
           Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right =buildtree(nodes);
            return newNode;
        }
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }
    public static void inOrder(Node root){
        if(root==null) return ;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node delNode = q.remove();
            if(delNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(delNode.data+" ");
                if(delNode.left !=null){
                   q.add(delNode.left);
                }
                if(delNode.right!=null){
                   q.add(delNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildtree(nodes);
        //System.out.println(root.data);
        //preOrder(root);
        // postOrder(root);
        //inOrder(root);
        levelOrder(root);
    }
}
