-- Su dung database baitap
use bai1_baitap;
-- Tao bang Class
create table Class(
id int,
name_class varchar(20)
);
-- Tao bang Teacher
create table Teacher(
id int,
name_teacher varchar(50),
age int,
country varchar(30)
);