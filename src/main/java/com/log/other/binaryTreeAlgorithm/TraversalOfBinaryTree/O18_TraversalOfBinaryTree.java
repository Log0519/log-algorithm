package com.log.other.binaryTreeAlgorithm.TraversalOfBinaryTree;

import com.log.other.binaryTreeAlgorithm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author Log
 * @Date 2022/8/15 15：08
 * TODO 二叉树遍历 -迭代
 * 前序遍历：根左右
 * 中序遍历：左根右
 * 后序遍历：左右根
 * 层序遍历：从上往下，从左往右
 *
 * 递归遍历：使用递归方法遍历
 * 迭代遍历：使用迭代方法实现递归函数，与递归等价
 * morris遍历
 */
public class O18_TraversalOfBinaryTree {
    //前序遍历 根左右 迭代
    //元素第一次成为栈顶的时候打印
    public static void preorder(TreeNode root){
        if(root!=null ){
            Stack<TreeNode> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()){
                root=stack.pop();
                if(root!=null){
                    System.out.println(root.val);
                    stack.push(root.right);//push是压进去,add是继承的vector的方法，push是自身的
                    stack.push(root.left);
                }
            }
        }
    }

    //中序遍历 左根右 迭代
    //元素第二次成为栈顶的时候打印
    public static void midOrder(TreeNode root){
        if(root!=null ){
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty()||root!=null){
                if(root!=null) {
                    stack.push(root);
                    root = root.left;
                }else {
                    root=stack.pop();
                    System.out.println(root.val);
                    root=root.right;
                }
            }
        }
    }

    //后序遍历 左右根 迭代
    //元素第三次成为栈顶的时候打印
    public static void postOrder(TreeNode root){
        if(root!=null ){
            Stack<TreeNode> stack = new Stack<>();
            TreeNode prev=null;
            while (!stack.isEmpty()||root!=null){
                while (root!=null) {
                    stack.push(root);
                    root = root.left;
                }
                root=stack.pop();
                if(root.right==null||root.right==prev){
                    System.out.println(root.val);
                    prev=root;
                }else {
                    stack.push(root);
                    root=root.right;
                }
            }
        }
    }

    //层序遍历 迭代
    public static void levelOrder(TreeNode root, int i, ArrayList list){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode node= q.poll();
            if(node!=null){
                System.out.println(node.val);
                q.add(node.left);
                q.add(node.right);
        }
       }

    }
}
