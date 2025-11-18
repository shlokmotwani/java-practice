//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        int i = 100;
        while(i < 1200){
            stack.push(i);
            i += 100;
        }
        System.out.println("--------Stack before any operations-----------");
        stack.print();

        System.out.println("------------------------------------------------");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("--------Stack after popping two items-----------");
        stack.print();
        System.out.println("------------------------------------------------");
        System.out.println("Peek once: " + stack.peek());
        System.out.println("Peek twice: " + stack.peek());
        System.out.println("Stack size: " + stack.size());


    }
}