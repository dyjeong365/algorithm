-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SUBSTRING_INDEX(DATETIME, ' ', 1) AS 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;