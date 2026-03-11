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

-- Find departments where all employees earn more than 25000
SELECT department FROm employee GROUP BY department HAVING MIN(salary)> 25000;

-- The highest salary in that department must be greater than 50000.\
SELECT department FROM employee GROUP BY department HAVING MAX(salary) > 50000;

-- Find all the movies directed by John Lasseter
SELECT Title , Director FROM Movies WHERE Director="John Lasseter"

-- Find all the WALL-* movies 
SELECT * FROM movies WHERE title LIKE "WALL-_";

-- List all directors of Pixar movies (alphabetically), without duplicates
SELECT DISTINCT director FROM movies ORDER BY director ASC;

-- List the last four Pixar movies released (ordered from most recent to least) 
SELECT Title FROM Movies ORDER BY Year DESC LIMIT 4 

--List all directors of Pixar movies (alphabetically), without duplicates
SELECT DISTINCT Director FROM Movies ORDER BY Director ASC 

--List the first five Pixar movies sorted alphabetically
SELECT title, year FROM movies ORDER BY year DESC LIMIT 4;

--List the first five Pixar movies sorted alphabetically 
SELECT title, year FROM movies ORDER BY title ASC LIMIT 5 ;

--List the next five Pixar movies sorted alphabetically
SELECT title, year FROM movies ORDER BY title ASC LIMIT 5 OFFSET 5 ;

-- “Movies released in the latest 4 years”
SELECT Title FROM Movies WHERE YEAR > = (SELECT MAX(Year) - 3 FROM Movies) ORDER BY Year DESC ;

--List all the Canadian cities and their populations
SELECT city, population FROM north_american_cities WHERE country = "Canada";

--Order all the cities in the United States by their latitude from north to south
SELECT city, latitude FROM north_american_cities WHERE country = "United States" ORDER BY latitude DESC;

--Find the domestic and international sales for each movie
SELECT title, domestic_sales, international_sales FROM movies JOIN boxoffice ON movies.id = boxoffice.movie_id;

--Show the sales numbers for each movie that did better internationally rather than domestically 
SELECT title, domestic_sales, international_sales FROM movies JOIN boxoffice ON movies.id = boxofffice.movie_id WHERE international_sales > domestic_sales;

--List all the movies by their ratings in descending order
SELECT *
FROM movies
  JOIN boxoffice
    ON movies.id = boxoffice.movie_id
ORDER BY Rating DESC

--List all buildings and the distinct employee roles in each building (including empty buildings) 
SELECT DISTINCT building_name, role FROM buildings LEFT JOIN employee ON building_name = building;

--