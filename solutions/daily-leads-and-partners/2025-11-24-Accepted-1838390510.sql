/*
Submission: 1838390510
Status: Accepted
Timestamp: 2025-11-24 09:39:12 UTC
Runtime: 476 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
select date_id, make_name, count(distinct lead_id) as unique_leads, count(distinct partner_id) as unique_partners from dailysales group by date_id, make_name;