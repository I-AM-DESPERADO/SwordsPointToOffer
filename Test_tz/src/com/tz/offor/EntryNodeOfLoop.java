package com.tz.offor;

/**
 * create by tz on 2018-07-20
 */

import java.util.HashSet;

/**
 *题目描述
 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * */
public class EntryNodeOfLoop {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

/**
 * 快慢节点法
 * */
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if (pHead == null || pHead.next == null || pHead.next.next == null) return null;
        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;
        while (fast != slow) { // 判断是否有环
            if (fast.next != null && fast.next.next != null ){
                fast = fast.next.next;
                slow = slow.next;
            } else return null;

        }
        fast = pHead;
        while (fast != slow) {  //相遇必在入口点
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * hash法，空间复杂度较大
     * */
    public ListNode EntryNodeOfLoop2(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null) return null;
        HashSet<ListNode> flagSet = new HashSet<>();
        ListNode node = pHead;
        while (node != null) {
            if (!flagSet.contains(node)) {
                flagSet.add(node);
                node = node.next;
            }else return node;
        }
        return null;
    }





}
