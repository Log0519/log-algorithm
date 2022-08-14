package com.log.characterString;

import com.log.linkedList.ListNode;

/**
 * @Author Log
 * @Date 2022/8/14 7:32
 * TODO 环形链表
 * 给定一个链表，判断是否有环，如果链表中有某个节点，可以通过连续跟踪next指针再次回到该节点，则链表中存在环
 */
public class O09_CircularLinkedList {
    public static void main(String[] args) {
        ListNode node5=new ListNode(5,null);
        ListNode node4=new ListNode(4,node5);
        ListNode node3=new ListNode(3,node4);
        ListNode node2=new ListNode(2,node3);
        ListNode node1=new ListNode(1,node2);
        node5.next=node3;
        System.out.println(hasCycle(node1));

    }

    //双指针 一个快指针，一个慢指针，两个指针第二次
    public static boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        //快慢两个指针
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            //慢指针每次走一步
            slow = slow.next;
            //快指针每次走两步
            fast = fast.next.next;
            //如果相遇，说明有环，直接返回true
            if (slow == fast)
                return true;
        }
        //否则就是没环
        return false;
    }


}
