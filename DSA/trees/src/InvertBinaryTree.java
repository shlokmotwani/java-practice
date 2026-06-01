public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode A) {
        if(A == null){
            return A;
        }
        TreeNode temp = A.left;
        A.left = A.right;
        A.right = temp;
        invertTree(A.left);
        invertTree(A.right);
        return A;
    }
}
