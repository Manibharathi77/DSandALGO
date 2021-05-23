package com.datastructure.LinkedList;

import com.datastructure.LinkedList.DoubleLinkedList.Node;
import java.util.HashMap;
import java.util.Map;

public class UnionAndIntersectionOfLinkedList {

    /**
     * Input:
     *    List1: 10->15->4->20
     *    list2:  8->4->2->10
     *
     * Output:
     *    Intersection List: 4->10
     *    Union List: 2->8->20->4->15->10
     */

    // Using hash map to put the values based on key(element data)
    // time complexity -> O(n+m) space complexity -> O(n+m)
    // union list -> just get all the keys.

    public static DoubleLinkedList getIntersection(DoubleLinkedList l1, DoubleLinkedList l2){

        DoubleLinkedList intersectionList = new DoubleLinkedList();

        HashMap<Integer, Integer> hashMap = mapToHashMap(l1,l2);
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > 1){
                intersectionList.insert(entry.getKey());
            }
        }

        return intersectionList;
    }

    public static DoubleLinkedList getUnion(DoubleLinkedList l1, DoubleLinkedList l2){
        DoubleLinkedList unionList = new DoubleLinkedList();

        HashMap<Integer, Integer> hashMap = mapToHashMap(l1,l2);
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            unionList.insert(entry.getKey());
        }

        return unionList;
    }

    private static HashMap<Integer, Integer> mapToHashMap(DoubleLinkedList l1, DoubleLinkedList l2) {

        Node head1 = l1.head;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while(head1 != null){
           if(hashMap.containsKey(head1.data)){
               hashMap.put(head1.data, hashMap.get(head1.data) + 1);
           } else hashMap.put(head1.data, 1);

           head1 = head1.next;
        }

        Node head2 = l2.head;
        while(head2 != null){
            if(hashMap.containsKey(head2.data)){
                hashMap.put(head2.data, hashMap.get(head2.data) + 1);
            } else hashMap.put(head2.data, 1);

            head2 = head2.next;
        }

        return hashMap;

    }


}
