/*
 * Submission: 1731436852
 * Problem: Number of Students Unable to Eat Lunch (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-11 16:10:53 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        boolean haha = true;
        int len = students.length,k = 0,cnt = 0;
        while(k<len){
            haha = false;
            for(int i = 0; i < len; i++){
                if (students[i] == sandwiches[k]){
                    cnt++;
                    haha = true;
                }
            }
            k++;
            if (!haha) return len - cnt;
        } return 0;
    }
}