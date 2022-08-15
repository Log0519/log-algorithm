package com.log.other.binaryTreeAlgorithm;


import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author Log
 * @Date 2022/8/15 9:15
 * TODO 二叉树的最小深度  --深度优先、广度优先
 * 给定一个二叉树，找出其小深度
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数
 */
public class O16_MinimumDepthOfBinaryTree {

    public static void main(String[] args) {

    }

    //深度优先 空间复杂度logN,取决于树的深度 时间O(N)
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right != null) {
            min = Math.min(minDepth(root.right), min);
        }

        return min + 1;
    }

    //广度优先 空间复杂度 O(N) 时间O(N)
    public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        //初始化深度
        root.deep = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) {
                return node.deep;
            }
            if (node.left != null) {
                node.left.deep = node.deep + 1;
                queue.offer(node.left);

            }
            if (node.right != null) {
                node.right.deep = node.deep + 1;
                queue.offer(node.right);
            }
        }
        return 0;
    }
}
