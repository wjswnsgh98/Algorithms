-- 코드를 입력하세요
SELECT A.HOUR , NVL(B.COUNT , 0) AS COUNT 
FROM ( SELECT LEVEL-1 AS HOUR FROM DUAL
       CONNECT BY LEVEL<=24) A 
    FULL OUTER JOIN 
     ( SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) AS HOUR , COUNT(*) AS COUNT  
       FROM ANIMAL_OUTS
       GROUP BY TO_NUMBER(TO_CHAR(DATETIME, 'HH24'))
     ) B ON A.HOUR = B.HOUR 
ORDER BY HOUR