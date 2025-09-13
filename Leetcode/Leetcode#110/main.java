// Definition for a binary tree node.
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }

public class Solution { 
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return findBalance(root) != -1;
    }

    public int findBalance(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // Stop case, -1
        int leftDepth = findBalance(root.left);
        if (leftDepth == -1) {
            return -1;
        }
        int rightDepth = findBalance(root.right);
        if (rightDepth == -1) {
            return -1;
        }

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
