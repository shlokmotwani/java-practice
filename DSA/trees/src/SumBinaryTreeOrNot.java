public class SumBinaryTreeOrNot {
    public static int solve(TreeNode A) {
        int ans = postOrder(A);
        return ans == -1 ? 0 : 1;
    }

    public static int postOrder(TreeNode A){
        if(A == null){
            return 0;
        }

        if(A.left == null && A.right == null){
            return A.val;
        }

        int left = postOrder(A.left);
        if(left == -1){
            return -1;
        }

        int right = postOrder(A.right);
        if(right == -1){
            return -1;
        }

        if(left + right != A.val) {
            return -1;
        }

        return left + right + A.val;
    }

    public static void main(String[] args) {
        TreeNode ten = new TreeNode(10);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2);
        TreeNode two1 = new TreeNode(2);
        TreeNode two2 = new TreeNode(2);

        ten.left = four;
        ten.right = two;
        four.left = two1;
        four.right = two2;

        System.out.println(solve(ten));
    }
}
