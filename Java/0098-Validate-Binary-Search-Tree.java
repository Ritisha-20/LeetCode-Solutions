/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> p = new ArrayList<>();
    boolean ch = true;

    void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        p.add(root.val);
        inorder(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for (int i = 0; i < p.size() - 1; i++) {
            if (p.get(i) >= p.get(i + 1)) {
                ch = false;
                break;
            }
        }
        return ch;
    }

}