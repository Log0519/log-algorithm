package com.log.array;

import java.sql.SQLOutput;

/**
 * @Author Log
 * @Date 2022/8/12 12:12
 * TODO 合并两个有序数组，使nums1成为一个有序数组
 * numd1的空间长度为m+n，可以保存来自nums2的n个元素
 */
public class O06_MergeTwoOrderedArrays {
    public static void main(String[] args) {

    }
    //双指针
    public static int[] merge(int[] nums1,int m,int[] nums2,int n){
        int[]nums1_copy=new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);
        int p1=0;
        int p2=0;
        int p=0;
        while (p1<m&&p2<n){
            nums1[p++]=nums1_copy[p1]<nums2[p2]?nums1_copy[p1++]:nums2[p2++];
        }
        if(p1<m){
            System.arraycopy(nums1_copy,p1,nums1,p1+p2,m+n-p1-p2);
        }
        if(p2<n){
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
        }


        return nums1;
    }
}
