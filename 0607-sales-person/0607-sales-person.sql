# Write your MySQL query statement below
SELECT name
FROM SalesPerson
WHERE name NOT IN
(
    SELECT P.name
    FROM SalesPerson P, Company C, Orders O
    WHERE P.sales_id = O.sales_id AND O.com_id = C.com_id AND C.name = 'RED'
);