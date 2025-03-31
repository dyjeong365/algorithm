-- 3세대의 대장균의 ID(ID) 를 출력하는 SQL 문을 작성해주세요. 이때 결과는 대장균의 ID 에 대해 오름차순 정렬해주세요.
WITH RECURSIVE TBL AS   (
                            SELECT ID, PARENT_ID, 1 'GENERATION'
                            FROM ECOLI_DATA
                            WHERE PARENT_ID IS NULL
                            UNION
                            SELECT E.ID, E.PARENT_ID, GENERATION + 1
                            FROM ECOLI_DATA E, TBL T
                            WHERE E.PARENT_ID = T.ID
                        )
SELECT ID
FROM TBL
WHERE GENERATION = 3
ORDER BY ID;