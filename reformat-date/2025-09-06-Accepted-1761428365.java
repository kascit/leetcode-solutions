/*
 * Submission: 1761428365
 * Problem: Reformat Date (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:52:28 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public String reformatDate(String date) {
        int n = date.length();
        // String[] arr = date.split("\\s+");
        String[] keys = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        StringBuilder sb = new StringBuilder();
        // sb.append(arr[2]).append("-"); 
        sb.append(date.substring(n-4)).append("-");
        String month = (n==12)? date.substring(4,7):date.substring(5,8);
        for(int i=0;i<12;i++){
            if(keys[i].equals(month)){ //arr[1]
                if(i+1<10){
                    sb.append("0");
                }
                sb.append(i+1).append("-");
                break;
            }
        }
        int k=0;
        for(int i=0;i<2;i++){
            if(Character.isDigit(date.charAt(i))){
                k++;
            }
        }
        if(k==1){
            sb.append("0").append(date.substring(0,1));
        }
        else{
            sb.append(date.substring(0,2));
        }
        return sb.toString();
    }
}