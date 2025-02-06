# Write your MySQL query statement below
SELECT DISTINCT U.name 'NAME', T.BALANCE
FROM Users U
JOIN (
    SELECT account, SUM(amount) 'BALANCE'
    FROM TRANSACTIONS T
    GROUP BY 1
    HAVING BALANCE > 10000) T
ON U.account = T.account