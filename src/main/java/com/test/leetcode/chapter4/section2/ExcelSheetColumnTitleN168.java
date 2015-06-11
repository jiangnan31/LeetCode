package com.test.leetcode.chapter4.section2;

public class ExcelSheetColumnTitleN168 {

    public static String convertToNumBase26(int n) {
        char[] ret = {'Z','A','B','C','D','E','F','G','H','I','J','K','L',
                         'M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
        StringBuffer stringBuffer = new StringBuffer("");
        while (n != 0) {
            int tmp = n%26;
            stringBuffer.append(ret[tmp]);
            n = (n-1)/26;
        }
        return stringBuffer.reverse() + "";
    }
    
    
    public static void main(String[] args) {
        //System.out.println(convertToNumBase26(26));
        //System.out.println(convertToNumBase26(27));
        System.out.println(convertToNumBase26(53)); // Expected:    "BA"
        //System.out.println(convertToNumBase26(702));
    }

}
