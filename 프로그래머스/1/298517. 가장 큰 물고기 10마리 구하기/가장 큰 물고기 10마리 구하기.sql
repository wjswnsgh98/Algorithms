SELECT  ID, LENGTH
  FROM (SELECT *
          FROM FISH_INFO
         ORDER BY LENGTH DESC
         LIMIT 10) A
ORDER BY LENGTH DESC, ID