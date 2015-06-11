package com.test.leetcode.chapter1.section2;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParenthesesN020 {

    public char getOppositeChar(char c) {
        char ret = ' ';
        switch (c) {
            case '(' : {
                ret = ')';
                break;
            }
            case '[' : {
                ret = ']';
                break;
            }
            case '{' : {
                ret = '}';
                break;
            }    
        }
        return ret;
    }
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int index = -1;
        boolean flag = true;
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(current == '{' || current == '}' || current == '(' || current == ')'
                     || current == '[' || current == ']') {
                 if(current == '{' || current == '[' || current == '(') {
                     index++;
                     stack[index] = current;
                 } else if (current == '}' || current == ']' || current == ')') {
                     if (index == -1) {
                         flag = false;
                         return flag;
                     } 
                     char targetChar = getOppositeChar(stack[index]);
                     if(targetChar != current ) {
                         flag = false;
                         return flag;
                     } else {
                         index--;
                     }
                     
                 }             
            }
        }
        if(index != -1) {
            flag = false;
        }
        return flag;
    }
}
