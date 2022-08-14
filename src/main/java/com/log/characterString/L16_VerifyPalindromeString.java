package com.log.characterString;

/**
 * @Author Log
 * @Date 2022/8/9 15:34
 * TODO 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */

public class L16_VerifyPalindromeString {
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 0)
                return true;
            int left = 0, right = s.length() - 1;
            while (left < right) {
                //因为题中说了，只考虑字母和数字，所以不是字母和数字的先过滤掉
                while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                    left++;
                while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                    right--;
                //然后把两个字符变为小写，在判断是否一样，如果不一样，直接返回false
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                    return false;
                left++;
                right--;
            }
            return true;
        }

    }
}
