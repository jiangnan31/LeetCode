package com.test.leetcode.chapter1.section0;

public class ZigZagConversionN006 {

    public static String convert(String s, int nRows) {
        int length = s.length();
        if(length <= nRows || nRows ==1) return s;
        char[] chars = new char[length];
        int step = 2*(nRows-1);
        int count = 0;
            for (int i = 0; i < nRows; i++) {
                int interval = step -2 *i;
                for (int j = i; j < length; j +=step) {
                    chars[count] = s.charAt(j);
                    count++;
                    if (interval < step && interval > 0
                    && j + interval < length ) {
                        chars[count] = s.charAt(j + interval);
                        count++;
                    }
                }
            }
        return new String(chars);
    }
    
    public static void main(String[] args) {
        System.out.println(convert("ABCDEFGHIJK", 3));
    }
}
