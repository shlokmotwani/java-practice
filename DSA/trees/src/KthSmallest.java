public class KthSmallest {
    public static TreeNode inorder(TreeNode node, int count, int K){
        if(node == null){
            return null;
        }
        inorder(node.left, count, K);
        count++;
        if(count == K){
            return node;
        }
        inorder(node.right, count, K);
        return null;
    }
}
