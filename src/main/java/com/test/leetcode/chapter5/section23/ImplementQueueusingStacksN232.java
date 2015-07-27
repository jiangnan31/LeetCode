/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter5.section23;

import java.util.Stack;

/**
 * Created by jiangnan04 on 15-7-27.
 */
public class ImplementQueueusingStacksN232 {

    Stack<Integer> s = new Stack<Integer>();

    // Push element x to the back of queue.
    public void push(int x) {
        Stack<Integer> tmp = new Stack<Integer>();
        while(!s.empty()) {
            int a = s.peek();
            tmp.push(a);
            s.pop();
        }
        s.push(x);
        while(!tmp.empty()) {
            int b = tmp.peek();
            s.push(b);
            tmp.pop();
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        s.pop();
    }

    // Get the front element.
    public int peek() {
        return s.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return s.empty();
    }

}
