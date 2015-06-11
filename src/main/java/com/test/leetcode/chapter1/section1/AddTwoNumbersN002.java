package com.test.leetcode.chapter1.section1;

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class AddTwoNumbersN002 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 ==null) {
           return null; 
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        int carry = 0;
        while (l1 !=null && l2 != null) {
            int ret = l1.val + l2.val + carry;
            carry = ret/10;
            ret = ret%10;
            point.next = new ListNode(ret);
            point = point.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int ret = l1.val + carry;
            carry = ret/10;
            ret = ret%10;
            point.next = new ListNode(ret);
            point = point.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int ret = l2.val + carry;
            carry = ret/10;
            ret = ret%10;
            point.next = new ListNode(ret);
            point = point.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            point.next = new ListNode(carry);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        System.out.println(addTwoNumbers(l1, l2));
    }
}
