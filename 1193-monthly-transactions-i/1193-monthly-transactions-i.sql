# Write an SQL query to find for each month and country, the number of transactions and their total amount, the number of approved transactions and their total amount.
SELECT SUBSTRING(trans_date, 1, 7) 'month'
    , country
    , COUNT(*) 'trans_count'
    , SUM(IF(state = 'approved', 1, 0)) 'approved_count'
    , SUM(amount) 'trans_total_amount'
    , SUM(IF(state = 'approved', amount, 0)) 'approved_total_amount'
FROM Transactions
GROUP BY SUBSTRING(trans_date, 1, 7), country;