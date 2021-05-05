package com.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    public static class Stack{

        ArrayList<Integer> arrayList = new ArrayList<>();

        Queue<Integer> Q1 = new LinkedList<>();
        Queue<Integer> Q2 = new LinkedList<>();



        public Queue<Integer> push(int x){



            /**
             * Add new object to q2
             */

            Q2.add(x);

            /**
             * Transfer the q1 objects to q2 before clearing the q1.
             * // first -> 4 3 2 1 -> last
             */

            while(!Q1.isEmpty()){
                Q2.add(Q1.peek());
                Q1.remove();
            }

            /**
             * Swap the q1 and q2.
             */

            Queue<Integer> q = Q1;
            Q1 = Q2;
            Q2 = q;


            return Q1;
        }

        /**
         * Making the pop operation costly
         */

        public Queue<Integer> pop(){




            return Q1;
        }

    }


}
