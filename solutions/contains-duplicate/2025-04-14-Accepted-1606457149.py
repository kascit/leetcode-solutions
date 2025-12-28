"""
Submission: 1606457149
Problem: Contains Duplicate (Easy)
Status: Accepted
Language: python3
Timestamp: 2025-04-14 10:01:36 UTC
Runtime: 8 ms
Memory: 31.6 MB
"""

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        if len(set(nums)) == len(nums):
            return False
        else:
            return True 