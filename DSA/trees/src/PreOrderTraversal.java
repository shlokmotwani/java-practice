import java.util.ArrayList;
import java.util.Arrays;

public class PreOrderTraversal {
    public static int[] preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(A, result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void preorder(TreeNode A, ArrayList<Integer> result){
        if(A == null){
            return;
        }
        result.add(A.val);
        preorder(A.left, result);
        preorder(A.right, result);
    }

    public static void main(String[] args) {
        TreeNode ten = new TreeNode(10);
        TreeNode five = new TreeNode(5);
        TreeNode fifteen = new TreeNode(15);
        TreeNode three = new TreeNode(3);
        TreeNode eight = new TreeNode(8);
        TreeNode twelve = new TreeNode(12);

        ten.left = five;
        ten.right = fifteen;
        five.left = three;
        five.right = eight;
        fifteen.right = twelve;

        int[] preOrderResult = preorderTraversal(ten);
        System.out.println(Arrays.toString(preOrderResult));
    }
}
