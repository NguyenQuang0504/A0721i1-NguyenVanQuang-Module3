create database quan_ly_sinh_vien;
use quan_ly_sinh_vien;
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