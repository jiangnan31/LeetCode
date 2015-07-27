/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter3.section11;

/**
 * Created by jiangnan04 on 15-7-27.
 */

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class PathSumN112 {

    // copy from http://www.jiuzhang.com/solutions/path-sum/
    public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null) {
          return false;
        }
        if (root.left == null && root.right == null) {
           return sum == root.val;
        }
        return hasPathSum (root.left, sum - root.val)
             || hasPathSum(root.right, sum - root.val);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (null == root) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                return true;
            }
           return false;
        }
        sum = sum - root.val;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
