/*
 * Submission: 1761428150
 * Problem: Reformat Date (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:52:11 UTC
 * Runtime: 1 ms
 * Memory: 41.7 MB
 */

class Solution {
    static Map<String, String> map = new HashMap<>();
    String num = "0123456789";
    static{
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
    }
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] dates = date.split(" ");

        sb.append(dates[2]);
        sb.append("-");
        sb.append(map.get(dates[1]));
        sb.append("-");
        int ind = 0;
        while(num.indexOf(dates[0].charAt(ind)) != -1){
            ind++;
        }
        if(ind == 1){
            sb.append("0");
            sb.append(dates[0].substring(0, ind));
        }else{
            sb.append(dates[0].substring(0, ind));
        }
        return sb.toString();
    }
}