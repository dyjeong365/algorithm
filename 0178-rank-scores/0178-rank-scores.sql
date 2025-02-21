# Write your MySQL query statement below
SELECT
    score,
    (SELECT COUNT(DISTINCT score) FROM Scores WHERE score >= S.score) 'RANK'
FROM Scores S
ORDER BY score DESC;