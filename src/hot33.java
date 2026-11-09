public class hot33 {
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

    private int result=0;

    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null) return 0;
        depth(root);
        return result;
    }

    private int depth(TreeNode root) {

        if(root==null) return 0;
        int lefthigh=depth(root.left);
        int righthigh=depth(root.right);
        result= Math.max(result,lefthigh+righthigh);
        return Math.max(lefthigh,righthigh)+1;
    }


}
