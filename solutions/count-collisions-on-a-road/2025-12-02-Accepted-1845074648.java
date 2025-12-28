/*
Submission: 1845074648
Status: Accepted
Timestamp: 2025-12-02 14:13:01 UTC
Runtime: 86 ms
Memory: 48.1 MB
*/

class Solution {
    public int countCollisions(String directions) {
      int ans = 0;
        Stack<Character> stack = new Stack<>();
        for (char ch : directions.toCharArray()) {
          if (ch == 'L') {
            if (stack.isEmpty()) continue;
            else {
              if (stack.peek() == 'S') {
                ans++;
              } else {
                stack.pop();
                ans+=2;
                while (!stack.isEmpty() && stack.peek() == 'R') {
                  stack.pop();
                  ans++;
                } stack.push('S');
              }
            }

          } else if (ch == 'R') stack.push(ch);
          else {
            while (!stack.isEmpty() && stack.peek() == 'R') {
              stack.pop();
              ans++;
            }
            stack.push(ch);
          }
        } return ans;
    }
}