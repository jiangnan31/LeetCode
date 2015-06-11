package com.test.leetcode.chapter1.section2;

public class RomanToIntegerN013 {

    public static int romanToInt(String s) {
        int[] tnum = {     1000,900,500,400, 100, 90,  50, 40, 10,  9,  5,  4,   1};
        String[] numStr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        char[] c = s.toCharArray();
        int num = 0;
        for (int i = 0; i < c.length; i++) {
            switch(c[i]) {
                case 'M' : {
                    num = num + 1000;
                    break;
                }
                case 'D' : {
                    num = num + 500;
                    break;
                }
                case 'C' : {
                    if (i < c.length - 1 && (c[i+1] == 'M' || c[i+1] == 'D')) {
                        num = num - 100;    
                    }  else {
                        num = num + 100;
                    }
                    break;
                }
                case 'L' : {
                    num = num + 50;
                    break;
                }
                case 'X' : {
                    if (i < c.length - 1 && (c[i+1] == 'L' || c[i+1] == 'C')) {
                        num = num - 10;    
                    }  else {
                        num = num + 10;
                    }
                    break;
                }
                case 'V' : {
                    num = num + 5;
                    break;
                }
                case 'I' : {
                    if (i < c.length - 1 && (c[i+1] == 'X' || c[i+1] == 'V')) {
                        num = num - 1;    
                    }  else {
                        num = num + 1;
                    }
                    break;
                }
                
            }
        }
        return num;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(romanToInt("DCI"));
        System.out.println(romanToInt("IV"));
    }

}
