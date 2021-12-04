create database quan_ly_sinh_vien_th2;
use quan_ly_sinh_vien_th2;
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
insert into mark(sub_id, id_student) values
(1,2),
(2,1),
(3,3);
select * from mark;
select * from mark inner join student on student.id_student = mark.id_student;
-- YC1 hien thi danh sach cac sinh vien
select * from student;
-- YC2 hien thi danh sach hoc vien dang theo hoc
select * from student where status = true;
-- YC3 Hien thi danh sach mon hoc co tg < 10
select * from subject where credit < 10.0; 
-- YC4 Hien thi danh sach hoc sinh lop A01
select * from class inner join student on class.id_class = student.id_class where class_name = "A0721i1";
-- YC5 Hien thi diem mon cua hs
select * from mark inner join student on student.id_student = mark.sub_id inner join subject on mark.sub_id = subject.sub_id;