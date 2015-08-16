/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter4.section15;

import java.util.Stack;

/**
 * Created by jiangnan04 on 15-7-27.
 */
public class MinStackN155 {

    private Stack<Integer> s = new Stack<Integer>();
    private Stack<Integer> min = new Stack<Integer>();

    public void push(int x) {
        s.push(x);
        if (!min.empty()) {
            if( min.peek() < x) {
                x = min.peek();
            }
        }
        min.push(x);
    }

    public void pop() {
        min.pop();
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
// copy from http://www.jiuzhang.com/solutions/min-stack/
class Solution {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public Solution() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int number) {
        stack.push(number);
        if (minStack.empty() == true)
            minStack.push(number);
        else
        if (Integer.parseInt(minStack.peek().toString()) >= number)
            minStack.push(number);
    }

    public int pop() {
        if (stack.peek().equals(minStack.peek()) )
            minStack.pop();
        return stack.pop();
    }

    public int min() {
        return minStack.peek();
    }
}
