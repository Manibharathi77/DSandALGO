package com.datastructure.StackAndQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ReversingNElementsOfQueue {

    /*
    1) Can be done recursively.
      ->> 8, 9, 10, 3, 2, 6
     */
    static int counter = 0;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static Queue<Integer> reverseNElements(int n, Queue<Integer> queue){

        // Make a recursive call upto N elements.
        if(counter == n) return queue;

        counter++;
        arrayList.add(queue.remove());

        reverseNElements(n, queue);

        if(counter >= 0) queue.add(arrayList.get(--counter));

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(2);queue.add(1);
        queue.add(4);queue.add(5);
        queue.add(6);queue.add(7);

        queue.forEach(System.out::println);

        System.out.println("After");
        reverseNElements(3, queue).forEach(System.out::println);

    }

}
