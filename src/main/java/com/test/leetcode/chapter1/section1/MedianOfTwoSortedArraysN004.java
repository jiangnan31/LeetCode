package com.test.leetcode.chapter1.section1;

/**
 * 
* @ClassName: MedianofTwoSortedArraysTest 
* @Description: TODO(There are two sorted arrays A and B of size m and n respectively. 
* Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).) 
* @author jiangnan04 
* @add date 2011-03-27
* @date 2014-11-11 下午02:03:49 
*
 */
public class MedianOfTwoSortedArraysN004 {

    public static double findMedianSortedArrays(int A[], int B[]) {
        int length = (A.length+B.length);
        int i=0,j=0,z=0;
        int[] temp = new int[length];
        if(A.length==0){
            return length%2==1?B[length/2] :(B[length/2]+B[length/2-1])/2.0 ;
        }else if(B.length==0){
            return length%2==1? A[length/2]:(A[length/2]+A[length/2-1])/2.0;
        }
        while(z<length){
            if(j==B.length){
                for(;i<A.length;i++){
                    temp[z]=A[i];
                    z++;
                }
                break;
            }
            if(i==A.length){
                for(;j<B.length;j++){
                    temp[z]=B[j];
                    z++;
                }
                break;
            }
            if(A[i]>B[j]){
                temp[z]=B[j];
                z++;j++;
            }else if(A[i]<B[j]){
                temp[z]=A[i];
                z++;i++;
            }else if(A[i] == B[j]){
                temp[z]=A[i];
                temp[++z]=B[j];
                z++;i++;j++;
            }
        }
        return length%2==1? temp[length/2]:(temp[length/2]+temp[length/2-1])/2.0 ;
        
    }

    public static void main(String[] args){
    	MedianOfTwoSortedArraysN004 mt = new MedianOfTwoSortedArraysN004();
    	//int A[] = {1,2,3,4,5};
    	//int B[] = {3,4,5,6,7};
    	int A[] = {};
    	int B[] = {3,4};
    	System.out.println( mt.findMedianSortedArrays(A, B) );
    	 
    }
    
}
