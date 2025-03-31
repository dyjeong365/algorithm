-- 3세대의 대장균의 ID(ID) 를 출력하는 SQL 문을 작성해주세요. 이때 결과는 대장균의 ID 에 대해 오름차순 정렬해주세요.
SELECT 3G.ID
FROM    (
            SELECT *
            FROM ECOLI_DATA
            WHERE PARENT_ID IS NULL
        ) 1G
        , ECOLI_DATA 2G
        , ECOLI_DATA 3G
WHERE 1G.ID = 2G.PARENT_ID 
AND 2G.ID = 3G.PARENT_ID
ORDER BY 3G.ID;