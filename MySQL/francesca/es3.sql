use me;

-- Nome employees e loro departments
select e.first_name, e.last_name, d.department_name
from employees e join departments d
using(department_id);

-- Nome employees e job title 
select e.first_name, e.last_name, j.job_title
from employees e join jobs j
using(job_id);

-- Nome employees con salario min e max per job title
select e.first_name, e.last_name, j.job_title, e.salary, j.min_salary, j.max_salary
from employees e join jobs j
using(job_id)
where e.salary = j.min_salary or e.salary = j.max_salary; 

-- Nome employees in UK
select e.first_name, e.last_name, l.location_id, l.country_id
from employees e join departments d using(department_id)
join locations l using(location_id)
where l.country_id = "UK";

select e.first_name, e.last_name, l.location_id, l.country_id
from employees e, departments d,locations l
where e.department_id = d.department_id and d.location_id = l.location_id
and l.country_id = "UK";

-- Nome dipartimenti e manager associato
select d.department_name, e.employee_id, e.first_name, e.last_name
from departments d join employees e 
on(d.manager_id = e.employee_id);



-- Nome di ogni department e, se esiste, del relativo manager
select d.department_name, e.first_name, e.last_name
from departments d left outer join employees e -- right outer?
using(manager_id);

-- Nome dei department che non hanno manager associato
select department_name, department_id, manager_id
from departments
where manager_id is null;

-- Nome employees e loro manager
-- select concat(e.first_name, "-", e.last_name) as "EMPLOYEES", concat(m.first_name, "-", m.lastname)
select e.employee_id, e.first_name, e.last_name, e.manager_id, m.first_name, m.last_name
from employees e join employees m
on(e.manager_id = m.employee_id);

