/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter5.section22;

/**
 * Created by jiangnan04 on 15-7-27.
 */
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
public class InvertBinaryTreeN226 {

    //copy from http://www.jiuzhang.com/solutions/invert-binary-tree/
    public void invertBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
}



    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return root;
        }
        if (null != root) {
            TreeNode tmp = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = tmp;
        }

        return root;
}

}
