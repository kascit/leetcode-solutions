/*
Submission: 1837883949
Status: Accepted
Timestamp: 2025-11-23 18:05:33 UTC
Runtime: 4 ms
Memory: 83.3 MB
*/

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int min = 100000, max = 1;
        for (int c : costs) {
            if (c > max) max = c;
            if (c < min) min = c;
        }
        int[] freq = new int[max-min+1];
        for (int c : costs) {
            freq[c-min]++;
        }
        // System.out.println(Arrays.toString(freq));
        int ans = 0;
        for(int i = 0; i < freq.length;) {
            if (freq[i] > 0) {
            // System.out.println("valid i: val "+i+min);
                if (i+min<=coins) {
                    // System.out.println("coins");
                    coins -= i + min;
                    freq[i]--;
                    ans++;
                } else break;
            } else i++;
        } return ans;
    }
}