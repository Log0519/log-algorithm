package com.log.characterString;

/**
 * @Author Log
 * @Date 2022/8/9 14:00
 * TODO 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 */
public class L12_InvertString {
    public static void main(String[] args) {

    }
    class Solution {
        public void reverseString(char[] s) {
            int length = s.length;
            char temp;
            for (int i = 0; i < length/2; i++) {
                temp = s[i];
                s[i] = s[length-1-i];
                s[length-1-i] = temp;
            }
        }
    }

}
