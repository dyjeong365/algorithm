/*
For this problem, we will consider a manager an employee who has at least 1 other employee reporting to them.

Write a solution to report the ids and the names of all managers, the number of employees who report directly to them, and the average age of the reports rounded to the nearest integer.

Return the result table ordered by employee_id.
*/
SELECT mgr.employee_id, mgr.name, COUNT(emp.employee_id) 'reports_count', ROUND(AVG(emp.age), 0) 'average_age'
FROM Employees emp, Employees mgr
WHERE mgr.employee_id = emp.reports_to
GROUP BY mgr.employee_id
ORDER BY mgr.employee_id;