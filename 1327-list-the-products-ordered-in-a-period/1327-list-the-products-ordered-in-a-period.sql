# Write your MySQL query statement below
SELECT P.product_name, SUM(O.unit) 'unit'
FROM Products P
JOIN Orders O
ON P.product_id = O.product_id
WHERE YEAR(O.order_date) = '2020' AND MONTH(O.order_date) = '02'
GROUP BY P.product_id
HAVING SUM(O.unit) >= 100;