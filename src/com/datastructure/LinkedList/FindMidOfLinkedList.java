package com.datastructure.LinkedList;

import com.datastructure.LinkedList.DoubleLinkedList.Node;

public class FindMidOfLinkedList {

    // brute force approach -> traverse through once.
    // get the count and traverse again till count/2

    // Else have a two pointer approach. increment p1 by 1 node. p2 by 2 node.

    public static Node getMidValue(Node head){

        Node pointerOne = head;
        Node pointerTwo = head;

        if(pointerOne == null || pointerOne.next == null){
            return pointerOne;
        }

        // 8, 9, 10, 5, 6

        while(pointerTwo.next != null){

            if( pointerTwo.next.next == null){
                return pointerOne.next;
            } else pointerTwo = pointerTwo.next.next;

            pointerOne = pointerOne.next;
        }

        return pointerOne;

    }

    // 8, 9, 10, 5, 3, 8

}
