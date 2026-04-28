# Write your MySQL query statement below
SELECT DISTINCT num AS ConsecutiveNums
FROM (
    SELECT 
        num,
        LEAD(num, 1) OVER (ORDER BY id) AS next_val,
        LEAD(num, 2) OVER (ORDER BY id) AS next_next_val
    FROM Logs
) subquery
WHERE num = next_val AND num = next_next_val;