import java.util.*;

public class LevelOrder {
    public static int[][] levelOrderTraversal(TreeNode A) {
        List<int[]> result = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offerLast(A);
        while(!q.isEmpty()){
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

        int[][] postOrderResult = levelOrderTraversal(ten);
        for(int[] temp: postOrderResult){
            System.out.println(Arrays.toString(temp));
        }
    }
}
