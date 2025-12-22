import java.util.ArrayList;

public class InOrder {
    public int[] inorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(A, result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public void inorder(TreeNode A, ArrayList<Integer> result){
        if(A == null){
            return;
        }
        inorder(A.left, result);
        result.add(A.val);
        inorder(A.right, result);
    }
}
