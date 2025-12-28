/*
Submission: 1838410961
Status: Accepted
Timestamp: 2025-11-24 10:11:19 UTC
Runtime: 575 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
select tweet_id from tweets where length(content) > 15;