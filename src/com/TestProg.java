package com;

import com.datastructure.CustomLinkedList;
import com.datastructure.Demo;

public class TestProg {

    public static void main(String[] args) {
        Demo d1 = new Demo(1, "demoOne");
        Demo d2 = new Demo(2, "demoTwo");
        Demo d3 = new Demo(3, "demoThree");

        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addToFront(d1);
        customLinkedList.addToFront(d2);
        customLinkedList.addToFront(d3);

        customLinkedList.printAll();

        customLinkedList.removeFromFront();

        customLinkedList.printAll();

    }
}
