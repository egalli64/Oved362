use me;

-- Indirizzi completi, tra locations e countries
select street_address, postal_code, city, state_province, country_name
from locations join countries
using (country_id);

-- Nome di tutti i dipendenti e nome del loro department
select last_name, first_name, department_name
from employees left join departments
using (department_id)
order by 1;

-- Come sopra, ma solo per chi è basato a Toronto
select last_name, first_name, department_name, city
from employees join departments using (department_id)
join locations using (location_id)
where city = "Toronto";

-- Chi è stato assunto dopo David Lee
select a.first_name, a.last_name, a.hire_date
from employees as a join (
	select hire_date
	from employees
	where first_name = "David" and last_name = "Lee") as b
on (a.hire_date > b.hire_date);

-- Chi è stato assunto prima del proprio manager
select a.first_name, a.last_name
from employees as a join employees as b
on (a.manager_id = b.employee_id)
where a.hire_date < b.hire_date;

-- Chi ha lo stesso manager di Lisa Ozer
select a.first_name, a.last_name
from employees as a join (
	select manager_id
    from employees
    where first_name = "Lisa" and last_name = "Ozer") as b
on (a.manager_id = b.manager_id)
where a.first_name != "Lisa" and a.last_name != "Ozer";

-- Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome
select first_name, last_name
from employees 
where department_id in (
	select distinct department_id
	from employees 
	where last_name like "%u%");
    
-- Chi lavora nel department Shipping
select first_name, last_name
from employees join departments
using (department_id)
where department_name = "Shipping";

-- Chi ha come manager Steven King
select first_name, last_name
from employees 
where manager_id = (
	select employee_id
    from employees
    where first_name = "Steven" and last_name = "King");