ORACLE

select distinct city from station where regexp_like(city,'^[^aeiou](*)','i');

MS SQL

SELECT DISTINCT CITY FROM STATION WHERE CITY not LIKE '[aeiuo]%'

MYSQL

SELECT distinct city FROM station WHERE city REGEXP '^[^aeiou]';

select distinct city from station where substr(city,1,1) not in ('a','e','I','O','U');