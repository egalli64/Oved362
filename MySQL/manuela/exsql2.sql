-- department's name in order
SELECT department_name
FROM departments
ORDER BY department_name;

--only employees hires in 2005 
SELECT first_name, last_name, email, hire_date
FROM employees
WHERE hire_date LIKE '2005%';

-- JOB_ID
SELECT distinct job_id
FROM employees
ORDER BY job_id;

--who has a commission parcel

SELECT first_name, last_name, commission_pct
FROM employees
WHERE commission_pct is not null;

--who have char 'a' in firstname or in lastname
SELECT first_name, last_name
FROM employees
WHERE first_name LIKE '%a%' OR last_name LIKE '%a%';

-- IT andress in locations
SELECT street_address, city, country_id
FROM locations
WHERE country_id = 'IT';