/*
DEVELOPERS 테이블에서 GRADE별 개발자의 정보를 조회하려 합니다. GRADE는 다음과 같이 정해집니다.

A : Front End 스킬과 Python 스킬을 함께 가지고 있는 개발자
B : C# 스킬을 가진 개발자
C : 그 외의 Front End 개발자
GRADE가 존재하는 개발자의 GRADE, ID, EMAIL을 조회하는 SQL 문을 작성해 주세요.

결과는 GRADE와 ID를 기준으로 오름차순 정렬해 주세요.
*/
WITH TBL AS     (
                    SELECT CASE
                                WHEN SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python') > 0 
                                    AND SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE CATEGORY = 'Front End') > 0 THEN 'A'
                                WHEN SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE NAME = 'C#') > 0 THEN 'B'
                                WHEN SKILL_CODE & (SELECT SUM(CODE) FROM SKILLCODES WHERE CATEGORY = 'Front End') > 0 THEN 'C'
                            END 'GRADE'
                            , ID
                            , EMAIL
                    FROM DEVELOPERS
                )

SELECT *
FROM TBL
WHERE GRADE IS NOT NULL
ORDER BY GRADE, ID;