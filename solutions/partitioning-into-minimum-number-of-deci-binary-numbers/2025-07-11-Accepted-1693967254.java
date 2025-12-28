/*
 * Submission: 1693967254
 * Problem: Partitioning Into Minimum Number Of Deci-Binary Numbers (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-11 06:42:32 UTC
 * Runtime: 24 ms
 * Memory: 45.3 MB
 */

class Solution {
    public int minPartitions(String n) {
        return n.chars()
    .filter(Character::isDigit)
    .map(c -> c - '0') // convert char to digit
    .max()
    .orElse(-1);
    }
}