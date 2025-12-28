/*
 * Submission: 1738876564
 * Problem: Degree of an Array (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-17 18:33:51 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findShortestSubArray(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        int maxElem = arr[0];

        for (int num : arr) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);

            if (count > maxFreq) {
                maxFreq = count;
                maxElem = num;
            }
        }
        int first = 0, last = arr.length - 1;
        while(arr[first++] != maxElem);
        while(arr[last--] != maxElem);

        return last - first + 3;
    }
}