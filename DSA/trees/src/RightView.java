import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class RightView {
    public int[] solve(TreeNode A) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        ArrayList<Integer> result = new ArrayList<>();
        dq.offerLast(A);
        while(dq.size() != 0){
            int size = dq.size();
            for(int i=0; i<size; i++){
                TreeNode current = dq.pollFirst();
                if(i == size-1){
                    result.add(current.val);
                }
                if(current.left != null){
                    dq.offerLast(current.left);
                }
                if(current.right != null){
                    dq.offerLast(current.right);
                }
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }
}
