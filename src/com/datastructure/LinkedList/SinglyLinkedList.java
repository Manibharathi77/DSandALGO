package com.datastructure.LinkedList;

public class SinglyLinkedList {

    Node head;

    // a linked list must have a node type.
    // should have methods to insert into the linkedList.
    // method to delete a node.
    // traverse through the nodes.

    static class Node {

        Node(){}

        int data;
        Node next; //pointer to next node. will be null if only or last node.

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

        // Method to insert data into the LL.

        public Node insertData(SinglyLinkedList ll, int data){

            Node newNode = new Node(data);
            Node currentNode;

            if(ll.head == null){
                return ll.head = newNode;
            } else {
                currentNode = ll.head;
                while(currentNode.next != null){
                    currentNode = currentNode.next;
                }
                currentNode.next = new Node(data);
            }

            return currentNode.next;
        }

        public void insertAfterNode(Node node, int data){

            Node newNode = new Node(data);

            if (node.next != null) {
                newNode.next = node.next;
            }
            node.next = newNode;
        }

    /**
     *  Find a value - O(n) time complexity.
     */

    public boolean isPresent(SinglyLinkedList ll, int data){

        Node currentNode = ll.head;

        while(currentNode != null){
            if(currentNode.data == data){
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    /**
     * Delete by value
     */

    public boolean deleteValue(SinglyLinkedList ll, int value){

        // head has that value.

        Node currentNode = ll.head;

        if(ll.head.data == value){
            ll.head = ll.head.next;
            return true;
        } else{
            while(currentNode.next != null){
                if(currentNode.next.data == value){
                    currentNode.next = currentNode.next.next;
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Iterator for the linked list (singly linked list)
     */

    public void iterateThrough(SinglyLinkedList ll){

        Node currentNode = ll.head;

        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

    }

    /**
     * Reverse a linked list
     */

    public Node reverseLL(Node currentNode){
        // { 8, 10, 3} -> { 3, 10, 8 }

        Node nextNode;
        Node previousNode = null;

        while(currentNode != null){

            nextNode = currentNode.next; // 2
            currentNode.next = previousNode; // null
            previousNode = currentNode;
            currentNode = nextNode;

        }

        currentNode = previousNode;
        return currentNode;

    }


    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertData(ll, 8);
        Node node = ll.insertData(ll, 10);
        ll.insertData(ll, 3);
//        ll.insertAfterNode(node, 1000);
        ll.iterateThrough(ll);
//        ll.deleteValue(ll, 8);
//        ll.iterateThrough(ll);
        ll.reverseLL(ll.head);
        System.out.println(" ");
        System.out.println(" after reversing the nodes");
        ll.iterateThrough(ll);
//        System.out.println(ll.isPresent(ll, 10));
//        System.out.println(ll.isPresent(ll, 9));
    }


}
