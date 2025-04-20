# Write an SQL query to find for each month and country, the number of transactions and their total amount, the number of approved transactions and their total amount.
SELECT LEFT(trans_date, 7) 'month'
    , country
    , COUNT(*) 'trans_count'
    , SUM(state = 'approved') 'approved_count'
    , SUM(amount) 'trans_total_amount'
    , SUM((state = 'approved') * amount) 'approved_total_amount'
FROM Transactions
GROUP BY month, country;