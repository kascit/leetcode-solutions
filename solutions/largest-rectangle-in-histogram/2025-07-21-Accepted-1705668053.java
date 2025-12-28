/*
 * Submission: 1705668053
 * Problem: Largest Rectangle in Histogram (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 08:14:36 UTC
 * Runtime: 111 ms
 * Memory: 57.2 MB
 */

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> prevSmall = new Stack<>();
        Stack<Integer> nextSmall = new Stack<>();
        int len = heights.length;
        int[] prev = new int[len], next = new int[len];
        
        int max = 0;
        for ( int i = 0; i < len; i++ ){

            while(!prevSmall.isEmpty() && heights[prevSmall.peek()] >= heights[i]){
                prevSmall.pop();
            }
            prev[i] = (!prevSmall.isEmpty()) ? prevSmall.peek() : -1 ;
            prevSmall.push(i);
            
        }

        for ( int i = len - 1; i >= 0; i-- ){

            while(!nextSmall.isEmpty() && heights[nextSmall.peek()] >= heights[i]){
                nextSmall.pop();
            }
            next[i] = (!nextSmall.isEmpty()) ? nextSmall.peek() : len ;
            nextSmall.push(i);
            
        }
        
        //System.out.println(Arrays.toString(prev));
        //System.out.println(Arrays.toString(next));
        for ( int i = 0; i < len; i++ ){
                max = Math.max(max,heights[i] * (next[i] - 1 - prev[i]));
            
        }
        return max;
    }
}