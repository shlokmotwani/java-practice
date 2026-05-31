public class KthSmallest {
    static int count = 0;
    static TreeNode ans;

    public static void inorder(TreeNode node, int K){
        if(node == null || ans != null){
            return;
        }

        inorder(node.left, K);

        if(ans != null){
            return;
        }

        count++;
        if(count == K){
            ans = node;
            return;
        }

        inorder(node.right, K);
    }
}
