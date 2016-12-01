/*
Enter your query here.
*/

SELECT CASE
            WHEN (A+B<=C) OR (A+C<=B) OR (B+C<=A) THEN 'Not A Triangle'   
            WHEN A=B AND B=C THEN 'Equilateral'
            WHEN (A=B AND B!=C) OR (A=C AND B!=C) OR (B=C AND A!=C) THEN 'Isosceles'
            WHEN (A!=B) AND (A!=C) AND (B!=C) AND (A+B>=C)THEN 'Scalene'
       END
FROM TRIANGLES