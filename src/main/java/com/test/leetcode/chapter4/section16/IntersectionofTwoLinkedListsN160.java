/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter4.section16;

/**
 * Created by jiangnan04 on 15-7-15.
 */


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
}

public class IntersectionofTwoLinkedListsN160 {
    public int getLinkedListLength(ListNode a) {
        int length = 0;
        while (a != null) {
           a = a.next;
            length++;
      }
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLinkedListLength(headA);
        int lengthB = getLinkedListLength(headB);
        if (0 == lengthA || 0 == lengthB) {
            return null;
        }
        ListNode pointA = headA;
        ListNode pointB = headB;
        int step = lengthA - lengthB;
        if (step > 0) {
            while (step > 0) {
                pointA = pointA.next;
                step--;
            }
        } else {
            while (step < 0) {
                pointB = pointB.next;
                step++;
            }
        }
        while (pointA != null){
            if (pointA.val == pointB.val) {
                return pointA;
            }
            pointA = pointA.next;
            pointB = pointB.next;
        }
        return null;
    }

}
