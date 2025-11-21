/*
 * Submission: 1761427420
 * Problem: Reformat Date (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:51:09 UTC
 * Runtime: 9 ms
 * Memory: 42.3 MB
 */

class Solution {
    private static final String[] MONTHS = {
        "Jan","Feb","Mar","Apr","May","Jun",
        "Jul","Aug","Sep","Oct","Nov","Dec"
    };

    public String reformatDate(String date) {
        int firstSpace = date.indexOf(' ');
        int secondSpace = date.indexOf(' ', firstSpace + 1);

        String day = formatDay(date.substring(0, firstSpace));

        String monthStr = date.substring(firstSpace + 1, secondSpace);
        String month = getMonth(monthStr);

        String year = date.substring(secondSpace + 1);

        return year + "-" + month + "-" + day;
    }

    private String formatDay(String d) {
        return d.length() == 3 ? "0" + d.charAt(0) : d.substring(0, 2);
    }

    private String getMonth(String m) {
        for (int i = 0; i < 12; i++) {
            if (MONTHS[i].equals(m)) {
                return (i < 9 ? "0" : "") + (i + 1);
            }
        }
        return "??";
    }
}
