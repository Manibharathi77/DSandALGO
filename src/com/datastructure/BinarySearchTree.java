package com.datastructure;

public class BinarySearchTree {

    /**
     * Should have the right side node greater than the root
     * and left node's value lesser than the roots value.
     */

    private static class Node{

        int key;
        Node leftNode, rightNode;

        Node(int key){
            this.key = key;
            leftNode = rightNode = null;
        }

    }


    Node root;

    BinarySearchTree(){
        root = null;
    }

    public void insertNode(int key){

     root = insertNodeRecursive(root, key);

    }

    private Node insertNodeRecursive(Node root, int key) {

        if(root == null){
            root = new Node(key);
            return root;
        }

        if(key > root.key){
            root.rightNode = insertNodeRecursive(root.rightNode, key);
        } else if(key < root.key){
            root.leftNode = insertNodeRecursive(root.leftNode, key);
        }

        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(9);
        bst.insertNode(77);
        bst.insertNode(5);
        bst.insertNode(66);
        bst.insertNode(109);
        System.out.println(bst);
    }


}
