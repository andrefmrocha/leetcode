import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        levelOrder(root, 0, list);   
        return list;
    }

    private void levelOrder(TreeNode root, int depth, List<List<Integer>> list) {
        if(root == null)
            return;
        if(depth == list.size())
            list.add(new ArrayList<>());
        List<Integer> orderList = list.get(depth);
        orderList.add(root.val);
        levelOrder(root.left, depth + 1, list);
        levelOrder(root.right, depth + 1, list);
    }
}