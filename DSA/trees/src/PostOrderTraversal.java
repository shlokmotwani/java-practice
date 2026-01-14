import java.util.ArrayList;
import java.util.Arrays;

public class PostOrderTraversal {

    public static int[] postOrderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        postOrder(A, result);
        return result.stream().mapToInt(x -> x).toArray();
    }


    public static void postOrder(TreeNode A, ArrayList<Integer> result){
        if(A == null){
            return;
        }
        postOrder(A.left, result);
        postOrder(A.right, result);
        result.add(A.val);
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

        int[] postOrderResult = postOrderTraversal(ten);
        System.out.println(Arrays.toString(postOrderResult));
    }
}
