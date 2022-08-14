package com.log.array;

/**
 * @Author Log
 * @Date 2022/8/8 17:55
 * TODO 找出只出现一次的数字
 * 采用异或运算符，两个相同的数字结果为0
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class L05_NumbersThatAppearOnlyOnce {
    public static void main(String[] args) {

    }
    class Solution {
        public int singleNumber(int[] nums) {
        int result=0;
            for (int num : nums) {
                result=result^num;
            }
        return result;
        }

    }

}
