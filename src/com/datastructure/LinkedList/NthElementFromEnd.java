package com.datastructure.LinkedList;

import com.datastructure.LinkedList.DoubleLinkedList.Node;

public class NthElementFromEnd {

    // { 7, 9, 5, 3, 77, 4 } -. n = 2, -> 77

    // brute force approach -> reverse a linked list and get the nth value.
    // else, calculate the length of ll, use length - n formula.
    // using recursive approach.

    /**
     * Recursive approach.
     */

    static int count = 0;

    public static void getNthElement(Node node, int n){

        if(node == null)
            return;

        getNthElement(node.next, n);

        count++;

        if(count == n){
            System.out.println("nth data is - " + node.data);
        }

    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(99);
        dll.insert(7);
        dll.insert(7);
        dll.insert(4);
        dll.insert(9);
        dll.insert(5);

        NthElementFromEnd.getNthElement(dll.head, 3);

    }



}
