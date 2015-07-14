package com.test.leetcode.chapter1.section1;

// Given a linked list, remove the nth node from the end of list and return its head.
// For example,
//     Given linked list: 1->2->3->4->5, and n = 2.
//     After removing the second node from the end, the linked list becomes 1->2->3->5.
// Note:
//     Given n will always be valid.
//     Try to do this in one pass.


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RemoveNthNodeFromEndOfListN019 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode firstIndex = head, secondIndex = head;
        // 前置指针
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (null == firstIndex.next) {
                flag = true;
                break;
            }
            firstIndex = firstIndex.next;
        }
        if (flag) {
            return head.next;
        }
        while (firstIndex.next != null) {
            firstIndex = firstIndex.next;
            secondIndex = secondIndex.next;
        }
        ListNode tmp = secondIndex.next.next;
        secondIndex.next = tmp;
        return head;
    }

    public static void printLinkedList(ListNode l1) {
        while (l1 != null) {
            System.out.print(l1.val);
            l1 = l1.next;
            if(l1 != null) {
                System.out.print("->");
            }
            
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ListNode t1 = new ListNode(1);
        ListNode t2 = new ListNode(2);
        ListNode t3 = new ListNode(3);
        ListNode t4 = new ListNode(4);
        ListNode t5 = new ListNode(5);
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        t4.next = t5;
        
        System.out.println("printLinkedList(t1)");
        printLinkedList(t1);
        System.out.println("printLinkedList(removeNthFromEnd(t1, 5))");
        ListNode ret = removeNthFromEnd(t1, 5);
        printLinkedList(ret);

        System.out.println("printLinkedList(removeNthFromEnd(t1, 1))");
        printLinkedList(removeNthFromEnd(t1, 1));
        System.out.println("printLinkedList(removeNthFromEnd(t1, 2))");
        printLinkedList(removeNthFromEnd(t1, 2));
    }

}
