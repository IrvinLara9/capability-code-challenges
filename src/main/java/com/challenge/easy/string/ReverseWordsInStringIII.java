package com.challenge.easy.string;

/**
    # Reverse Words in a String III

     Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

     Example 1:
         Input: s = "Let's take LeetCode contest"
         Output: "s'teL ekat edoCteeL tsetnoc"

     Example 2:
         Input: s = "Mr Ding"
         Output: "rM gniD"

     Constraints:

         * 1 <= s.length <= 5 * 104
         * s contains printable ASCII characters.
         * s does not contain any leading or trailing spaces.
         * There is at least one word in s.
         * All the words in s are separated by a single space.

 */
public class ReverseWordsInStringIII {

    // O(n)
    public static String reverseWords(String s) {
        StringBuilder reversedWordsString = new StringBuilder();
        String[] sSplitted = s.split(" ");

        for (String word : sSplitted) {
            StringBuilder wordReversed = new StringBuilder(word).reverse();
            reversedWordsString.append(wordReversed).append(" ");
        }

        return reversedWordsString.toString().trim();
    }

    public static void main(String[] args) {

    }
}
