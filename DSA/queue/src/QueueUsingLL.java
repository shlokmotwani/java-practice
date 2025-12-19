import java.util.Iterator;
import java.util.LinkedList;

public class QueueUsingLL {
    private final LinkedList<Integer> ll = new LinkedList<Integer>();

    public void enqueue(int x){
        ll.addLast(x);
    }

    public int dequeue(){
        if(ll.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return ll.removeFirst();
    }

    public int front(){
        if(ll.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return ll.getFirst();
    }

    public int size(){
        return ll.size();
    }

    public boolean isEmpty(){
        return ll.isEmpty();
    }

    public void printQueue(){
        if(ll.isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        Iterator<Integer> iterator = ll.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
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
