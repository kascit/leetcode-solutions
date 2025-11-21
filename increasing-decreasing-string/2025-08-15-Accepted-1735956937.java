/*
 * Submission: 1735956937
 * Problem: Increasing Decreasing String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 10:13:19 UTC
 * Runtime: 26 ms
 * Memory: 45 MB
 */

class Solution {
    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int len = arr.length, n = 0, l = 0, r = len - 1;
        Set<Character> ss = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        // System.out.println();
        while(n<len){
            int it = l;
            boolean first = true;
            ss.clear();
            ss.add('-');
            while(n < len && it<len){
                if (!ss.contains(arr[it])){
                    n++;
                    ss.add(arr[it]);
                    sb.append(arr[it]);
                    arr[it] = '-';
                }
                it++;
                if(first){
                    l = it;
                    first = false;
                }
            } 
            ss.clear();
            ss.add('-');
            first = true;
            it = r;
            while(n < len && it>=0){
                if (!ss.contains(arr[it])){
                    n++;
                    ss.add(arr[it]);
                    sb.append(arr[it]);
                    arr[it] = '-';
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