# Write your MySQL query statement below
SELECT DISTINCT user_id, FIRST_VALUE(time_stamp)OVER(PARTITION BY user_id ORDER BY time_stamp DESC) 'last_stamp'
FROM Logins
WHERE EXTRACT(Year FROM time_stamp) = 2020;