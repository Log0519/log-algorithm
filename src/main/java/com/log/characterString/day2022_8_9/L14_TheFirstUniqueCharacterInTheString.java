package com.log.characterString.day2022_8_9;

import java.util.Arrays;

/**
 * @Author Log
 * @Date 2022/8/9 14:22
 * TODO 字符串中的第一个唯一字符
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1
 */
public class L14_TheFirstUniqueCharacterInTheString {
    public static void main(String[] args) {
        String S="qqqwww";
        Solution solution = new Solution();
        solution.firstUniqChar(S);
    }
    static class Solution {
        public int firstUniqChar(String s) {
            int count[] = new int[26];
            char[] chars = s.toCharArray();
            //先统计每个字符出现的次数
            for (int i = 0; i < s.length(); i++)
                count[chars[i] - 'a']++;
            //然后在遍历字符串s中的字符，如果出现次数是1就直接返回
            for (int i = 0; i < s.length(); i++)
                if (count[chars[i] - 'a'] == 1)
                    return i;
            return -1;
        }
    }
}
