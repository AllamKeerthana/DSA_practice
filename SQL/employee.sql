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
