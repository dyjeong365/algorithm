# Write your MySQL query statement below
SELECT *
FROM products
WHERE description LIKE '%SN____-____ %' OR description LIKE '%SN____-____'
ORDER BY product_id;