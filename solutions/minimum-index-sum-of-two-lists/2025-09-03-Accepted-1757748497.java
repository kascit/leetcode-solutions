/*
 * Submission: 1757748497
 * Problem: Minimum Index Sum of Two Lists (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 03:51:59 UTC
 * Runtime: 8 ms
 * Memory: 45.6 MB
 */

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();

        for (int j = 0; j < list2.length; j++) {
            String cur = list2[j];
            if (map.containsKey(cur)) {
                int sum = j + map.get(cur);

                if (sum < min) {
                    result.clear();
                    result.add(cur);
                    min = sum;
                } else if (sum == min) {
                    result.add(cur);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
