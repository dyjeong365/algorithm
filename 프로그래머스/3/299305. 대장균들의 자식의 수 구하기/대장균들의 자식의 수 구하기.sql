-- 대장균 개체의 ID(ID)와 자식의 수(CHILD_COUNT)를 출력하는 SQL 문을 작성해주세요. 자식이 없다면 자식의 수는 0으로 출력해주세요. 이때 결과는 개체의 ID 에 대해 오름차순 정렬해주세요.
SELECT D1.ID, COUNT(D2.PARENT_ID) 'CHILD_COUNT'
FROM ECOLI_DATA D1
LEFT JOIN   (
                SELECT PARENT_ID
                FROM ECOLI_DATA             
            ) D2
ON D1.ID = D2.PARENT_ID
GROUP BY D1.ID
ORDER BY D1.ID;