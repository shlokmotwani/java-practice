import java.util.ArrayList;

public class PreOrderTraversal {
    public int[] preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(A, result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public void preorder(TreeNode A, ArrayList<Integer> result){
        if(A == null){
            return;
        }
        result.add(A.val);
        preorder(A.left, result);
        preorder(A.right, result);
    }
}
