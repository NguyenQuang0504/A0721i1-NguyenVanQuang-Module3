create database quan_ly_sinh_vien_th1;
use quan_ly_sinh_vien_th1;
create table class(
id_class int not null primary key auto_increment,
class_name varchar(60) not null,
start_date datetime not null,
status bit
);
create table `subject`(
sub_id int not null primary key auto_increment,
sub_name varchar(30) not null,
credit tinyint not null default 1 check(credit >=1),
status bit default 1
);

create table student(
id_student int not null primary key auto_increment,
student_name varchar(30) not null,
address varchar(50),
phone varchar(20),
status bit,
id_class int not null,
foreign key (id_class) references class(id_class) 
);

create table mark(
mark_id int not null primary key auto_increment,
sub_id int not null,
id_student int not null,
unique(sub_id, id_student),
mark float default 0 check (mark between 0 and 100),
exam_time tinyint default 1,
foreign key (sub_id) references subject(sub_id),
foreign key (id_student) references student(id_student)
);
-- Nhap du lieu cho class
insert into class(class_name, start_date, status) values 
("A0721i1","2021-12-11",1),
("A0721i3","2021-2-11",1),
("A0721i3","2021-1-11",1),
("A0721i2","2021-12-1",0);
select * from class;
-- Nhap du lieu cho student
insert into student(student_name, address, phone, status, id_class) values
("Quang6", "HUE", "0397111634", 1, 1),
("Quang1", "DN", "0397111635", 0, 2),
("Quang2", "HUE", "0397111634", 1, 3);
select * from student;
-- Nhap du lieu cho subject
insert into subject(sub_name, credit, status) values
("Toan", 9.0,1),
("Sinh", 9.0,1),
("Anh", 9.0,0);
select * from subject;
-- Nhap du lieu cho mark
insert into mark(sub_id, id_student, mark) values
(1,2,7),
(3,1,8),
(2,3,6);

-- Hiển thị số lượng sinh viên ở từng nơi
select count(student_name), address from student group by address;
-- Tính điểm trung bình các môn học của mỗi học viên
select avg(mark) as diemtb, student_name, sub_name from mark join student on mark.id_student = student.id_student join subject on subject.sub_id = mark.sub_id group by student.student_name;
-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 7
select avg(mark) as diemtb, student_name, sub_name from mark join student on mark.id_student = student.id_student join subject on subject.sub_id = mark.sub_id group by student.id_student having diemtb >=7;
-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select avg(mark), student_name from mark join student on student.id_student = mark.id_student group by id_student
HAVING AVG(mark) >= ALL (SELECT AVG(mark) FROM mark GROUP BY mark.id_student);