/*
 * Submission: 1735955356
 * Problem: Increasing Decreasing String (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-15 10:11:38 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int len = arr.length, n = 0, l = 0, r = len - 1;
        Set<Character> ss = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        while(n<len){
            int it = l;
            boolean first = true;
            ss.clear();
            while(n < len && it<len){
                if (!ss.contains(arr[it])){
                    n++;
                    ss.add(arr[it]);
                    sb.append(arr[it]);
                }
                it++;
                if(first){
                    l = it;
                    first = false;
                }
            } 
            ss.clear();
            first = true;
            it = r;
            while(n < len && it>=0){
                if (!ss.contains(arr[it])){
                    n++;
                    ss.add(arr[it]);
                    sb.append(arr[it]);
                }
                it--;
                if(first){
                    r = it;
                    first = false;
                }
            }
        }
        return sb.toString();
    }
}