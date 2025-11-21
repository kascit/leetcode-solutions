"""
Submission: 1603546095
Problem: Sort Characters By Frequency (Medium)
Status: Accepted
Language: python3
Timestamp: 2025-04-11 10:15:56 UTC
Runtime: 7 ms
Memory: 19 MB
"""

class Solution:
    def frequencySort(self, s: str) -> str:
        return ''.join(c*f for c,f in Counter(s).most_common())