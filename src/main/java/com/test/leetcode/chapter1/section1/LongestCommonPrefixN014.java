package com.test.leetcode.chapter1.section1;

public class LongestCommonPrefixN014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuffer stringBuffer = new StringBuffer("");
        boolean flag = true;
        int index = 0;
        do {
            for (int j=0; j < strs.length; j++) {
                if (index > strs[j].length() - 1  || strs[0].charAt(index) != strs[j].charAt(index)) {
                    flag = false;
                    break;
                }  
            }
            if(flag) {
                index++;
            }
        } while (flag);
        if (index == 0) {
            return "";
        }
        for (int i = 0; i < index; i++) {
            stringBuffer.append(strs[0].charAt(i));
        }
        return stringBuffer.toString();
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(longestCommonPrefix(new String[]{"", ""}));
    }

}
