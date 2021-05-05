package com.datastructure;

/**
 * Node class def for the Demo class's singly linked list
 *
 */
public class DemoNode {

    private Demo demo;
    private DemoNode next;

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public DemoNode getNext() {
        return next;
    }

    public void setNext(DemoNode next) {
        this.next = next;
    }

    public DemoNode(Demo demo) {
        this.demo = demo;
    }

    @Override
    public String toString() {
        return "DemoNode{" +
                "demo=" + demo +
                ", next=" + next +
                '}';
    }
}
