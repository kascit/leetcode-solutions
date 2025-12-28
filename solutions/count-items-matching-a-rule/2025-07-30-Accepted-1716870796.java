/*
 * Submission: 1716870796
 * Problem: Count Items Matching a Rule (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 09:09:14 UTC
 * Runtime: 4 ms
 * Memory: 50.7 MB
 */

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key = 0; 
        int count = 0;

        switch (ruleKey) {
            case "type":
                key = 0;
                break;
            case "color":
                key = 1;
                break;
            case "name":
                key = 2;
                break;
        }
        for (var li : items){
            if (li.get(key).equals(ruleValue)) count++;
        }
        return count;
    }
}