/*
 * Submission: 1738887441
 * Problem: Degree of an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 18:44:50 UTC
 * Runtime: 42 ms
 * Memory: 47.6 MB
 */

class Solution {
    public int findShortestSubArray(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        int maxElem = arr[0];
        int bal = arr.length/2;
        int idx = 0;
        for (int num : arr) {
            int count = freq.getOrDefault(num, 0) + 1; //+ ((bal-idx > 0) ?  bal - idx : idx - bal);
            freq.put(num, count);

            if (count > maxFreq) {
                maxFreq = count;
                maxElem = num;
            }
        }
        List<Integer> consider = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue() == maxFreq) consider.add(entry.getKey());
        }
        int ans = 50000;
        for (int maxEle : consider){
            int first = 0, last = arr.length - 1;
            while(arr[first++] != maxEle);
            while(arr[last--] != maxEle);
            int cur = last - first + 3;
            ans = (ans < cur) ? ans : cur;
        }

        return ans;
    }
}