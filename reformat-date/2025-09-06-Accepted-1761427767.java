/*
 * Submission: 1761427767
 * Problem: Reformat Date (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:51:37 UTC
 * Runtime: 5 ms
 * Memory: 41.8 MB
 */

class Solution {
    public String reformatDate(String date) {
        String[] buh = date.split(" ");
        return buh[2] + "-" + month(buh[1]) + "-" + day(buh[0]);
    }

    private String month(String m) {
        switch (m) {
        case "Jan": return "01";
        case "Feb": return "02";
        case "Mar": return "03";
        case "Apr": return "04";
        case "May": return "05";
        case "Jun": return "06";
        case "Jul": return "07";
        case "Aug": return "08";
        case "Sep": return "09";
        case "Oct": return "10";
        case "Nov": return "11";
        case "Dec": return "12";
        default:    return "??";
        }
    }

    private String day(String d) {
        if(Character.isDigit(d.charAt(1))) return d.substring(0,2);
        return "0"+d.substring(0,1);
    }
}