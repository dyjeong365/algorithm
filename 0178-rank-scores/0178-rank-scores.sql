# Write your MySQL query statement below
SELECT
    score,
    (SELECT COUNT(*) FROM (SELECT DISTINCT score FROM Scores) tmp WHERE tmp.score >= S.score) 'RANK'
FROM Scores S
ORDER BY score DESC;