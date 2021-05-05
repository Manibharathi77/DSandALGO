package com.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DSG {

        static class Stack {
            // Two inbuilt queues
            static Queue<Integer> q1 = new LinkedList<>();
            static Queue<Integer> q2 = new LinkedList<Integer>();

            // To maintain current number of
            // elements
            static int curr_size;

            Stack()
            {
                curr_size = 0;
            }

            static void push(int x)
            {
                curr_size++;

                // Push x first in empty q2
                q2.add(x);

                // Push all the remaining
                // elements in q1 to q2.
                while (!q1.isEmpty()) {
                    q2.add(q1.peek());
                    q1.remove();
                }

                // swap the names of two queues
                Queue<Integer> q = q1;
                q1 = q2;
                q2 = q;
            }

            static void pop()
            {

                // if no elements are there in q1
                if (q1.isEmpty())
                    return;
                q1.remove();
                curr_size--;
            }

            static int top()
            {
                if (q1.isEmpty())
                    return -1;
                return q1.peek();
            }

            static int size()
            {
                return curr_size;
            }
        }

        // driver code
        public static void main(String[] args)
        {


            java.util.Stack<Integer> stack
                    = new java.util.Stack<Integer>();

            java.util.Queue<Integer> queue = new LinkedList<>();

            queue.add(11);
            queue.add(22);
            queue.add(33);

            System.out.println("poll" + queue.poll());

            queue.remove();

            System.out.println("peek after removing" +queue.peek());

            Iterator itrQ = queue.iterator();

            while(itrQ.hasNext()){
                System.out.println(itrQ.next());
            }

            System.out.println("++++++++");


            stack.add(20);
            stack.add(50);
            stack.add(77);

            System.out.println(stack.peek());

            Iterator itr = stack.iterator();

            while (itr.hasNext()){
                System.out.println(itr.next());
            }


//            Stack s = new Stack();
//            s.push(1);
//            s.push(2);
//            s.push(3);
//
//            System.out.println("current size: " + s.size());
//            System.out.println(s.top());
//            s.pop();
//            System.out.println(s.top());
//            s.pop();
//            System.out.println(s.top());
//
//            System.out.println("current size: " + s.size());
        }
    }
// This code is contributed by Prerna


