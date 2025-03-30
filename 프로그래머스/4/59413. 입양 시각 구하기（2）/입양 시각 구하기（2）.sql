-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.
WITH RECURSIVE TBL AS   (
                            SELECT 0 'HOUR'
                            UNION ALL
                            SELECT HOUR + 1
                            FROM TBL
                            WHERE HOUR < 23
                        )

SELECT T.HOUR 'HOUR', COUNT(A.ANIMAL_ID) 'COUNT'
FROM TBL T
LEFT JOIN ANIMAL_OUTS A
ON T.HOUR = HOUR(A.DATETIME)
GROUP BY T.HOUR
ORDER BY T.HOUR;