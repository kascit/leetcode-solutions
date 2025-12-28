/*
 * Submission: 1710732983
 * Problem: Defanging an IP Address (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 08:37:04 UTC
 * Runtime: 1 ms
 * Memory: 41.6 MB
 */

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }
}