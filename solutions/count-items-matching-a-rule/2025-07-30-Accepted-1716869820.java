/*
 * Submission: 1716869820
 * Problem: Count Items Matching a Rule (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 09:08:18 UTC
 * Runtime: 6 ms
 * Memory: 50.3 MB
 */

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (var li : items){
            switch (ruleKey) {
                case "type":
                    if (li.get(0).equals(ruleValue)) count++;
                    break;
                case "color":
                    if (li.get(1).equals(ruleValue)) count++;
                    break;
                case "name":
                    if (li.get(2).equals(ruleValue)) count++;
                    break;
            }
        }
        return count;
    }
}