/*
 * Submission: 1603982613
 * Problem: Guess Number Higher or Lower (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-04-11 19:55:52 UTC
 * Runtime: N/A
 * Memory: N/A
 */

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0, r = n;
        while (l <= r){
            int mid = (l + r)/2;
            int c = guess(mid);
            if ( c == 0) return mid;
            else if (c < 0 ) r = mid -1;
            else l = mid + 1; 
        }
        return -1;
    }
}