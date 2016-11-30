MS SQL

SELECT DISTINCT (CITY) FROM STATION WHERE CITY NOT LIKE '[AIEOU]%' AND CITY NOT LIKE '%[AIEOU]' 

MYSQL

select distinct city from station where city regexp '^[^aeiou].*[^aeiou]$'