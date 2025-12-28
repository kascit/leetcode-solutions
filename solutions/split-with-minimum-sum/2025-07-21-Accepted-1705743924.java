/*
 * Submission: 1705743924
 * Problem: Split With Minimum Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 09:32:17 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public int splitNum(int num) {
        int[] freq = new int[10];
        while(num > 0){
            freq[num%10]++;
            num /= 10;
        }
        //System.out.println(Arrays.toString(freq));

        int first = 0, second = 0;
        boolean flag = true;
        for (int i = 1; i < 10;){
            while (i < 10 && freq[i] < 1) i++;
            if ( i == 10 ) break;
            //System.out.println(i + " " + freq[i]);
            if (flag){
                first *= 10;
                first += i;
                
            } else {
                second *= 10;
                second += i;
            }
            freq[i]--;
            flag = !flag;
            //System.out.println(i + " " + freq[i]);
        }
        
        return first + second;
    }
}