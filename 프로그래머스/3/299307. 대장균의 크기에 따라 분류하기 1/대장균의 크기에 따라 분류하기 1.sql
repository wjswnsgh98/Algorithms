SELECT  ID
       , CASE
          WHEN SIZE_OF_COLONY <= 100 THEN 'LOW'
          WHEN 100 < SIZE_OF_COLONY AND SIZE_OF_COLONY <= 1000 THEN 'MEDIUM'
          WHEN 1000 < SIZE_OF_COLONY THEN 'HIGH'
         END AS SIZE
  FROM ECOLI_DATA
 ORDER BY ID