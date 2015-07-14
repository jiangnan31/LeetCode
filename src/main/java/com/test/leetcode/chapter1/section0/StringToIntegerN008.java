package com.test.leetcode.chapter1.section0;

public class StringToIntegerN008 {

    public static int atoi(String str) {
        str = str.trim();
        if(str.length() == 0) {
            return 0;
        }
        int flag = 0;
        int index = 0;
        if (str.charAt(0) == '-') {
            flag = -1;
            index++;
        } else if (str.charAt(0) == '+') {
            index++;
        }
        int start = index;
        int end = index;
        for (; index < str.length(); index++) {
            if(str.charAt(index) > '9' || str.charAt(index) < '0') {
                break;
            }
            end++;
        }
        if(end == start) {
            return 0;
        }
        String numStr = str.substring(0, end);
        if (numStr.length() > 13) {
            if (flag == -1) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        long num = Long.parseLong(numStr, 10);
        if(num > Integer.MAX_VALUE ) {
            return Integer.MAX_VALUE;
        } else if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else  {
            return (int)num;
        }
    }

    public static void main (String[] args) {
        //System.out.println(atoi("    -   1   059"));
        //System.out.println(atoi("-+1"));
        //System.out.println(atoi("1"));
        //System.out.println(atoi("9223372036854775809"));
        //System.out.println(atoi("  -0012a42")); //-12
        //System.out.println(atoi("1"));
        System.out.println(atoi("9223372036854775809"));
    }
}
