package com.log.linkedList.day2022_8_10;

import com.log.linkedList.ListNode;

/**
 * @Author Log
 * @Date 2022/8/10 10:42
 * TODO 删除链表中的节点
 * 请编写一个函数，用于 删除单链表中某个特定节点 。在设计函数时需要注意，
 * 你无法访问链表的头节点head ，只能直接访问 要被删除的节点 。
 * 题目数据保证需要删除的节点 不是末尾节点 。
 */
public class L21_DeleteANodeInTheLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public void deleteNode(ListNode node) {
            //把要删除结点的下一个结点的值赋给要删除的结点
            node.val = node.next.val;
            //然后删除下一个结点
            node.next = node.next.next;
        }
    }
}
