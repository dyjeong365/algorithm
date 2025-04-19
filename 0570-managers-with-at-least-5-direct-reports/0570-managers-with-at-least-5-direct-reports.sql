# Write your MySQL query statement below
SELECT mgr.name
FROM Employee emp, Employee mgr
WHERE emp.managerId = mgr.id
GROUP BY mgr.id
HAVING COUNT(*) >= 5;