/*
Employees can belong to multiple departments. When the employee joins other departments, they need to decide which department is their primary department. Note that when an employee belongs to only one department, their primary column is 'N'.

Write a solution to report all the employees with their primary department. For employees who belong to one department, report their only department.
*/
SELECT employee_id, department_id
FROM (
    SELECT employee_id, department_id, primary_flag, COUNT(employee_id) 'count'
    FROM Employee
    GROUP BY employee_id
    HAVING count = 1
    UNION
    SELECT employee_id, department_id, primary_flag, 0
    FROM Employee
    WHERE primary_flag = 'Y'
) E