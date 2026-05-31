public class LCA {
    public int lowestAncestor(TreeNode A, int B, int C){
        if(A == null){
            return 0;
        }

        if(A.val == B || A.val == C){
            return A.val;
        }

        int left = lowestAncestor(A.left, B, C);
        int right = lowestAncestor(A.right, B, C);
        if(left != 0 && right != 0){
            return A.val;
        }
        else if(left != 0){
            return left;
        }
        else if(right != 0){
            return right;
        }
        return 0;
    }
}
