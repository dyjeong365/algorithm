-- 코드를 입력하세요
SELECT BOOK_ID, SUBSTRING_INDEX(PUBLISHED_DATE, ' ', 1) AS PUBLISHED_DATE
FROM BOOK
WHERE CATEGORY = '인문' AND PUBLISHED_DATE LIKE '2021%'
ORDER BY PUBLISHED_DATE;