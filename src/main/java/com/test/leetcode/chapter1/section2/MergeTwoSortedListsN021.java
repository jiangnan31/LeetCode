package com.test.leetcode.chapter1.section2;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MergeTwoSortedListsN021 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ret  = new ListNode(0);
        ListNode inter  = ret;
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                inter.next = l1;
                l1 = l1.next;
                inter = inter.next;
            } else if (l1.val > l2.val) {
                inter.next = l2;
                l2 = l2.next;
                inter = inter.next;
            } else {
                inter.next = l2;
                l2 = l2.next;
                inter = inter.next;
                inter.next = l1;
                l1 = l1.next;
                inter = inter.next;
            }
        }
        if (l1 == null && l2 != null) {
            inter.next = l2;
        }
        if (l1 != null && l2 == null) {
            inter.next = l1;
        }
        return ret.next;
    }
}
