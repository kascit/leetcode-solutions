/*
Submission: 1838391629
Status: Accepted
Timestamp: 2025-11-24 09:41:00 UTC
Runtime: 493 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
select event_day as day, emp_id, sum(out_time-in_time) as total_time from employees group by day, emp_id;