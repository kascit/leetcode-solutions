/*
 * Submission: 1733628670
 * Problem: Finding 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 11:07:52 UTC
 * Runtime: 2 ms
 * Memory: 44.7 MB
 */

class Solution {
    private static int[] freqs = new int[450];
    static {
        int idx = 0;
        for (int i = 100; i < 999; i+=2){
            int nfreq = 0;
            int TEMP = i;
            while ( i > 0 ){
                int it = ((i % 10) * 3);
                if ( (nfreq & (1 << (it))) == 0)
                    nfreq |= 1 << it;
                else if (((nfreq & (1 << ((it)+1))) == 0))
                    nfreq |= (1 << ((it)+1));
                else 
                    nfreq |= (1 << ((it)+2));
                i /= 10;
            } i = TEMP;
            freqs[idx++] = nfreq;
        }
    }
    public int[] findEvenNumbers(int[] digits) {
        int freq = 0;
        boolean hasEven = false;
        for(int i : digits){
            int cur = i*3;
            if (!hasEven && (i&1) == 0 ) hasEven = true;
            if ( (freq & (1 << (cur))) == 0)
                freq |= 1 << cur;
            else if (((freq & (1 << ((cur)+1))) == 0))
                freq |= (1 << ((cur)+1));
            else
                freq |= (1 << ((cur)+2));
                
        }
        // System.out.println(Integer.toBinaryString(freq));
        if (!hasEven) return new int[0];

        //List<Integer> list = new ArrayList<>();
        int[] result = new int[9*10*5];
        int idx = 0;
        for (int i = 0; i < 450; i++) {
            int cur = freqs[i];
            if ( ( cur&freq ) == cur ) {
                // System.out.println(Integer.toBinaryString(cur));
                result[idx++] = (100+(i*2));
                // list.add(100+(i*2));
            }
        }
        
        // int[] arr = new int[list.size()];
        // for (int i = 0; i < list.size(); i++) {
        //     arr[i] = list.get(i);
        // }
        // return arr;
        return Arrays.copyOfRange(result, 0, idx);

    }
}