MYSQL

SELECT DISTINCT CITY FROM STATION WHERE CITY LIKE 'a%' OR CITY LIKE 'e%' OR CITY LIKE 'i%' OR CITY LIKE 'o%' OR CITY LIKE 'u%'

select distinct city from station where substr(city, 1, 1) in ('a', 'e', 'i', 'o', 'u');

SELECT DISTINCT city FROM station WHERE city REGEXP "^[aeiou].*";

MS SQL

SELECT DISTINCT city from station where city LIKE '[a, e, i, o, u]%';

SELECT DISTINCT city from station where city LIKE '[aeiou]%';