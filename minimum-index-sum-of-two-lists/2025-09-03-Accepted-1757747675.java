/*
 * Submission: 1757747675
 * Problem: Minimum Index Sum of Two Lists (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 03:51:00 UTC
 * Runtime: 8 ms
 * Memory: 45.5 MB
 */

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int k = Integer.MAX_VALUE, idx = 0, len = list1.length, ben = list2.length;
        String[] ans = new String[len];
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.put(list1[i],i);
        }

        for (int i = 0; i < ben; i++) {
            String cur = list2[i];
            if (map.containsKey(cur)) {
                int sum = i + map.get(cur);
                if (sum < k) {
                    idx = 0;
                    ans[idx++] = cur;
                    k = sum;
                } else if (sum == k) {
                    ans[idx++] = cur;
                }
            }
            
        } //System.out.println(Arrays.toString(ans));
        return Arrays.copyOfRange(ans,0,idx);
    }
}