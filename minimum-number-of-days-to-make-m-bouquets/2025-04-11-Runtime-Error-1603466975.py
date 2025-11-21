"""
Submission: 1603466975
Problem: Minimum Number of Days to Make m Bouquets (Medium)
Status: Runtime Error
Language: python
Timestamp: 2025-04-11 08:19:47 UTC
Runtime: N/A
Memory: N/A
"""

class Solution:
    def minDays(self, b: List[int], m: int, k: int) -> int:
        return k*m<=len(b) and bisect_left(range(max(b)),1,key=lambda d:sum(v*sum(map(bool,p))//k for v,p in groupby(b,d.__ge__))>=m) or -1