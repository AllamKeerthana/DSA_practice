CREATE TABLE employee(
    id INT PRIMARY KEY, name VARCHAR(100) NOT NULL, salary INT NOT NULL, department VARCHAR(100) NOT NULL
)

INSERT INTO employee VALUES (1,'keer',20000,'sales');
INSERT INTO employee VALUES (2,'ammu',24000,'IT');

SELECT * FROM employee WHERE salary >10000;
SELECT * FROM employee WHERE department = 'sales';

UPDATE employee SET salary = salary + 3000 WHERE department = "IT";

SELECT name FROM employee WHERE name LIKE 'a%';

DELETE FROM employee WHERE salary < 23000;

SELECT COUNT(*) FROM employee;
SELECT SUM(salary) FROM employee WHERE department = "IT";
SELECT MIN(salary) FROM employee;
SELECT MAX(salary) FROM employee;
SELECT department, AVG(salary) FROM employee GROUP BY department;

SELECT DISTINCT salary FROM employee ORDER BY salary DESC LIMIT 1 OFFSET 1;
SELECT MAX(salary)
FROM employee
WHERE salary < (
    SELECT MAX(salary) FROM employee
);

SELECT * FROM employee WHERE salary > (SELECT AVG(salary) FROM employee);
SELECT * FROM employee GROUP BY department WHERE COUNT(*) > 1; 
SELECT * FROM employee WHERE salary > (SELECT AVG(salary) FROM employee GROUP BY department);
SELECT * FROM employee WHERE salary = ( SELECT MAX(salary) FROM employee);
SELECT * 
FROM employee 
WHERE salary = (
    SELECT MIN(salary) 
    FROM employee
);

SELECT *
FROM employee
WHERE salary > (SELECT MIN(salary) FROM employee)
AND salary < (SELECT MAX(salary) FROM employee);

SELECT *
FROM employee
WHERE salary BETWEEN 
      (SELECT MIN(salary) FROM employee)
      AND
      (SELECT MAX(salary) FROM employee);

SELECT * FROM employee WHERE salary NOT BETWEEN 20000 AND 30000 AND department = 'IT';
SELECT * FROM employee WHERE salary BETWEEN 20000 AND 30000 OR department = 'sales';

-- SQL operator precedence
-- NOT , AND , OR 

SELECT * FROM employee WHERE salary > (SELECT AVG(salary) )
SELECT * 
FROM employee 
WHERE salary < (SELECT MAX(salary) FROM employee);
-- Find employees whose salary is less than at max salary.
SELECT * FROM employee WHERE salary > (SELECT MAX(salary) FROM employee);
-- Find employees whose salary is greater than at least one employee.   
SELECT * FROM employee WHERE salary > ANY(SELECT salary FROM employee);
-- Find employees whose salary is less than ALL employees in IT department.
SELECT * FROM employee WHERE salary < ALL(SELECT salary FROM employee WHERE department = 'IT');

-- Find employees who earn the same salary as someone else.
SELECT * FROM employee e1 WHERE EXISTS (SELECT 1 FROM employee e2 WHERE e1.salary = e2.salary AND e1.id != e2.id);

-- Find employees who work in departmetns that have exactly 2 employees.
SELECT * FROM employee WHERE department in (SELECT department FROM employee GROUP BY department HAVING COUNT(*) = 2);
