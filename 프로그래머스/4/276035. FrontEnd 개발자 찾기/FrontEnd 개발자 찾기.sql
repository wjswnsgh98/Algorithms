-- DISTINCT 붙여서 중복해결
SELECT  DISTINCT ID, EMAIL, FIRST_NAME, LAST_NAME
  FROM DEVELOPERS A JOIN SKILLCODES B ON A.SKILL_CODE & B.CODE
 WHERE B.CATEGORY = 'Front End'
 ORDER BY ID