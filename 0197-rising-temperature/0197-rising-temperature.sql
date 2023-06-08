# Write your MySQL query statement below
# SELECT W1.id
# FROM Weather W1, Weather W2
# WHERE W1.temperature > W2.temperature AND DATEDIFF(W1.recordDate, W2.recordDate) = 1;

SELECT weather.id
FROM weather
JOIN weather w
ON DATEDIFF(weather.recordDate, w.recordDate) = 1 AND weather.temperature > w.temperature;
