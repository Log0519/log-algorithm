package com.log.linkedList;

import com.log.linkedList.ListNode;

/**
 * @Author Log
 * @Date 2022/8/11 11:43
 * TODO 合并两个有序链表
 */
public class L24_MergeTwoOrderedLinkedLists {
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode p1 = l1;
            ListNode p2 = l2;
            ListNode head = new ListNode(5, null);
            ListNode temp = head;
            while(p1!=null&&p2!=null){
                if(p1.val<=p2.val){
                    temp.next = new ListNode(p1.val);
                    p1 = p1.next;
                }else{
                    temp.next = new ListNode(p2.val);
                    p2 = p2.next;
                }
                temp = temp.next;
            }
            if(p1==null){
                temp.next = p2;
            }else{
                temp.next = p1;
            }
            return head.next;
        }
    }

}
