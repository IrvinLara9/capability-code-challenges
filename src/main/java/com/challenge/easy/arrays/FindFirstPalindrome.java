package com.challenge.easy.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
 * <p>
 * A string is palindromic if it reads the same forward and backward.
 * <p>
 * Example 1:
 * Input: words = ["abc","car","ada","racecar","cool"]
 * Output: "ada"
 * Explanation: The first string that is palindromic is "ada".
 * Note that "racecar" is also palindromic, but it is not the first.
 * <p>
 * Example 2:
 * Input: words = ["notapalindrome","racecar"]
 * Output: "racecar"
 * Explanation: The first and only string that is palindromic is "racecar".
 * <p>
 * Example 3:
 * Input: words = ["def","ghi"]
 * Output: ""
 * Explanation: There are no palindromic strings, so the empty string is returned.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists only of lowercase English letters.
 */
public class FindFirstPalindrome {

    public static String firstPalindrome(String[] words) {
        for (String currentWord : words) {
            int wordLength = currentWord.length();
            boolean isPalindrome = true;

            for (int j = 0; j < (wordLength / 2); j++) {
                char firstLetter = currentWord.charAt(j);
                char lastLetter = currentWord.charAt(wordLength - j - 1);
                if (firstLetter != lastLetter) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) return currentWord;
        }
        return "";
    }

    public static void main(String[] args) {

    }
}
