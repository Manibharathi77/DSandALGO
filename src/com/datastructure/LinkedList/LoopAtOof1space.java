package com.datastructure.LinkedList;

import com.datastructure.LinkedList.SinglyLinkedList.Node;

public class LoopAtOof1space {

    static Node detectLoop(Node head) {

        // we can have two pointers. One moves at 1 pace, 2 moves at 2 pace.
        // 9, 8, 5, 22,
        //       2  66


        if (head == null || head.next == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;

    }

    public static void main(String[] args) {

        SinglyLinkedList dll2 = new SinglyLinkedList();
        dll2.insertData(dll2, 1);
        dll2.insertData(dll2, 2);
        dll2.insertData(dll2, 3);
        dll2.insertData(dll2, 4);
        dll2.insertData(dll2, 5);
        dll2.insertData(dll2, 6);
        dll2.insertData(dll2, 13);
        dll2.insertData(dll2, 14);
        dll2.insertData(dll2, 51);
        dll2.insertData(dll2, 61);
//        System.out.println(dll);

//        System.out.println(FindMidOfLinkedList.getMidValue(dll.head));
//        RemoveDuplicates.removeDuplicate(dll.head);
//        System.out.println("removed duplicated");
//        dll.iterateThrough(dll);
        dll2.head.next.next.next.next.next.next.next = dll2.head.next.next.next.next;
        Node result = detectLoop(dll2.head);
        System.out.println(result.data);

    }
}
