# Write a solution to find for each user, the join date and the number of orders they made as a buyer in 2019.
SELECT user_id 'buyer_id', join_date, COUNT(order_id) 'orders_in_2019'
FROM Users U
LEFT JOIN Orders O
ON user_id = buyer_id AND YEAR(O.order_date) = '2019'
GROUP BY user_id;