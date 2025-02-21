# Write your MySQL query statement below
SELECT 
    score,
    @rank := @rank + (@prev <> (@prev := score)) 'RANK'
FROM
    Scores,
    (SELECT @rank := 0, @prev := -1) INIT
ORDER BY score DESC;