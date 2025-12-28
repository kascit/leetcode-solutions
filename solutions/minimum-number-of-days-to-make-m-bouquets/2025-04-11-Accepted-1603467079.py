"""
Submission: 1603467079
Problem: Minimum Number of Days to Make m Bouquets (Medium)
Status: Accepted
Language: python3
Timestamp: 2025-04-11 08:19:55 UTC
Runtime: 502 ms
Memory: 31.6 MB
"""

class Solution:
    def minDays(self, b: List[int], m: int, k: int) -> int:
        return k*m<=len(b) and bisect_left(range(max(b)),1,key=lambda d:sum(v*sum(map(bool,p))//k for v,p in groupby(b,d.__ge__))>=m) or -1