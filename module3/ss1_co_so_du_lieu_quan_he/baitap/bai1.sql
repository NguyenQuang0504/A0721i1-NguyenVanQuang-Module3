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
use bai1_baitap;
select * from Class;
insert into Class values(1,"Quang1"),(2,"Quang2"),(3,"Quang3");
insert into Class(id) values(1),(5);
alter table Class add age text after name_class; 
alter table Class add address text after name_class;
select * from Class;
insert into Class(address) values("Hue"),("Hue"),("DN"),("QN");
select address from Class;
set SQL_SAFE_UPDATEs = 0;
update Class set address = "HUE";
set SQL_SAFE_UPDATES = 1;
select * from Class;