public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtPosition(int data, int position){
        Node newNode = new Node(data);
        Node temp = this.head;
        int count = 0;
        while(count < position-1){
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
