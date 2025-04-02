-- 분화된 연도(YEAR), 분화된 연도별 대장균 크기의 편차(YEAR_DEV), 대장균 개체의 ID(ID) 를 출력하는 SQL 문을 작성해주세요. 분화된 연도별 대장균 크기의 편차는 분화된 연도별 가장 큰 대장균의 크기 - 각 대장균의 크기로 구하며 결과는 연도에 대해 오름차순으로 정렬하고 같은 연도에 대해서는 대장균 크기의 편차에 대해 오름차순으로 정렬해주세요.
WITH TBL AS     (
                    SELECT MAX(SIZE_OF_COLONY) 'MAX_SIZE_OF_COLONY', YEAR(DIFFERENTIATION_DATE) 'YEAR'
                    FROM ECOLI_DATA 
                    GROUP BY YEAR(DIFFERENTIATION_DATE)
                )

SELECT YEAR(DIFFERENTIATION_DATE) 'YEAR'
    ,   (
            SELECT MAX_SIZE_OF_COLONY 
            FROM TBL 
            WHERE YEAR = YEAR(DIFFERENTIATION_DATE)
        ) - SIZE_OF_COLONY 'YEAR_DEV'
    , ID
FROM ECOLI_DATA
ORDER BY YEAR, YEAR_DEV;