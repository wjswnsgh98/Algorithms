-- 코드를 입력하세요
SELECT DISTINCT(B.ANIMAL_ID), B.NAME
FROM ANIMAL_OUTS B 
LEFT JOIN ANIMAL_INS A
ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE A.ANIMAL_ID IS NULL
ORDER BY ANIMAL_ID