package com.datastructure;

import java.util.Stack;

/**
 * Singly linked list implementation!
 */
public class CustomLinkedList {

    private DemoNode head;





    public void addToFront(Demo demo){
        DemoNode demoNode = new DemoNode(demo);
        demoNode.setNext(head);
        head = demoNode;
    }

    public DemoNode removeFromFront(){
        if(head == null){
            return null;
        }

        DemoNode removedNode = head;
        head = removedNode.getNext();
        removedNode.setNext(null);
        return removedNode;
    }

    public void printAll(){
        DemoNode current = head;

        while(current != null){
            System.out.print(current.getDemo());
            current = current.getNext();
        }
        System.out.println("null");
    }
}
