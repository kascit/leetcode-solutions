/*
 * Submission: 1730091540
 * Problem: Reordered Power of 2 (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 12:29:42 UTC
 * Runtime: 1 ms
 * Memory: 40.8 MB
 */

class Solution {
    private List<String> ans=Arrays.asList(new String[]
    {
            "011237","0122579","012356789","0124","0134449", "0145678","01466788","0248","0368888","0469","1","112234778","11266777","122446","125","128","1289","13468","16","2","224588","23","23334455","234455668","23678","256","35566","4","46","8"
        });

    public boolean reorderedPowerOf2(int n) {
        String str = Integer.toString(n);

    char[] chars = str.toCharArray();
    Arrays.sort(chars);

    String sorted = new String(chars);
    return ans.contains(sorted);
    }
}