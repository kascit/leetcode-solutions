/*
Submission: 1838423286
Status: Accepted
Timestamp: 2025-11-24 10:30:37 UTC
Runtime: 224 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
UPDATE Salary
SET sex = CASE
            WHEN sex = 'm' THEN 'f'
            ELSE 'm'
          END;
