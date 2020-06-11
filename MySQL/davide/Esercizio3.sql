use me;

-- Salary: maggiore, minore, somma, media
select max(salary) as max_salary, min(salary) as min_salary, sum(salary) as sum_salary,round(avg(salary), 2)as avg_salary
from employees;

-- Salary: come sopra, ma per ogni job_id
select job_id, max(salary) as max_salary, min(salary) as min_salary, sum(salary) as sum_salary, round(avg(salary), 2)as avg_salary
from employees
group by job_id
order by 1;

-- Quanti dipendenti per ogni job_id
select job_id, count(*) as d_for_job_id
from employees
group by job_id
order by 1;

-- Quanti sono gli IT_PROG
select job_id, count(*) as quantity
from employees
where job_id = 'IT_PROG';

-- Quanti sono i manager
select count(distinct manager_id) as num_manager
from employees;

-- Nomi dei dipendenti che non sono manager
select first_name, last_name
from employees
where employee_id not in (
	select distinct manager_id
    from employees
    where manager_id is not null);

-- Qual è la differenza tra il salario maggiore e il minore
select (max(salary) - min(salary)) as diff
from employees;

-- Come sopra, ma per ogni job_id, non considerando dove non c'è differenza
select job_id, (max(salary) - min(salary)) as diff
from employees
group by job_id
having diff > 0
order by 1;

-- Qual è il salario minimo con i dipendenti raggruppati per manager, non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€
select min(salary) as min_salary
from (
	select manager_id, salary 
    from employees
    where salary > 6000) as a
group by manager_id
having manager_id is not null;