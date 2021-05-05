package com.datastructure.LinkedList;
import com.datastructure.LinkedList.DoubleLinkedList.Node;

import java.util.HashSet;


public class RemoveDuplicates {

    // {7, 9, 8, 7, 6, 5} -> {7, 9, 8, 6, 5}

    // using the hashset to remove the duplicates and delete the repeat node.

    public static void removeDuplicate(Node head){

//        Node currentNode = head;
        HashSet<Integer> hashSet = new HashSet<>();

        while(head != null){
            // 10, 7, 4, 7, 7, 8
            if(hashSet.contains(head.data)){
                //remove the current node
                Node prev = head.prev;
                Node next = null;
                if(head.next != null) {
                    next = head.next;
                    next.prev = prev;
                }
                prev.next = next;

            } else hashSet.add(head.data);

            head = head.next;

        }


    }


}
