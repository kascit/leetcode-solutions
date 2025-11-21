/*
 * Submission: 1836045910
 * Problem: Shortest Distance to Target String in a Circular Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 14:19:10 UTC
 * Runtime: 0 ms
 * Memory: 47 MB
 */

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int len = words.length;
        int left = 0, right = 0, i = startIndex;
        while (true) {
            if (left > 0 && i == startIndex) return -1;
            if (words[i].equals(target)) break;
            i--;
            if (i == -1) i = len - 1;
            left++;
        }
        i = startIndex;
        while (true) {
            if (words[i].equals(target)) break;
            i++;
            if (i == len) i = 0;
            right++;
        }
        return Math.min(left,right);
    }
}