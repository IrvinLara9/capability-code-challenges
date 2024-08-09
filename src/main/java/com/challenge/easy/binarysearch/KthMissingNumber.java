package com.challenge.easy.binarysearch;

/**
    # Kth Missing Positive Number

     Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

     Return the kth positive integer that is missing from this array.

     Example 1:
         Input: arr = [2,3,4,7,11], k = 5
         Output: 9
         Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

     Example 2:
         Input: arr = [1,2,3,4], k = 2
         Output: 6
         Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

     Constraints:

         * 1 <= arr.length <= 1000
         * 1 <= arr[i] <= 1000
         * 1 <= k <= 1000
         * arr[i] < arr[j] for 1 <= i < j <= arr.length

     Follow up:

     Could you solve this problem in less than O(n) complexity?
 */
public class KthMissingNumber {

    // O(n + k)
    public static int findKthPositiveFirstSolution(int[] arr, int k) {
        int missingNumbersCount = 0;
        int existingNumbersCount = 0;
        int i = 1;

        while (missingNumbersCount < k) {
            if (existingNumbersCount < arr.length && arr[existingNumbersCount] == i) {
                existingNumbersCount++;
            } else {
                missingNumbersCount++;
            }
            if (missingNumbersCount < k) {
                i++;
            }
        }
        return i;
    }

    // O(log n)
    public static int findKthPositive(int[] arr, int k) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int missing = arr[midIndex] - (midIndex + 1);

            if (missing < k) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }

        return leftIndex + k;
    }

    public static void main(String[] args) {

    }
}
