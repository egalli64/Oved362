use me;

select first_name, last_name, email, hire_date
from employees
where hire_date like "2005%";

select job_id
from employees
order by 1;

select first_name, last_name, email, hire_date, commission_pct
from employees
where commission_pct is not null;

select *
from employees
where first_name like "%a%" OR last_name like "%a%";

select department_name
from departments
order by 1;

select *
from locations
where country_id = "IT";