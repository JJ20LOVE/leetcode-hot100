import java.util.ArrayList;
import java.util.List;

public class hot39 {
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
    public void flatten(TreeNode root) {

        List<Integer> col= new ArrayList<>();
        List<Integer> list= frontSort(root,col);
        TreeNode init = new TreeNode();
        for (int i = 0; i < list.size(); i++) {
            init.left=null;
            init.right=new TreeNode(list.get(i));
            init = init.right;
        }
    }

    private List<Integer> frontSort(TreeNode root,List<Integer> list) {
        if(root==null) return null;
        list.add(root.val);
        frontSort(root.left,list);
        frontSort(root.right,list);
        return list;
    }
}
