public class hot36 {
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

    private long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(!isValidBST(root.left)) return false;
        if(root.val<=prev) return false;

        prev=root.val;
        return isValidBST(root.right);
    }
}
