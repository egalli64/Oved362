use me;

-- Nome degli employees e del loro department
select first_name, department_name
from employees left outer join departments
using (department_id);

-- Nome degli employees e job title (da JOBS)
select first_name, job_title
from employees join jobs
using (job_id);

-- Nome degli employees che hanno il salario minimo o massimo previsto per il loro job title
select first_name, job_title, salary, min_salary, max_salary
from employees join jobs
using (job_id)
where salary = min_salary or salary = max_salary;

-- Nome degli employees basati in UK (LOCATIONS)
select first_name, country_id
from employees join departments using (department_id)
join locations using (location_id)
where country_id = 'UK';

-- Nome dei departments e manager associato
select department_name, last_name as manager
from departments as d join employees as e
on (d.manager_id = e.employee_id);

-- Nome di ogni department e, se esiste, del relativo manager
select department_name, last_name as manager
from departments left outer join employees
using (manager_id);

-- Nome dei department che non hanno un manager associato
select department_name, manager_id as manager
from departments
where manager_id is null;

-- Nome degli employees e del loro manager
select e.first_name, d.first_name as manager
from employees as e left outer join employees as d
on (e.manager_id = d.employee_id)
order by 2, 1;