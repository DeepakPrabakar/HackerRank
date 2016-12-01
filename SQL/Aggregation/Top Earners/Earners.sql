SELECT MAX(SALARY * MONTHS), COUNT(NAME) FROM EMPLOYEE WHERE (SALARY*MONTHS) IN (SELECT MAX(SALARY * MONTHS) FROM EMPLOYEE)


--Alternate

select salary*months as earnings, count(*) from employee
group by 1
order by 1 desc limit 1