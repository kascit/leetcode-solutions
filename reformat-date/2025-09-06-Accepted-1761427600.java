/*
 * Submission: 1761427600
 * Problem: Reformat Date (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:51:23 UTC
 * Runtime: 6 ms
 * Memory: 42.1 MB
 */

class Solution {
    private static final Map<String, String> MONTHS = new HashMap<>();
    static {
        MONTHS.put("Jan", "01"); MONTHS.put("Feb", "02");
        MONTHS.put("Mar", "03"); MONTHS.put("Apr", "04");
        MONTHS.put("May", "05"); MONTHS.put("Jun", "06");
        MONTHS.put("Jul", "07"); MONTHS.put("Aug", "08");
        MONTHS.put("Sep", "09"); MONTHS.put("Oct", "10");
        MONTHS.put("Nov", "11"); MONTHS.put("Dec", "12");
    }

    public String reformatDate(String date) {
        int firstSpace = date.indexOf(' ');
        int secondSpace = date.indexOf(' ', firstSpace + 1);

        String day = formatDay(date.substring(0, firstSpace));
        String month = MONTHS.get(date.substring(firstSpace + 1, secondSpace));
        String year = date.substring(secondSpace + 1);

        return year + "-" + month + "-" + day;
    }

    private String formatDay(String d) {
        return d.length() == 3 ? "0" + d.charAt(0) : d.substring(0, 2);
    }
}
