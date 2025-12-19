public class QueueUsingArray {
    private int[] arr;
    private int capacity;
    private int size;
    private int front;
    private int rear;

    public QueueUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        front = -1;
        rear = -1;
    }

    public void enqueue(int x){
        if(size == capacity){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue(){
        if(size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        front = (front + 1) % capacity;
        size--;
        return arr[front];
    }

    public int front(){
        if(size == 0){
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[(front+1)%capacity];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void printQueue(){
        int temp = (front + 1) % capacity;
        while(temp != rear){
            System.out.print(arr[temp] + " ");
            temp = (temp + 1) % capacity;
        }
        System.out.println(arr[temp]);
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.printQueue();
        System.out.println(q.front());
        q.dequeue();
        q.dequeue();
        q.printQueue();
        q.enqueue(80);
        q.enqueue(90);
        q.dequeue();
        q.printQueue();
    }
}
