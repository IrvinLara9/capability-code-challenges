package com.challenge.easy.string;

/**

    # Check if the Sentence Is Pangram

     A pangram is a sentence where every letter of the English alphabet appears at least once.

     Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

     Example 1:
         Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
         Output: true
         Explanation: sentence contains at least one of every letter of the English alphabet.

     Example 2:
         Input: sentence = "leetcode"
         Output: false

     Constraints:

         * 1 <= sentence.length <= 1000
         * sentence consists of lowercase English letters.
 */
public class CheckSentenceIsPangram {

    // O(n)
    public static boolean checkIfPangram(String sentence) {
        int ENGLISH_LETTERS = 26;
        sentence = sentence.toLowerCase();

        boolean[] lettersContained = new boolean[ENGLISH_LETTERS];

        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);
            if (Character.isLetter(currentLetter)) {
                int letterIndex = currentLetter - 'a';
                lettersContained[letterIndex] = true;
            }
        }

        for (int i = 0; i < ENGLISH_LETTERS; i++) {
            if (!lettersContained[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
