--Task 1
CREATE DATABASE college_db;

USE college_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    age INT,
    department VARCHAR(100),
    email VARCHAR(255) NOT NULL,
    Marks FLOAT
);

--Task 2
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(100),
    salary DECIMAL(10, 2),
    joining_date DATE,
    email VARCHAR(255) UNIQUE
);

--Task 3
ALTER TABLE students 
ADD phone_number VARCHAR(20);


ALTER TABLE students 
ADD date_of_birth DATE;


ALTER TABLE students 
MODIFY COLUMN student_name VARCHAR(150) NOT NULL;

ALTER TABLE students 
RENAME COLUMN department TO course;


ALTER TABLE students 
DROP COLUMN phone_number;

INSERT INTO students (student_id, student_name, age, course, email, Marks, date_of_birth)
VALUES
(1, 'Alice Johnson', 20, 'Computer Science', 'alice@gmail.com', 90 , '2003-05-15'),
(2, 'Bob Smith', 22, 'Mathematics', 'bob@gmail.com',86, '2001-08-22'),
(3, 'Charlie Brown', 19, 'Physics', 'charlie@gmail.com',75, '2004-02-10');

INSERT INTO students (student_id, student_name ,age, course,email, Age, Marks,date_of_birth)
VALUES (7, 'Karthik',21, 'Java',  'karthik@gmail.com', 78.2,'2002-03-12');

SELECT * FROM Students 
WHERE Marks > 80.3;

UPDATE Students 
SET Marks = 96.4 
WHERE Name = 'Priya';

UPDATE Students 
SET Department = 'Python' 
WHERE Name = 'Ravi';

DELETE FROM Students 
WHERE ID = 3;

UPDATE Students 
SET Marks = Marks + 10 
WHERE Department = 'Java';



