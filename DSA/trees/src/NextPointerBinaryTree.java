public class NextPointerBinaryTree {
    public void connect(TreeLinkNode root) {
        TreeLinkNode dummy = new TreeLinkNode(-1);
        TreeLinkNode temp = dummy;
        TreeLinkNode curr = root;

        while(curr != null){
            if(curr.left != null){
                temp.next = curr.left;
                temp = temp.next;
            }
            if(curr.right != null){
                temp.next = curr.right;
                temp = temp.next;
            }
            curr = curr.next;
            if(curr == null){
                curr = dummy.next;
                dummy.next = null;
                temp = dummy;
            }
        }
    }
}
