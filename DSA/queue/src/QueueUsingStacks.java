import java.util.Stack;

public class QueueUsingStacks {
    static Stack<Integer> stackA;
    static Stack<Integer> stackB;

    QueueUsingStacks() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    /** Push element X to the back of queue. */
    static void push(int X) {
        stackA.push(X);
    }

    /** Removes the element from in front of queue and returns that element. */
    static int pop() {
        if(stackB.empty()){
            while(!stackA.empty()){
                stackB.push(stackA.pop());
            }
        }
        return stackB.pop();
    }

    /** Get the front element of the queue. */
    static int peek() {
        if(stackB.empty()){
            while(!stackA.empty()){
                stackB.push(stackA.pop());
            }
        }
        return stackB.peek();
    }

    /** Returns whether the queue is empty. */
    static boolean empty() {
        return stackA.size()+stackB.size() == 0;
    }
}