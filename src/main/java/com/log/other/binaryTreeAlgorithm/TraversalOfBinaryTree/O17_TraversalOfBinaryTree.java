package com.log.other.binaryTreeAlgorithm.TraversalOfBinaryTree;

import com.log.other.binaryTreeAlgorithm.TreeNode;

import java.util.ArrayList;

/**
 * @Author Log
 * @Date 2022/8/15 11:44
 * TODO 二叉树遍历 -递归
 * 前序遍历：根左右
 * 中序遍历：左根右
 * 后序遍历：左右根
 * 层序遍历：从上往下，从左往右
 *
 * 递归遍历：使用递归方法遍历
 * 迭代遍历：使用迭代方法实现递归函数，与递归等价
 * morris遍历
 */
public class O17_TraversalOfBinaryTree {
    //前序遍历 根左右 递归
    //元素第一次成为栈顶的时候打印
    public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    //中序遍历 左根右 递归
    //元素第二次成为栈顶的时候打印
    public static void midOrder(TreeNode root){
        if(root==null){
            return;
        }
        midOrder(root.left);
        System.out.println(root.val);
        midOrder(root.right);
    }

    //后序遍历 左右根 递归
    //元素第三次成为栈顶的时候打印
    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    //层序遍历 递归
    public static void levelOrder(TreeNode root, int i, ArrayList list){
        if(root==null){
            return;
        }
        //进行填充
        int length=list.size();
        if(length<=i){
            for (int j = 0; j < i - length; j++) {
                list.add(length+j,null);
            }
        }

        list.set(i,root.val);
        levelOrder(root.left,i*2,list);
        levelOrder(root.right,i*2+1,list);
        System.out.println(root.val);
    }
}
