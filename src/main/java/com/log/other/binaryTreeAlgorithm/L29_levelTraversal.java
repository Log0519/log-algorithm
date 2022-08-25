package com.log.other.binaryTreeAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author Log
 * @Date 2022/8/25 10:54
 * TODO 层序遍历
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 */
public class L29_levelTraversal {

        public List<List<Integer>> levelOrder(TreeNode root) {
            //边界条件判断
            if (root == null)
                return new ArrayList<>();
            //队列
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            //根节点入队
            queue.add(root);
            //如果队列不为空就继续循环
            while (!queue.isEmpty()) {
                //BFS打印，levelNum表示的是每层的结点数
                int levelNum = queue.size();
                //subList存储的是每层的结点值
                List<Integer> subList = new ArrayList<>();
                for (int i = 0; i < levelNum; i++) {
                    //出队
                    TreeNode node = queue.poll();
                    subList.add(node.val);
                    //左右子节点如果不为空就加入到队列中
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
                //把每层的结点值存储在res中，
                res.add(subList);
            }
            return res;
    }
}




