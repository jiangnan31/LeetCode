/*
 * Copyright (C) 2015 Jiang Nan. All Rights Reserved.
 */
package com.test.leetcode.chapter2.section8;

/**
 * Created by jiangnan04 on 15-7-14.
 */
public class RemoveDuplicatesfromSortedListN083 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m+n];
        int i = 0;
        int j = 0;
        int point = 0;
        while (i < m && j < n) {
            if( nums1[i] < nums2[j]) {
                tmp[point] = nums1[i];
                i++;
            } else {
                tmp[point] = nums2[j];
                j++;
            }
            point++;
        }
        while (i < m) {
            tmp[point] = nums1[i];
            i++;
            point++;
        }
        while (j < n) {
            tmp[point] = nums2[j];
            j++;
            point++;
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = tmp[k];
        }
    }


    // copy from http://www.jiuzhang.com/solutions/merge-sorted-array/
    /**
     * @param A: sorted integer array A which has m elements,
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int i = m-1, j = n-1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[index--] = A[i--];
            } else {
                A[index--] = B[j--];
            }
        }
        while (i >= 0) {
            A[index--] = A[i--];
        }
        while (j >= 0) {
            A[index--] = B[j--];
        }
    }
}
