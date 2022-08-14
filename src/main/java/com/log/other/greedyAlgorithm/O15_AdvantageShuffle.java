package com.log.other.greedyAlgorithm;

import java.util.*;

/**
 * @Author Log
 * @Date 2022/8/14 14:30
 * TODO 优势洗牌(田忌赛马) --贪心算法
 * 给定两个大小相等的数组nums1和nums2，nums1相对于 nums的优势可以用满足
 * nums1[i] > nums2[i]的索引 i的数目来描述。
 * 返回 nums1的任意排列，使其相对于 nums2的优势最大化。
 */
public class O15_AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int[] sortB=B.clone();
        Arrays.sort(sortB);

        Map<Integer, Deque<Integer>> bMap=new HashMap<>();
        for (int b : B) {
            bMap.put(b,new LinkedList<>());
        }
        Deque<Integer> aq=new LinkedList<>();
        int j=0;
        for (int a : A) {
            if(a>sortB[j]){
                bMap.get(sortB[j]).add(a);
            }else {
                aq.add(a);
            }
        }
        int[] ans = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            if(bMap.get(B[i]).size()>0){
                ans[i]=bMap.get(B[i]).removeLast();
            }else {
                ans[i]=aq.removeLast();
            }
        }

        return ans;
    }
}
