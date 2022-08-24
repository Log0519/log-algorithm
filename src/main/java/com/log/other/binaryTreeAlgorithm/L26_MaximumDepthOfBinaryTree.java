package com.log.other.binaryTreeAlgorithm;

/**
 * @Author Log
 * @Date 2022/8/24 12:55
 * TODO
 */
public class L26_MaximumDepthOfBinaryTree {
    //深度优先 空间复杂度logN,取决于树的深度 时间O(N)
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int max = Integer.MIN_VALUE;

        if (root.left != null) {
            max = Math.max(maxDepth(root.left), max);
        }
        if (root.right != null) {
            max = Math.max(maxDepth(root.right), max);
        }

        return max + 1;
    }

}
