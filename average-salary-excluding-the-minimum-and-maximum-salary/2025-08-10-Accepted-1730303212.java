/*
 * Submission: 1730303212
 * Problem: Average Salary Excluding the Minimum and Maximum Salary (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 16:09:36 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class Solution {
    public double average(int[] salary) {
        double max = 1000;
        double min = 1e6;
        double sum = 0;
        for(int sal : salary){
            if (sal > max) max = sal;
            if (sal < min) min = sal;
            sum += sal;
        } return (sum - max - min)/(salary.length-2);
    }
}