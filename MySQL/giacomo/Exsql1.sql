-- fist/last name, email, phone, assumption time, ordered by fist/last name
select first_name, last_name, email, phone_number, hire_date from employees order by first_name, last_name;

-- employers with 'David' OR 'Peter' in first name
select employee_id, email, phone_number, hire_date from employees where first_name = 'David' or first_name = 'Peter';

-- employers in department 60
select employee_id, first_name, last_name from employees where department_id = 60;

-- employers in department 30 OR 60
select employee_id, first_name, last_name from employees where department_id = 30 or department_id = 60;

-- employers with salary OVER 10000
select employee_id, first_name, last_name from employees where salary > 10000;

-- employers with salary UNDER 10000 OR with salary OVER 15000
select employee_id, first_name, last_name from employees where salary < 10000 or salary > 15000;

-- employers in departments 50 OR 80 with salary UNDER 4000 OR with salary OVER 15000
select employee_id, first_name, last_name, salary, department_id from (
	select employee_id, first_name, last_name, salary, department_id  from employees where department_id = 50 or department_id = 80) as s1 where salary < 4000 or salary > 15000;

-- employers with date of hiring date in year 2005
select employee_id, first_name, last_name, hire_date from employees where hire_date like '2005-%-%';

-- job identificator ordered naturally
select  distinct job_id from employees order by 1;

-- employers that have commission
select employee_id, first_name, last_name, hire_date from employees where commission_pct is not null; 

-- employers with first/last name that begins with 'A'
select employee_id, first_name, last name, hire_date from employees where first_name like 'a%' or last_name like 'a%';

-- department name ordered naturally
select  distinct department_name from departments order by department_name;

-- Italian postal adresses
select street_address, postal_code, city, state_province from locations where country_id = 'IT';