/*
For this problem, we will consider a manager an employee who has at least 1 other employee reporting to them.

Write a solution to report the ids and the names of all managers, the number of employees who report directly to them, and the average age of the reports rounded to the nearest integer.

Return the result table ordered by employee_id.
*/
SELECT employee_id, name, reports_count, average_age
FROM Employees e1
    ,   ( 
            SELECT reports_to, COUNT(*) 'reports_count', ROUND(AVG(age), 0) 'average_age'
            FROM Employees
            GROUP BY reports_to
        ) e2
WHERE e1.employee_id = e2.reports_to
ORDER BY e1.employee_id;