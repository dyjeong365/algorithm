# Write your MySQL query statement below
SELECT actor_id, director_id
FROM (
    SELECT actor_id, director_id, COUNT(timestamp) 'cooperated'
    FROM ActorDirector
    GROUP BY actor_id, director_id
) AD
WHERE cooperated >= 3;