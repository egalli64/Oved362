select round(salary), round((salary+salary/100*8.5)) as inc_salary, round(abs(salary-(salary+salary/100*8.5))) as delta from employees;

select abs(datediff(hire_date,now())) from employees;

select first_name, ifnull(commission_pct, 'no value') as commission from employees ;

select max(salary), min(salary), sum(salary), avg(salary) from employees;

select job_id, max(salary), min(salary), sum(salary), avg(salary) from employees group by job_id;

select job_id, count(employee_id) as n_employees from employees group by job_id;

select job_id, count(employee_id) as n_employees from employees where job_id = 'IT_PROG' group by job_id;

select count(distinct manager_id) as n_manager from employees;

select first_name, last_name from employees where employee_id not in (select distinct manager_id from employees where manager_id is not null order by 1); 

select max(salary) - min(salary) as salary_diff from employees;

select job_id, max(salary) - min(salary) as salary_diff from employees group by job_id having salary_diff != '0.00';

select min(salary) as salary from (select manager_id, salary from employees where salary > 6000) as s1 group by manager_id having manager_id is not null;

select first_name, last_name, street_address, postal_code, city, state_province, country_name from employees 
	join departments using (department_id) 
		join locations using (location_id)
			join countries using (country_id);
            
select first_name, department_name from employees join departments using (department_id);

select first_name, department_name from employees join departments using (department_id) where location_id in (select location_id from locations where city = 'Toronto');

select first_name, last_name from employees where hire_date > (select hire_date from employees where first_name = 'David' and last_name = 'Lee');

select employee_id, hire_date from employees where employee_id in (select distinct manager_id from employees where manager_id is not null order by 1);

select first_name, last_name from employees as e join (select employee_id, hire_date from employees where employee_id in (select distinct manager_id from employees where manager_id is not null order by 1)) as m on e.manager_id = m.employee_id where e.hire_date < m.hire_date;

select first_name, last_name, department_name from employees join departments using (department_id) where department_id in (
	select department_id from departments join employees using (department_id) where regexp_like(last_name,'^a.'));

select first_name, last_name from employees join departments using (department_id) where department_name = 'Shipping';

select first_name, last_name from employees where manager_id in (select employee_id from employees where first_name = 'Steven' and last_name = 'King');
