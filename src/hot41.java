public class hot41 {
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

    public int pathSum(TreeNode root, int targetSum) {

        if(root == null) return 0;
        return pathSum(root.left,targetSum)+pathSum(root.right,targetSum)+countForm(root,targetSum);
    }

    private int countForm(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int count=0;
        if(root.val==targetSum) count++;
        count+= countForm(root.left,targetSum-root.val);
        count+=countForm(root.right,targetSum-root.val);
        return count;
    }
}
