/*
 * Submission: 1702496804
 * Problem: Minimum Hours of Training to Win a Competition (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-18 14:14:42 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int tot = Arrays.stream(energy).sum(), morE = (tot > initialEnergy) ? tot - initialEnergy + 1 : 0;
        //System.out.println(morE);
         for(int i = 0; i < experience.length; i++){
            if (initialExperience > experience[i]) {
                initialExperience += experience[i];
            } else {
                morE += experience[i] - initialExperience + 1;
                initialExperience += experience[i];

            }
         }
         return morE;
    }
}