public class LinkedList {
    public Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insert(int data, int position){
        if(position < 0){
            return;
        }
        Node x = new Node(data);
        if(this.head == null){
            this.head = x;
            return;
        }
        if(position == 0){
            x.next = this.head;
            this.head = x;
            return;
        }

        int count = 0;
        Node temp = this.head;
        while(count < position - 1){
            temp = temp.next;
            count++;
        }
        if(temp != null){
            x.next = temp.next;
            temp.next = x;
        }
    }

    public void printLL(){
        Node temp = this.head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp.data);
            sb.append("->");
            temp = temp.next;
        }
        sb.append("NULL");
        System.out.println(sb.toString());
    }
}
