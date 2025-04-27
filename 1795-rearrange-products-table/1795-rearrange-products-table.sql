# Write a solution to rearrange the Products table so that each row has (product_id, store, price). If a product is not available in a store, do not include a row with that product_id and store combination in the result table.
WITH P AS
            (
                SELECT product_id,  'store1' AS store, store1 'price'
                FROM Products
                UNION
                SELECT product_id,  'store2' AS store, store2 'price'
                FROM Products
                UNION
                SELECT product_id,  'store3' AS store, store3 'price'
                FROM Products
            )

SELECT product_id, store, price
FROM P
WHERE price IS NOT NULL