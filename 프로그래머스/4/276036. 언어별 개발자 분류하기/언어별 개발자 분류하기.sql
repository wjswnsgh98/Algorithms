SELECT  CASE
         WHEN SKILL = 1 THEN 'A'
         WHEN SKILL = 2 THEN 'B'
         WHEN SKILL = 3 THEN 'C'
       END AS GRADE
     , ID
     , EMAIL
  FROM (SELECT CASE 
                 WHEN COUNT(CASE WHEN CATEGORY = 'Front End' THEN 1 END) > 0 
                  AND COUNT(CASE WHEN NAME = 'Python' THEN 1 END) > 0 THEN 1
                 WHEN COUNT(CASE WHEN NAME = 'C#' THEN 1 END) > 0 THEN 2
                 WHEN COUNT(CASE WHEN CATEGORY = 'Front End' THEN 1 END) > 0 THEN 3
               END AS SKILL
             , ID
             , EMAIL
          FROM DEVELOPERS A JOIN SKILLCODES B ON A.SKILL_CODE & B.CODE
         GROUP BY ID, EMAIL
         HAVING SKILL > 0) C -- 테이블 명에 alias 명시 해줘야함
 ORDER BY GRADE, ID