use me;

-- Nomi, cognomi, email, telefoni, date di assunzione ordinati per cognome e nome
select first_name, last_name, email, phone_number, hire_date
from employees 
order by last_name;

-- Chi ha nome David o Peter
select first_name, last_name, email
from employees
where first_name = 'David' or first_name = 'Peter';

-- Chi appartiene al dipartimento 60
select first_name, last_name, email
from employees
where department_id = 60;

-- Chi appartiene al dipartimento 30
select first_name, last_name, email
from employees
where department_id = 30 or department_id = 50;

-- Chi ha salario > 10000
select first_name, last_name, email, salary
from employees
where salary > 10000;

-- Chi ha salario < 4000 o > 15000
select first_name, last_name, email, salary
from employees
where salary < 4000 or salary > 15000;

-- Chi ha salario < 4000 o > 15000 ma solo per i dipartimenti 50 e 80
select first_name, last_name, email, salary, department_id
from employees
where (department_id = 50 or department_id = 80) and (salary < 4000 or salary > 15000);

-- Chi è stato assunto nel 2005
select first_name, last_name, email, hire_date
from employees
where hire_date like '2005%';

-- Quali job_id sono presenti, in ordine naturale
select distinct job_id
from employees
order by job_id;

-- Chi ha una commissione
select first_name, last_name, commission_pct
from employees
where commission_pct is not null;

-- Chi ha una 'a' nel nome o cognome
select first_name, last_name
from employees
where first_name like '%a%' or last_name like '%a%';

-- Nomi dei dipartimenti in ordine naturale
select department_name
from departments
order by department_name;

-- Indirizzi delle sedi italiane in Locations
select street_address, city, country_id
from locations
where country_id = 'IT';