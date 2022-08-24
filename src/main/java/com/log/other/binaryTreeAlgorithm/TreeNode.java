package com.log.other.binaryTreeAlgorithm;

/**
 * @Author Log
 * @Date 2022/8/15 10:57
 * TODO
 */
public class TreeNode {
    public int deep;
    public int val;
    public TreeNode left;//左孩子
    public TreeNode right;//右孩子

    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode() {}

    public TreeNode(int val,TreeNode left,TreeNode right) {
        this.right=right;
        this.left=left;
        this.val = val;
    }

}
