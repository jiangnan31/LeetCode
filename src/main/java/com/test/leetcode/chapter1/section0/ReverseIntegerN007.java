package com.test.leetcode.chapter1.section0;

public class ReverseIntegerN007 {

    public static int reverse(int x) {
        String tmpStr = x + "";
        int flag = 0;
        if (x < 0) {
            tmpStr = tmpStr.substring(1);
            flag = 1;
        }
        StringBuffer numStr = new StringBuffer();
        for (int i = tmpStr.length() - 1; i >= 0 ; i--) {
            if(tmpStr.length() == 0 && tmpStr.charAt(i) =='0') {
                    
            } else {
                numStr.append(tmpStr.charAt(i) + "");
            }
        }
        if (numStr.length() == 0) {
            numStr.append("0");
        }
        long num = Long.parseLong(numStr.toString());
        if(flag == 1) {
            num = -num;
        }
        if(num < -2147483648 || num > 2147483647) {
            return 0;
        }
        return (int)num;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));

    }

}
