package com.tz.offor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * create by tz on 2018-07-18
 */

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * 因为链表性质，一个节点重合之后后续节点一定重合，所以两链表只要有公共节点一定是共尾的
 * */
public class FindFirstCommonNode {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 使用hashMap的性质，先把第一个链表装入hashMap，由于key的唯一性判断第二个链表是否有重复
     * */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        else if (pHead1 == pHead2) return pHead1;

        HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();
        while (pHead1 != null) {
            map.put(pHead1,null);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            if (map.containsKey(pHead2)) return pHead2;
            pHead2 = pHead2.next;
        }
        return null;
    }

    /**
     * hashSet是同样的道理，使用相同对象hash值相同的方式比较，以空间换时间
     * */
    public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        else if (pHead1 == pHead2) return pHead1;

        HashSet<ListNode> set = new HashSet<ListNode>();
        while (pHead1 != null) {
            set.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            if (set.contains(pHead2)) return pHead2;
            pHead2 = pHead2.next;
        }
        return null;
    }

    /**
     *最常规的遍历两链表的方式，先求两链表长度，再分情况遍历比较链表
     * */
    public ListNode FindFirstCommonNode3(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        else if (pHead1 == pHead2) return pHead1;
        int length1 = getListLentgh(pHead1);
        int length2 = getListLentgh(pHead2);
        int len;
        if (length1 > length2) {
            len = length1-length2;
            while (len > 0) {
                pHead1 = pHead1.next;
                len--;
            }
        }else if (length1 < length2) {
            len = length2 - length1;
            while (len > 0) {
                pHead2 = pHead2.next;
                len--;
            }
        }
        while (pHead1!=pHead2 && pHead1!=null) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;


    }

    private static int getListLentgh(ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

}
