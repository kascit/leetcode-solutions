/*
Submission: 1838409056
Status: Accepted
Timestamp: 2025-11-24 10:08:18 UTC
Runtime: 1267 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
select product_name, year, price from sales, product where sales.product_id = product.product_id;