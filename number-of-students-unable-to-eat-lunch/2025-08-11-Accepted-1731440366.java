/*
 * Submission: 1731440366
 * Problem: Number of Students Unable to Eat Lunch (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:13:40 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        boolean haha = true;
        int len = students.length,k = 0;
        while(k<len){
            haha = false;
            for(int i = 0; i < len; i++){
                if (k < len && students[i] == sandwiches[k]){
                    haha = true;
                    k++;
                    //System.out.println(i+"  "+k);
                    students[i] = -1;
                }
            }
            if (!haha) return len - k;
        } return 0;
    }
}