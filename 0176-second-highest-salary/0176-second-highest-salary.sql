# Write a solution to find the second highest distinct salary from the Employee table. If there is no second highest salary, return null
SELECT IF(COUNT(*) > 0, salary, null) 'SecondHighestSalary'
FROM (
    SELECT id, salary, DENSE_RANK() OVER(ORDER BY salary DESC) 'rnk' 
    FROM Employee
) E
WHERE rnk = 2;