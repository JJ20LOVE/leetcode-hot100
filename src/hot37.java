import java.util.ArrayList;
import java.util.List;

public class hot37 {

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

    public int kthSmallest(TreeNode root, int k) {

        List<Integer> list = new ArrayList<>();
        List<Integer> colled = col(root, list);
        return colled.get(k-1);


    }
    public List<Integer> col(TreeNode root, List<Integer> list){
        if(root==null) return null;
        col(root.left,list);
        list.add(root.val);
        col(root.right,list);
        return list;
    }
}
