public class hot31 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);    // 先把左子树翻好
        TreeNode right = invertTree(root.right);  // 再把右子树翻好
        root.left = right;                        // 然后交换
        root.right = left;
        return root;

    }


}
