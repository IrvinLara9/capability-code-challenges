package com.challenge.easy.string;

import java.util.HashSet;
import java.util.Set;

/**

     # Jewels and Stones

     You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
     Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

     Letters are case sensitive, so "a" is considered a different type of stone from "A".

     Example 1:
         Input: jewels = "aA", stones = "aAAbbbb"
         Output: 3

     Example 2:
         Input: jewels = "z", stones = "ZZ"
         Output: 0

     Constraints:

         * 1 <= jewels.length, stones.length <= 50
         * jewels and stones consist of only English letters.
         * All the characters of jewels are unique.
 */
public class JewelsAndStones {

    // O(m * n)
    public static int numJewelsInStonesFirstApproach(String jewels, String stones) {
        int jewelsCount = 0;
        for (int i = 0; i < stones.length(); i++) {
            char currentStone = stones.charAt(i);

            if (jewels.contains(String.valueOf(currentStone))) {
                jewelsCount++;
            }
        }

        return jewelsCount;
    }

    // O(m + n)
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int jewelsCount = 0;
        for (int i = 0; i < stones.length(); i++) {
            char currentStone = stones.charAt(i);

            if (jewelSet.contains(currentStone)) {
                jewelsCount++;
            }
        }

        return jewelsCount;
    }

    public static void main(String[] args) {

    }
}
