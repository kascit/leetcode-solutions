/*
 * Submission: 1702509332
 * Problem: Minimum Hours of Training to Win a Competition (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 14:28:04 UTC
 * Runtime: 0 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int tot = 0, morE = 0; 
        //System.out.println(tot + " " + morE);
         for(int i = 0; i < experience.length; i++){
            tot += energy[i];
            if (initialExperience <= experience[i]) {
                int incr = experience[i] - initialExperience + 1;
                morE += incr;
                initialExperience += incr;

            }
            initialExperience += experience[i];
            //System.out.println(initialExperience + " " + morE);
         }
         morE += (!(tot < initialEnergy)) ? tot - initialEnergy + 1 : 0;
         return morE;
    }
}