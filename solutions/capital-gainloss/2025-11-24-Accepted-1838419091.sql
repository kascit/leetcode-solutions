/*
Submission: 1838419091
Status: Accepted
Timestamp: 2025-11-24 10:23:59 UTC
Runtime: 1407 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
select 
	stock_name,
	sum(case when operation = 'Sell' then price else -price end) as capital_gain_loss
from Stocks
group by stock_name