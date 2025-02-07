# Write your MySQL query statement below
SELECT name 'Employee'
FROM Employee e1
WHERE (
    SELECT salary
    FROM Employee e2
    WHERE e1.managerId = e2.id
) < e1.salary;