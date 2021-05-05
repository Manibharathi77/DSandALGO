package com.datastructure.LinkedList;


public class DoubleLinkedList {

    Node head;

    static class Node{

        int data;
        Node prev,next;

        Node(int data){
            this.data = data;
            prev = next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public Node insert(int data){

        Node currentNode = head;

        if(currentNode == null){
            head = new Node(data);
        } else {
            // find the last value where the next data = null
            while(currentNode != null){

                if(currentNode.next == null){
                    Node newNode = new Node(data);
                    currentNode.next = newNode;
                    newNode.prev = currentNode;
                    break;
                }
                currentNode = currentNode.next;
            }
        }

        return head;

    }

    public void iterateThrough(DoubleLinkedList ll){

        DoubleLinkedList.Node currentNode = ll.head;

        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insert(9);
        dll.insert(7);
        dll.insert(7);
        dll.insert(4);
        dll.insert(9);
//        dll.insert(5);
//        dll.insert(88);
//        dll.insert(89);
//        dll.insert(90);

//        System.out.println(dll);

//        System.out.println(FindMidOfLinkedList.getMidValue(dll.head));
        RemoveDuplicates.removeDuplicate(dll.head);
        System.out.println("removed duplicated");
        dll.iterateThrough(dll);
//        dll.head.next.next = dll.head.next;
//        System.out.println(LoopInLinkedList.detectLoop(dll.head));
    }

}
