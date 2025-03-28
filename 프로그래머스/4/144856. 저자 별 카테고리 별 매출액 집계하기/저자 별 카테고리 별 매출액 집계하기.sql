-- 2022년 1월의 도서 판매 데이터를 기준으로 저자 별, 카테고리 별 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여, 저자 ID(AUTHOR_ID), 저자명(AUTHOR_NAME), 카테고리(CATEGORY), 매출액(SALES) 리스트를 출력하는 SQL문을 작성해주세요. 결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬해주세요.
SELECT B.AUTHOR_ID, AUTHOR_NAME, CATEGORY, SUM(PRICE * SALES)'TOTAL_SALES'
FROM BOOK B, AUTHOR A, BOOK_SALES S
WHERE B.AUTHOR_ID = A.AUTHOR_ID AND B.BOOK_ID = S.BOOK_ID AND DATE_FORMAT(SALES_DATE, '%Y-%m') = '2022-01'
GROUP BY B.AUTHOR_ID, CATEGORY
ORDER BY B.AUTHOR_ID, CATEGORY DESC;