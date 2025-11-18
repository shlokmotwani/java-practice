public class Stack {
    private final int[] stack;
    private final int capacity;
    private int top;

    public Stack(int size){
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int data){
        if(top == capacity-1){
            System.out.println("Stack overflow!!");
            return;
        }
        top++;
        stack[top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop. Stack is empty!");
            return -1;
        }
        int item = stack[top];
        top--;
        return item;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Cannot peek. Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top < 0;
    }

    public int size(){
        return (top+1);
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        for(int i = 0; i<= top; i++){
            System.out.println(stack[i]);
        }
    }
}
