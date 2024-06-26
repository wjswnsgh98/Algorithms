-- ORDER BY는 TOTAL_DISTANCE로 하면 안 된다.
-- CONCAT으로 더 이상 숫자가 아니게 되었기 때문
-- ROUND 반올림할 자릿수에서 +1 한 자릿수에서 반올림 EX) 소수 둘째자리에서 반올림할 경우 1로 써야함

SELECT  ROUTE
     , CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km') AS TOTAL_DISTANCE
     , CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AS AVERAGE_DISTANCE
  FROM SUBWAY_DISTANCE
 GROUP BY ROUTE
 ORDER BY ROUND(SUM(D_BETWEEN_DIST), 1) DESC