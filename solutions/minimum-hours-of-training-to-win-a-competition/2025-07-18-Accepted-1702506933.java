/*
 * Submission: 1702506933
 * Problem: Minimum Hours of Training to Win a Competition (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 14:25:31 UTC
 * Runtime: 2 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int tot = Arrays.stream(energy).sum(), morE = (!(tot < initialEnergy)) ? tot - initialEnergy + 1 : 0;
        //System.out.println(tot + " " + morE);
         for(int i = 0; i < experience.length; i++){
            
            if (initialExperience <= experience[i]) {
                int incr = experience[i] - initialExperience + 1;
                morE += incr;
                initialExperience += incr;

            }
            initialExperience += experience[i];
            //System.out.println(initialExperience + " " + morE);
         }
         return morE;
    }
}