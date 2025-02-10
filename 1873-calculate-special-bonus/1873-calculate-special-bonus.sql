# Write your MySQL query statement below
SELECT employee_id, IF(employee_id % 2 != 0 && name NOT LIKE 'M%', salary, 0) 'bonus'
FROM Employees
ORDER BY 1;