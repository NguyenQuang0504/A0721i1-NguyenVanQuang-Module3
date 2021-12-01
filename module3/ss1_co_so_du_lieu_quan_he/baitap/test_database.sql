create database test;
use test;
create table sinh_vien(
id int,
name varchar(40),
age int
);
select * from sinh_vien;
insert into sinh_vien values (1,"Quang1", 18),(2,"Thuy",22),(3,"Quang2",22);
select id from sinh_vien;
select name from sinh_vien;
alter table sinh_vien add address text first;
set SQL_SAFE_UPDATES = 0;
update sinh_vien set address = "HUE";
update sinh_vien set address = "DN" where age = 22;
