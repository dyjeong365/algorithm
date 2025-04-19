# Write a solution to find managers with at least five direct reports.
WITH TBL AS (
    SELECT mgr.name, COUNT(*) 'cnt'
    FROM Employee emp, Employee mgr
    WHERE emp.managerId = mgr.id
    GROUP BY mgr.id 
)

SELECT name
FROM TBL
WHERE cnt >= 5;