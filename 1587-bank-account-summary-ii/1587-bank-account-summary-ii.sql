# Write your MySQL query statement below
SELECT U.name 'NAME', SUM(T.amount) 'BALANCE'
FROM Transactions T
LEFT JOIN Users U
ON T.account = U.account
GROUP BY U.account
HAVING BALANCE > 10000;