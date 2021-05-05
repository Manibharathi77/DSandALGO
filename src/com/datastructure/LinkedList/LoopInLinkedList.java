package com.datastructure.LinkedList;

import com.datastructure.LinkedList.DoubleLinkedList.Node;

import java.util.HashSet;

public class LoopInLinkedList {

    // if two nodes have a same node as next node, then there might be a loop..

    public static boolean detectLoop(Node head){

        HashSet<Node> hashSet = new HashSet<>();
        Node currentNode = head;

        while(currentNode != null){
            if(hashSet.contains(currentNode)){
                return true;
            } else {
                hashSet.add(currentNode);
                currentNode = currentNode.next;
            }
        }

        return false;
    }

}
