SELECT QUARTER, COUNT(ID) AS ECOLI_COUNT
  FROM ( SELECT CASE
                  WHEN MONTH(DIFFERENTIATION_DATE) <= 3 THEN '1Q'
                  WHEN 3 < MONTH(DIFFERENTIATION_DATE) AND MONTH(DIFFERENTIATION_DATE) <= 6 THEN '2Q'
                  WHEN 6 < MONTH(DIFFERENTIATION_DATE) AND MONTH(DIFFERENTIATION_DATE) <= 9 THEN '3Q'
                  WHEN 9 < MONTH(DIFFERENTIATION_DATE) THEN '4Q'
                 END QUARTER
               , ID
           FROM ECOLI_DATA
          GROUP BY DIFFERENTIATION_DATE, ID) A
 GROUP BY QUARTER
 ORDER BY QUARTER