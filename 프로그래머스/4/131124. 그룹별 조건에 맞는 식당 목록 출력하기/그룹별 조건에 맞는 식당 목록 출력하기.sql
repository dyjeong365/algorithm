# -- MEMBER_PROFILE와 REST_REVIEW 테이블에서 리뷰를 가장 많이 작성한 회원의 리뷰들을 조회하는 SQL문을 작성해주세요. 회원 이름, 리뷰 텍스트, 리뷰 작성일이 출력되도록 작성해주시고, 결과는 리뷰 작성일을 기준으로 오름차순, 리뷰 작성일이 같다면 리뷰 텍스트를 기준으로 오름차순 정렬해주세요.
SELECT MEMBER_NAME, R2.REVIEW_TEXT, SUBSTR(R2.REVIEW_DATE, 1, 10) 'REVIEW_DATE'
FROM MEMBER_PROFILE P
    ,   (
            SELECT MEMBER_ID, REVIEW_TEXT, REVIEW_DATE, RANK() OVER(ORDER BY COUNT(*) DESC) 'rnk'
            FROM REST_REVIEW
            GROUP BY MEMBER_ID
        ) R1
    , REST_REVIEW R2
WHERE P.MEMBER_ID = R1.MEMBER_ID AND rnk = 1 AND R1.MEMBER_ID = R2.MEMBER_ID 
ORDER BY R2.REVIEW_DATE, R2.REVIEW_TEXT;