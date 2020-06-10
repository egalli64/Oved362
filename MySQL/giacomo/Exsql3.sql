select round(salary), round((salary+salary/100*8.5)) as inc_salary, round(abs(salary-(salary+salary/100*8.5))) as delta from employees;

select abs(datediff(hire_date,now())) from employees;

select first_name, ifnull(commission_pct, 'no value') as commission from employees ;

