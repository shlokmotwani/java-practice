import java.util.PriorityQueue;

public class OrderProcessor {
    private PriorityQueue<Order> queue;

    public OrderProcessor(){
        this.queue = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        this.queue.add(order);
    }

    public void processOrder(){
        Order order = this.queue.poll();
        if(order == null){
            return;
        }
        System.out.println("Processing order: " + order.getId());
    }

    public int getSize(){
        return this.queue.size();
    }
}
