package com.log.characterString.day2022_8_9;

/**
 * @Author Log
 * @Date 2022/8/9 15:18
 * TODO 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 *
 * 重要方法：统一每个字母出现次数
 *  char[] count = new char[26];
 *  for (int i = 0; i < ls; i++) {
 *     count[charsS[i]-'a']++;
 *  }
 */
public class L15_ValidLetterEctopicWords {
    class Solution {
        public boolean isAnagram(String s, String t) {
            int ls = s.length();
            int lt = t.length();
            if (ls!=lt){
                return false;
            }

            char[] count = new char[26];
            char[] charsS = s.toCharArray();
            char[] charsT = t.toCharArray();

            for (int i = 0; i < ls; i++) {
                count[charsS[i]-'a']++;
            }
            for (int i = 0; i < ls; i++) {
                count[charsT[i]-'a']--;
            }
            for (char c : count) {
                if (c!=0)
                    return false;
            }

            return true;
        }
    }

}
