import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LevelOrder {
    public int[][] solve(TreeNode A) {
        List<int[]> result = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offerLast(A);
        while(q.size() != 0){
            int size = q.size();
            int[] temp = new int[size];
            for(int i=0; i<size; i++){
                TreeNode current = q.pollFirst();
                temp[i] = current.val;
                if(current.left != null){
                    q.offerLast(current.left);
                }
                if(current.right != null){
                    q.offerLast(current.right);
                }
            }
            result.add(temp);
        }

        return result.toArray(new int[result.size()][]);
    }
}
