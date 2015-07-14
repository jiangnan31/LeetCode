/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter2.section6;

/**
 * Created by jiangnan04 on 15-7-14.
 */
public class AddBinaryN067 {
    public boolean isValid(char a) {
        if (a == '1' || a == '0') {
            return true;
        }
        return false;
    }
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0 || b == null || b.length() == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int flag = 0;
        while (i >= 0 && j>= 0) {
            if (!isValid(a.charAt(i)) || !isValid(b.charAt(j))) {
                return null;
            }
            int na = Integer.parseInt(a.charAt(i) + "");
            int nb = Integer.parseInt(b.charAt(j) + "");
            if (na + nb + flag > 1) {
                sb.insert(0, na + nb + flag -2);
                flag = 1;
            } else {
                sb.insert(0, na + nb + flag);
                flag = 0;
            }
            i--;
            j--;
        }
        if (i >= 0) {
            if (flag == 0) {
                sb.insert(0,a.substring(0, i + 1));
            } else {
                while (i >= 0) {
                    if (!isValid(a.charAt(i)) ) {
                        return null;
                    }
                    int na = Integer.parseInt(a.charAt(i) + "");
                    if (na + flag > 1) {
                        sb.insert(0, na + flag -2);
                        flag = 1;
                    } else {
                        sb.insert(0, na + flag);
                        flag = 0;
                    }
                    i--;
                }
            }
        }
        if (j >= 0) {
            if (flag == 0) {
                sb.insert(0,b.substring(0, j + 1));
            } else {
                while (j >= 0) {
                    if (!isValid(b.charAt(j))) {
                        return null;
                    }
                    int nb = Integer.parseInt(b.charAt(j) + "");
                    if (nb + flag > 1) {
                        sb.insert(0, nb + flag -2);
                        flag = 1;
                    } else {
                        sb.insert(0, nb + flag);
                        flag = 0;
                    }
                    j--;
                }
            }
        }
        if (flag > 0) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }

    // copy from  http://www.jiuzhang.com/solutions/add-binary/
    public String addBinary2(String a, String b) {
        if(a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }

        int pa = a.length()-1;
        int pb = b.length()-1;
        int carries = 0;
        String rst = "";

        while(pb >= 0){
            int sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carries;
            rst = String.valueOf(sum % 2) + rst;
            carries = sum / 2;
            pa --;
            pb --;
        }

        while(pa >= 0){
            int sum = (int)(a.charAt(pa) - '0') + carries;
            rst = String.valueOf(sum % 2) + rst;
            carries = sum / 2;
            pa --;
        }

        if (carries == 1)
            rst = "1" + rst;
        return rst;
    }




    public static  void main(String[] args) {
        AddBinaryN067 a = new AddBinaryN067();
        //System.out.println(a.addBinary("0", "0"));
        //System.out.println(a.addBinary("11", "1"));
        System.out.println(a.addBinary("1", "1"));
    }
}
