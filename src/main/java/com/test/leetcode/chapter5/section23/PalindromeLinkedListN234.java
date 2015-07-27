/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter5.section23;

import java.util.Stack;

/**
 * Created by jiangnan04 on 15-7-27.
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class PalindromeLinkedListN234 {
    public boolean isPalindrome(ListNode head) {
        if (null == head) {
            return true;
        }
        if (null == head.next) {
            return true;
        }
        ListNode l1 = head;
        ListNode l2 = head;
        // 快慢指针移动入栈
        Stack<Integer> s = new Stack<Integer>();
        while (null != l1 && null != l2) {
            s.push(l1.val);
            l1 = l1.next;
            l2 = l2.next;
            if (null == l2) {
               s.pop();
               break;
             }
          l2 = l2.next;
        }
        while(null != l1) {
            if(l1.val != s.pop()) {
                return false;
            }
            l1 = l1.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedListN234 p = new PalindromeLinkedListN234();
        ListNode a = new ListNode(0);
        ListNode b = new ListNode(0);
        a.next = b;
        System.out.print(p.isPalindrome(a));


        ListNode c = new ListNode(1);
        ListNode d = new ListNode(0);
        ListNode e = new ListNode(1);
        c.next = d;
        d.next = e;
        System.out.print(p.isPalindrome(c));
    }
}
