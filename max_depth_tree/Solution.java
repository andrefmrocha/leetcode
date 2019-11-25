class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    int maxDepth(TreeNode root, int i) {
        if(root == null)
            return i;
        int left = maxDepth(root.left, i + 1);
        int right = maxDepth(root.right, i + 1);
        if (left <= right) {
            return right;
        }
        return left;
    }
}

