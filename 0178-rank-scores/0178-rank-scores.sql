# Write your MySQL query statement below
SELECT S.score, COUNT(DISTINCT T.score) 'RANK'
FROM Scores S
JOIN Scores T
ON S.score <= T.score
GROUP BY S.id
ORDER BY S.score DESC;