/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter3.section13;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jiangnan04 on 15-7-15.
 */
public class WordBreakN139 {
    public boolean wordBreak(String s, Set<String> wordDict) {
        for (String tmp : wordDict) {
            s = s.replace(tmp, "");
        }
        if (s.length() == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        WordBreakN139 w = new WordBreakN139();
        HashSet<String> m = new HashSet<String>();
        m.add("aaaa");
        m.add("aaa");
        System.out.println(w.wordBreak("aaaaaaa", m));
    }
}
