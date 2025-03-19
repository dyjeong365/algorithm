-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
SELECT FLAVOR
FROM    (
            SELECT FLAVOR, SUM(TOTAL_ORDER) 'TOTAL_ORDERS'
            FROM FIRST_HALF
            GROUP BY FLAVOR
            UNION ALL
            SELECT FLAVOR, SUM(TOTAL_ORDER)
            FROM JULY
            GROUP BY FLAVOR
        ) COMBINED
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDERS) DESC
LIMIT 3;