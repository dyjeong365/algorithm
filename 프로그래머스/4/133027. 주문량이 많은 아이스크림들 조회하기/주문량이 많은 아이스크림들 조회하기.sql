-- 7월 아이스크림 총 주문량과 상반기의 아이스크림 총 주문량을 더한 값이 큰 순서대로 상위 3개의 맛을 조회하는 SQL 문을 작성해주세요.
SELECT FLAVOR
FROM    (
            SELECT *
            FROM FIRST_HALF
            UNION ALL
            SELECT *
            FROM JULY
        ) J
GROUP BY FLAVOR
ORDER BY SUM(TOTAL_ORDER) DESC
LIMIT 3;