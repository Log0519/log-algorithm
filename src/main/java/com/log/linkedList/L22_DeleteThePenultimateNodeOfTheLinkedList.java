package com.log.linkedList;

import com.log.linkedList.ListNode;

/**
 * @Author Log
 * @Date 2022/8/10 17:23
 * TODO 删除链表的倒数第N个节点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class L22_DeleteThePenultimateNodeOfTheLinkedList {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode pre = head;
            int last = length(head) - n;
            //如果last等于0表示删除的是头结点
            if (last == 0)
                return head.next;
            //这里首先要找到要删除链表的前一个结点
            for (int i = 0; i < last - 1; i++) {
                pre = pre.next;
            }
            //然后让前一个结点的next指向要删除节点的next
            pre.next = pre.next.next;
            return head;
        }

        //求链表的长度
        private int length(ListNode head) {
            int len = 0;
            while (head != null) {
                len++;
                head = head.next;
            }
            return len;
        }
    }
}
