/*
 * Submission: 1835955547
 * Problem: Number of Days Between Two Dates (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 11:42:35 UTC
 * Runtime: 7 ms
 * Memory: 43.4 MB
 */

import java.time.LocalDate;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return (int) (Math.abs(toEpochDays(date1)-toEpochDays(date2)));
    }
    public static long toEpochDays(String date) {
        LocalDate d = LocalDate.parse(date);
        return d.toEpochDay();              
    }
}

