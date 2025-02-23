# Write your MySQL query statement below
WITH all_ids AS (
                    SELECT requester_id 'id'
                    FROM RequestAccepted
                    UNION ALL
                    SELECT accepter_id 'id'
                    FROM RequestAccepted        
                )
SELECT id, num
FROM (
        SELECT id, COUNT(id) 'num', RANK() OVER(ORDER BY COUNT(id) DESC) 'place'
        FROM all_ids
        GROUP BY id
    ) R
WHERE place = 1;