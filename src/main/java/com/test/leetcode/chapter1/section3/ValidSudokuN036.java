/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter1.section3;

import java.util.HashSet;

/**
 * Created by jiangnan04 on 15-7-13.
 */
public class ValidSudokuN036 {
    public boolean isValidSudoku(char[][] board) {
        if (board.length % 3 != 0 || board[0].length % 3 != 0) {
            return false;
        }
        HashSet<Character> judge = new HashSet<Character>();
        // 行判定
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] >= '0' &&  board[i][j] <= '9') {
                    if (judge.contains(board[i][j])) {
                        return false;
                    } else {
                        judge.add(board[i][j]);
                    }
                }
            }
            judge.clear();
        }

        // 列判断
        for (int j = 0; j < board[0].length; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] >= '0' &&  board[i][j] <= '9') {
                    if (judge.contains(board[i][j])) {
                        return false;
                    } else {
                        judge.add(board[i][j]);
                    }
                }
            }
            judge.clear();
        }

        // 组合判断

        for (int i = 0; i < board.length/3; i++) {
            for (int j = 0; j < board[i].length/3; j++) {
                for(int k = 0; k < 3; k++) { //行标
                    for (int l = 0; l < 3; l++) {//列标
                        char tmp = board[3*i+k][3*j+l];
                        if (tmp >= '0' &&  tmp <= '9') {
                            if (judge.contains(tmp)) {
                                return false;
                            } else {
                                judge.add(tmp);
                            }
                        }
                    }
                }
                judge.clear();
            }
        }
        return true;
    }
}
