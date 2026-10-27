
create table student(
    S_Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE,
    age INT CHECK (age >= 18),
    College VARCHAR(255) DEFAULT "CIT Chennai",
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES dept(d_Id)
)
create table dept(
    d_Id INT PRIMARY KEY AUTO_INCREMENT,
    d_Name VARCHAR(100) NOT NULL,
)

INSERT INTO dept (d_Name) VALUES ('CSE'), ('IT'), ('AI'), ('ECE'), ('EEE');

INSERT INTO student (Name, email, age, dept_id) VALUES 
('John Doe', 'john@gmail.com', 20, 1),
('Jane Smith', 'john@gmail.com', 22, 2),
('Alice Johnson', 'alice@gmail.com', 19, 3)

Select Count(s_id) as no_of_students from student;
Select Max(age) as max_student_age from student;
Select Min(age) as min_student_age from student;
select avg(age) as average_age from student;
select sum(age) as sum_of_all_ages from student;


select * from student order by age desc;

select dept_id,count(*) from student group by dept_id;

select dept_id,avg(age) from student group by dept_id having avg(age)>18;

select distinct(name) from student;

select * from student where age between 20 and 50;

select * from student where name in ('John Doe');

select * from student where name like 'J%';

select * from student where name is null;

delimiter //
create procedure get_students()
 begin
    select * from student;
 end //

 delimiter ;

 delimiter //
create procedure get_students_by_dept(IN dept INT)
 begin
    select * from student where dept_id = dept;
 end //

 delimiter ;

 delimiter //
 create procedure func(out output INT)
 begin
    select count(*) into output from student;
 end //

 