/*
 * Submission: 1835956024
 * Problem: Number of Days Between Two Dates (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 11:43:31 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1990(date1) - daysFrom1990(date2));
    }

    private int daysFrom1990(String date) {
        int[] sumDays = { 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };
        int days = 0;

        int year =  Integer.valueOf(date.substring(0, 4));
        int month = Integer.valueOf(date.substring(5, 7)) - 1;
        int day = Integer.valueOf(date.substring(8));

        for (int i = 1900; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }

        if (month > 0) {
            int add = sumDays[month - 1];
            if (month >= 2 && isLeapYear(year)) {
                add++;
            }
            days += add;
        }

        return days + day;
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}