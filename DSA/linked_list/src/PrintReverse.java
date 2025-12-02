import java.util.ArrayList;

public class PrintReverse {
    public void solve(ListNode A) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = A;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        int N = list.size();
        for(int i=N-1; i>= 0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
