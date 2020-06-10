select first_name, department_name from employees join departments using (department_id);

select first_name, job_title from employees join jobs using (job_id);

select first_name from employees join jobs using (job_id) where salary = min_salary or salary = max_salary;

select first_name from employees join departments using (department_id) join locations using (location_id) where country_id = 'UK';

select department_name, first_name as manager from departments as d join employees on d.manager_id = employee_id;

select department_name, first_name as manager from departments as d left outer join employees on d.manager_id = employee_id where d.manager_id;

select department_name from departments where manager_id is null;

select e.first_name, m.first_name as manager from employees as e join (
	select employee_id, first_name from employees) as m on e.manager_id = m.employee_id;