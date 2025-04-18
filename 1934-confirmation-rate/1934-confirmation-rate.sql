/*
The confirmation rate of a user is the number of 'confirmed' messages divided by the total number of requested confirmation messages. The confirmation rate of a user that did not request any confirmation messages is 0. Round the confirmation rate to two decimal places.

Write a solution to find the confirmation rate of each user.
*/
WITH TBL AS (
    SELECT C1.user_id, (numerator / denominator) 'confirmation_rate'
    FROM (SELECT user_id, COUNT(*) 'denominator' FROM Confirmations GROUP BY user_id) C1, (SELECT user_id, COUNT(*) 'numerator' FROM Confirmations WHERE action = 'confirmed' GROUP BY user_id) C2
    WHERE C1.user_id = C2.user_id
)

SELECT S.user_id, ROUND(IFNULL(confirmation_rate, 0), 2) 'confirmation_rate'
FROM Signups S
LEFT JOIN TBL T
ON S.user_id = T.user_id