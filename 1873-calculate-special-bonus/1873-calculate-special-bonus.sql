# Write your MySQL query statement below
SELECT employee_id, salary 'bonus'
FROM Employees
WHERE employee_id % 2 <> 0 AND name NOT LIKE 'M%'

UNION

SELECT employee_id, 0 'bonus'
FROM Employees
WHERE employee_id % 2 = 0 OR name LIKE 'M%'
ORDER BY 1;