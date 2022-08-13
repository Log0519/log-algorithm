package com.log.linkedList.day2022_8_10;

import com.log.linkedList.ListNode;

/**
 * @Author Log
 * @Date 2022/8/10 18:16
 * TODO 反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class L23_ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    //递归思路
//    class Solution {
//        public ListNode reverseList(ListNode head) {
//            if(head==null||head.next==null){
//                return head;
//            }
//
//            ListNode new_head = reverseList(head.next);
//
//            head.next.next=head;
//            head.next=null;
//
//            return new_head;
//        }
//    }
    //双链表思路
    class Solution{
        public ListNode reverseList(ListNode head) {
            //新链表
            ListNode newHead = null;
            while (head != null) {
                //先保存访问的节点的下一个节点，保存起来
                //留着下一步访问的
                ListNode temp = head.next;
                //每次访问的原链表节点都会成为新链表的头结点，
                //其实就是把新链表挂到访问的原链表节点的
                //后面就行了
                head.next = newHead;
                //更新新链表
                newHead = head;
                //重新赋值，继续访问
                head = temp;
            }
            //返回新链表
            return newHead;
        }

    }

}
