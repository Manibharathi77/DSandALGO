package com.datastructure.LinkedList;
import com.datastructure.LinkedList.SinglyLinkedList.Node;

public class PalindromeLinkedList {

    // {9, 7, 0, 4, 0, 7, 9} palindrome

    // two pointer approach. with stack to copy first half to stack
    // and compare the next half to stack.

    // recursive approach. o(n) time complexity.
    // O(n) space complexity -> if call stack is taken into account.

    /**
     * recursive approach
     */


    static Node left;

    public boolean isPalindrome(Node head) {

        left = head;

        return isPalindromeUtil(head);

    }

    public boolean isPalindromeUtil(Node right){

        if(right == null){
            return true;
        }

        boolean isp1 = isPalindromeUtil(right.next);

        if(!isp1){
            return false;
        }

        boolean isp = (left.data == right.data);

        left = left.next;

        return isp;
    }

    public static void main(String[] args) {
        SinglyLinkedList dll2 = new SinglyLinkedList();
        dll2.insertData(dll2, 1);
        dll2.insertData(dll2, 2);
        dll2.insertData(dll2, 2);
        dll2.insertData(dll2, 1);
        PalindromeLinkedList pl = new PalindromeLinkedList();
        System.out.println(pl.isPalindrome(dll2.head));
    }
}
