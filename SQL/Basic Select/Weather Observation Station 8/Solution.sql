MS SQL

SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE '[aeiuo]%[aeiou]'


MYSQL

SELECT DISTINCT CITY FROM STATION WHERE UPPER(CITY) REGEXP '^[AEIOU].*[AEIOU]$';

select distinct CITY from STATION where substr(UPPER(CITY),1,1) in ('A','E','I','O','U') and substr(UPPER(CITY),-1,1) in ('A','E','I','O','U');