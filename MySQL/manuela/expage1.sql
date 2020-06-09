use me;


--select first_name, last_name, email, phone_number, hire_date

SELECT   first_name, last_name, email, phone_number, hire_date and order by lastname : 
FROM   	 employees 
ORDER BY last_name;

-- Select only employees with name David or Peter:

SELECTfirst_name, last_name, email
FROM  employees
WHERE first_name = 'David' OR first_name = 'Peter';

-- only employees in department 60

SELECT first_name, last_name, email
FROM employees
WHERE department_id = 60;

-- only employees in department 60 or 50

SELECT first_name, last_name, email
FROM employees
WHERE department_id = 30 OR department_id = 50;

-- who has salary > 10000

SELECT first_name, last_name, email, salary
FROM employees
WHERE salary > 10000;

-- salary < 4000 or > 15000
SELECT first_name, last_name, email, salary
FROM employees
WHERE salary < 4000 or salary > 15000;

-- who has salary < 4000 or > 15000 but only for department 50 or 80

SELECT first_name, last_name, email, salary, department_id
FROM employees
WHERE (department_id = 50 OR department_id = 80) AND (salary < 4000 OR salary > 15000);

