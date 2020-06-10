use me;

-- Qual è il salario corrente, quale sarebbe con un incremento dell'8,5%, qual è il delta con come valore assoluto
select concat(first_name, ' ', last_name) as employee, salary, salary+(salary*0.085) as salary_aug, abs(salary - (salary + salary*0.085)) as abs
from employees;

-- Quanti giorni sono passati dall'assunzione a oggi
select concat(first_name, ' ', last_name) as employee, datediff(curdate(), hire_date) as giorni_passati
from employees;

-- Quant’è la commissione di ognuno o ‘no value’
select concat(first_name, ' ', last_name) as employee, ifnull(commission_pct, 'novalue') as commission
from employees;
