-- 코드를 입력하세요
SELECT FIRST_HALF.FLAVOR FROM FIRST_HALF JOIN ICECREAM_INFO ON FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR WHERE TOTAL_ORDER >= 3000 AND INGREDIENT_TYPE = 'fruit_based' ORDER BY TOTAL_ORDER DESC;