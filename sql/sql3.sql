select * from student where age > (select avg(age) from student);

select * from student where dept_id=(select d_id from dept where d_Name='CSE');

select s.*, d.d_name from student s inner join dept d on s.dept_id=d.d_id;

select s.*, d.d_name from student s left join dept d on s.dept_id=d.d_id;

select s.*, d.d_name from student s right join dept d on s.dept_id=d.d_id;

select s.*,d.d_name from student s left join dept d on s.dept_id=d.d_id union select s.*, d.d_name from student s right join dept d on s.dept_id=d.d_id;


create view student_view as select s.*, d.d_name from student s inner join dept d on s.dept_id=d.d_id;  


create table backup (s_id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100) NOT NULL,
    email VARCHAR(255) UNIQUE,
    age INT CHECK (age >= 18),
    college VARCHAR(255) DEFAULT 'CIT Chennai',
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES dept(d_Id))

create trigger student_insert_trigger After delete on student for each row begin insert into backup (S_Id, Name, email, age, College, dept_id) values (old.S_Id, old.Name, old.email, old.age, old.College, old.dept_id) end;
