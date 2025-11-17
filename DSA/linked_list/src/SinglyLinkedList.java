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

    public Node deleteFirst(){
        if(this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        return temp;
    }

    public Node deleteLast(){
        if(this.head == null){
            return null;
        }

        // when list size is 1
        if(this.head.next == null){
            Node temp = this.head;
            this.head = null;
            return temp;
        }

        Node temp = this.head;
        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        Node result = temp.next;
        temp.next = null;
        return  result;
    }

    public Node deleteAtPosition(int position){
        if(position < 0){
            return null;
        }
        if(position == 0){
            deleteFirst();
        }
        int count = 0;
        Node current = this.head;
        Node previous = null;
        while(current != null && count < position){
            previous = current;
            current = current.next;
            count++;
        }
        if(current == null){
            return null;
        }
        previous.next = current.next;
        return current;

    }

    public boolean contains(int target){
        if(this.head == null){
            return false;
        }

        Node temp = this.head;
        while (temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int findPosition(int target){
        if(this.head == null){
            return -1;
        }

        Node temp = this.head;
        int position = 0;
        while(temp != null){
            if(temp.data == target){
                return position;
            }
            position++;
            temp = temp.next;
        }
        return -1;
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
