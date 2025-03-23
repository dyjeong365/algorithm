/*
HR_DEPARTMENT, HR_EMPLOYEES, HR_GRADE 테이블을 이용해 사원별 성과금 정보를 조회하려합니다. 평가 점수별 등급과 등급에 따른 성과금 정보가 아래와 같을 때, 사번, 성명, 평가 등급, 성과금을 조회하는 SQL문을 작성해주세요.

평가등급의 컬럼명은 GRADE로, 성과금의 컬럼명은 BONUS로 해주세요.
결과는 사번 기준으로 오름차순 정렬해주세요.
*/
SELECT E.EMP_NO, EMP_NAME,
    CASE 
        WHEN SCORE >= 96 THEN 'S'
        WHEN SCORE >= 90 THEN 'A'
        WHEN SCORE >= 80 THEN 'B'
        ELSE 'C'
    END 'GRADE', 
    CASE 
        WHEN SCORE >= 96 THEN SAL * 0.2
        WHEN SCORE >= 90 THEN SAL * 0.15
        WHEN SCORE >= 80 THEN SAL * 0.1
        ELSE 0
    END 'BONUS'
FROM HR_DEPARTMENT D, HR_EMPLOYEES E,   (
                                            SELECT EMP_NO, AVG(SCORE) 'SCORE'
                                            FROM HR_GRADE
                                            GROUP BY EMP_NO
                                        ) G
WHERE D.DEPT_ID = E.DEPT_ID AND E.EMP_NO = G.EMP_NO
ORDER BY E.EMP_NO;