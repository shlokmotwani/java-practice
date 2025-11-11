public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10, 0);
        ll.insert(20, 1);
        ll.insert(30, 2);
        ll.insert(40, 3);
        ll.insert(50, 3);
        ll.insert(60, 3);
        ll.insert(70, 6);
        ll.insert(80, 7);
        ll.insert(90, 8);
        ll.insert(100, 9);

        ll.printLL();
        System.out.println(ll.retrieve(0));
        System.out.println(ll.retrieve(3));
        System.out.println(ll.retrieve(6));
        System.out.println(ll.retrieve(9));
        System.out.println(ll.retrieve(10));
    }
}