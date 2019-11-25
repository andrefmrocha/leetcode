class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer lower, Integer upper) {
        if (root == null)
            return true;
        if(lower != null && root.val <= lower) return false;
        if(upper != null && root.val >= upper) return false;

        return isValidBST(root.right, root.val, upper) &&
                isValidBST(root.left, lower, root.val);
    }
}