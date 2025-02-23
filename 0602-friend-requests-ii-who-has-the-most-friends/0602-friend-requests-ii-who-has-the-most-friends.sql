# Write your MySQL query statement below
SELECT U.requester_id 'id', COUNT(U.requester_id) 'num'
FROM 
    (
        SELECT requester_id
        FROM RequestAccepted
        UNION ALL
        SELECT accepter_id
        FROM RequestAccepted
    ) U
GROUP BY U.requester_id
ORDER BY num DESC
LIMIT 1;