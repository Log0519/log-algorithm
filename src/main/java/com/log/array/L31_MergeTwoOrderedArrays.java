package com.log.array;

/**
 * @Author Log
 * @Date 2022/8/25 11:49
 * TODO 合并两个有序数组
 * 给你两个按非递减顺序排列的整数数组nums1和nums2,另有两个整数m和 n ，分别表示 nums1 和 nums2 中的元素数目。
 *
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 * 其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class L31_MergeTwoOrderedArrays {
    public static void main(String[] args) {
        int[] num={1,2,3,0,0,0};
        int m=3;
        int n=3;
        int[] num2={2,5,6};
        int[] merge = merge(num, m, num2, n);
        for (int i : merge) {
            System.out.println(i);
        }
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int h1=m-1;
        int h2=n-1;
        int index=m+n-1;
        int[] clone = nums1.clone();
        for (int i = 0; i < m+n; i++) {
            if(h1==-1){
                nums1[index]=nums2[h2];
                h2--;
                index--;
            } else if (h2 == -1) {
                nums1[index]=clone[h1];
                h1--;
                index--;
            } else if (clone[h1]<=nums2[h2]){
                nums1[index]=nums2[h2];
                index--;
                h2--;
            } else {
                nums1[index]=clone[h1];
                index--;
                h1--;
            }
        }
        return nums1;
    }
}
