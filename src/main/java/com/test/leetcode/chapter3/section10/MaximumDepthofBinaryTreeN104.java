/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter3.section10;

/**
 * Created by jiangnan04 on 15-7-13.
 */

// * Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        val = x;
    }
}

public class MaximumDepthofBinaryTreeN104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if (leftDepth > rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        //TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        //root.left = left;
        root.right = right;

        System.out.println(maxDepth(root));



    }
}

