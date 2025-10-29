# Write your MySQL query statement below
SELECT e.name
FROM Employee as e
JOIN(SELECT managerId 
FROM Employee
WHERE managerId IS NOT NULL
GROUP BY managerID
HAVING COUNT(*)>=5)
m ON e.id=m.managerId;