/*
 * Submission: 1705449798
 * Problem: Remove Sub-Folders from the Filesystem (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 04:35:44 UTC
 * Runtime: 39 ms
 * Memory: 55.5 MB
 */

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        int len = folder.length;
        for (int i = 0; i < len ; i++){
            String cur = folder[i];
            int j = i + 1;
            ans.add(cur);
            while(j < len && folder[j].startsWith(cur+"/")){
                j++;
            }
            i = j - 1;
        }
        return ans;
    }
}