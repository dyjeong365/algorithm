# Write your MySQL query statement below
SELECT U.name, IFNULL(SUM(R.distance), 0) 'travelled_distance'
FROM USERS U
LEFT JOIN Rides R
ON U.id = R.user_id
GROUP BY R.user_id
ORDER BY SUM(R.distance) DESC, name ASC;