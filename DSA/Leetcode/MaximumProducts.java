
public class MaximumProducts {
    /**
 * Definition for a binary tree node.*/
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
 
// class Solution {
    private static final int MOD = 1_000_000_007;
    private long totalSum = 0;
    private long maxProduct = 0;

    public int maxProduct(TreeNode root) {
        totalSum = treeSum(root);
        computeSubtree(root);
        return (int) (maxProduct % MOD);
    }

    // First DFS: total sum
    private long treeSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }

    // Second DFS: subtree sums + product calculation
    private long computeSubtree(TreeNode node) {
        if (node == null) return 0;

        long left = computeSubtree(node.left);
        long right = computeSubtree(node.right);

        long subtreeSum = node.val + left + right;

        long product = subtreeSum * (totalSum - subtreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subtreeSum;
    }
}
// }
