public class DiameterOfBinaryTree {
    int diameter = 0;
    public int solve(TreeNode A) {
        height(A);
        return diameter;
    }

    public int height(TreeNode node){
        if(node == null){
            return -1;
        }
        int left = height(node.left);
        int right = height(node.right);
        diameter = Math.max(diameter, left+right+2);
        return Math.max(left, right) + 1;
    }
}
