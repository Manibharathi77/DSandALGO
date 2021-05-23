package com.datastructure.LinkedList;

import com.datastructure.LinkedList.SinglyLinkedList.Node;

public class ReverseLinkedList {

    // implementation done in the singly linked list

    //  1 -> prev,  * 2 -> curr,  3 -> next,  4 *,   5

    public Node reverseBetween(Node head, int left, int right) {

        int count = 1;
        Node prev = new Node();

        Node curr = head;

        while(curr != null){

            if(count >= left && count < right){
                /**
                 * rectify the reversion logic.
                 */

                Node temp = curr.next; // points to 3
                curr.next = prev;
                prev.next = temp;

            }
            count++;
            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();
        SinglyLinkedList dll2 = new SinglyLinkedList();
        dll2.insertData(dll2, 1);
        dll2.insertData(dll2, 2);
        dll2.insertData(dll2, 3);
        dll2.insertData(dll2, 4);
        dll2.insertData(dll2, 5);

        rll.reverseBetween(dll2.head,2, 4);
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.iterateThrough(dll2);
    }

}
