package com.tz.offor;

/**
 * create by tz on 2018-07-20
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * 题目描述
 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * */

public class deleteDuplication {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 递归方法
     * */
    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead == null || pHead.next == null) return pHead;

        if (pHead.val == pHead.next.val) {
            ListNode pNode = pHead.next;
            while (pNode != null && pNode.val == pHead.val) {
                pNode = pNode.next;
            }
            return deleteDuplication(pNode);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }


    /**
     * 非递归
     * */
    public ListNode deleteDuplication2(ListNode pHead) {
        if (pHead == null || pHead.next == null) return pHead;
        ListNode headNode = new ListNode(-1);
        headNode.next = pHead;
        ListNode moveNode = pHead;
        ListNode last = headNode;
        while (moveNode != null && moveNode.next != null) {
            if (moveNode.val == moveNode.next.val) {
                int val = moveNode.val;
                while (moveNode != null && moveNode.val == val) {
                    moveNode = moveNode.next;
                }
                last.next = moveNode;
            } else {
                last = moveNode;
                moveNode = moveNode.next;
            }
        }
        return headNode.next;

    }

}
