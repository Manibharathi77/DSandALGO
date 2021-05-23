package com.datastructure.StackAndQueue;


public class TwoStackUsingOneArray {

    /**
     * Todo:
     * have two stacks with push and pop operation.
     * Declare one Array.
     * Make use of the array in push and pop operation.
     */

    public static int[] commonArray;
    static int stackOneStart;
    static int stackOneEnd;
    static int stackTwoStart;
    static int stackTwoEnd;


    TwoStackUsingOneArray(int n){
        commonArray = new int[n];
        stackTwoStart = n-1;
        stackTwoEnd = n;
        stackOneStart = 0;
        stackOneEnd = -1;
    }

    public boolean isSpaceAvailable(){
        return stackOneEnd != (stackTwoEnd-1);
    }

    /**
     * Pushes to stack one
     */
    public void push1(int x){

        if(isSpaceAvailable()){
            stackOneEnd++;
            commonArray[stackOneEnd] = x;
        } else {
            throw new ArrayIndexOutOfBoundsException
                    ("Stack is filled. Create new Stack");
        }

    }

    /**
     * Pushes to stack two
     */
    public void push2(int x){

        if(isSpaceAvailable()){
            stackTwoEnd--;
            commonArray[stackTwoEnd] = x;
        } else {
            throw new ArrayIndexOutOfBoundsException
                    ("Stack is filled. Create new Stack");
        }

    }

    public int pop1() throws Exception {
        if(stackOneEnd != stackOneStart)
            return commonArray[stackOneEnd--];
        else throw new Exception("Push some value to pop!");
    }

    public int pop2() throws Exception {
        if(stackTwoEnd != stackTwoStart)
            return commonArray[stackTwoEnd++];
        else throw new Exception("Push some value to pop!");
    }

    public static void main(String[] args) throws Exception {
        TwoStackUsingOneArray ts = new TwoStackUsingOneArray(6);
        ts.push1(11); // 0
        ts.push1(12); // 1
        ts.push1(13); // 2
        ts.push1(14);
        ts.push2(99); // 5
        ts.push2(98); // 4
//        ts.push2(97); // 3
//        ts.push2(96); //
//        ts.push2(95);

        System.out.println("Popped value 1 : "+ts.pop1());
        System.out.println("Popped value 2 : "+ts.pop2());

    }

}
