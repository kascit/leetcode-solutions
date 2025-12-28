/*
Submission: 1838395939
Status: Accepted
Timestamp: 2025-11-24 09:48:04 UTC
Runtime: 526 ms
Memory: 0.0B
*/

# Write your MySQL query statement below
SELECT product_id, 'store1' AS store, store1 AS price
FROM Products
WHERE store1 IS NOT NULL

UNION ALL

SELECT product_id, 'store2' AS store, store2 AS price
FROM Products
WHERE store2 IS NOT NULL

UNION ALL

SELECT product_id, 'store3' AS store, store3 AS price
FROM Products
WHERE store3 IS NOT NULL;
