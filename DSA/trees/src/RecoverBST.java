public class RecoverBST {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;
    public void inorder(TreeNode A){
        if(A == null){
            return;
        }
        inorder(A.left);
        if(prev != null && prev.val > A.val){
            if(first == null){
                first = prev;
                second = A;
            }
            else{
                second = A;
            }
        }
        prev = A;
        inorder(A.right);
    }
}
