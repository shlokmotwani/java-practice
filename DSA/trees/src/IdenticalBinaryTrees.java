public class IdenticalBinaryTrees {
    public int isSameTree(TreeNode A, TreeNode B) {
        if(A == null && B == null){
            return 1;
        }
        if(A == null || B == null){
            return 0;
        }
        if(A.val != B.val){
            return 0;
        }
        if(isSameTree(A.left, B.left) == 0){
            return 0;
        }
        return isSameTree(A.right, B.right);
    }
}
