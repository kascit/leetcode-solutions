/*
Submission: 1838382210
Status: Accepted
Timestamp: 2025-11-24 09:26:38 UTC
Runtime: 475 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
select teacher_id, count(distinct subject_id) as cnt from teacher group by teacher_id;