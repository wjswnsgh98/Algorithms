SELECT  A.ID, B.FISH_NAME, A.LENGTH
  FROM FISH_INFO A 
  JOIN FISH_NAME_INFO B
    ON A.FISH_TYPE = B.FISH_TYPE
 WHERE (A.FISH_TYPE, A.LENGTH) 
    IN (SELECT FISH_TYPE, MAX(LENGTH) AS LENGTH
          FROM FISH_INFO
         GROUP BY FISH_TYPE)
 ORDER BY ID