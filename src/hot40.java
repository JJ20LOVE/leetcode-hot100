import java.util.Arrays;

public class hot40 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0) return null;
        TreeNode head = new TreeNode(preorder[0]);
        int k = 0;
        while(inorder[k]!=preorder[0]){
            k++;
        }
        head.left= buildTree(Arrays.copyOfRange(preorder,1,k+1),Arrays.copyOfRange(inorder,0,k));
        head.right=buildTree(Arrays.copyOfRange(preorder,k+1,preorder.length),Arrays.copyOfRange(inorder,k,inorder.length));
        return head;
    }
}
