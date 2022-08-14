package com.log.array;

import java.util.Arrays;

/**
 * @Author Log
 * @Date 2022/8/9 11:16
 * TODO 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class L08_MoveZero {
    public static void main(String[] args) {
        int[] newNums={0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(newNums);

    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[index++] = nums[i];
                }
            }
            for (int i = index; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
