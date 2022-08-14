package com.log.array;

/**
 * @Author Log
 * @Date 2022/8/9 13:39
 * TODO 旋转图像
 * 给定一个 n×n 的二维矩阵matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 */
public class L11_RotateImage {

    class Solution {
        public void rotate(int[][] matrix) {
            int length = matrix.length;
            //上下交换
            for (int i = 0; i < length / 2; i++) {
                int[] temp=matrix[i];
                matrix[i]=matrix[length-i-1];
                matrix[length-i-1]=temp;
            }
            //对角线交换
            for (int i = 0; i < length; ++i) {
                for (int j = i+1; j < length; ++j) {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }
}
