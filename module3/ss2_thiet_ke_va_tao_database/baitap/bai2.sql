create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
c_id int primary key auto_increment,
c_name varchar(30),
c_age int not null
);

create table product(
p_id int primary key auto_increment,
p_name varchar(30),
p_price int not null
);

create table `order`(
o_id int primary key auto_increment,
o_date date,
o_total_price double not null,
c_id int not null,
foreign key (c_id) references customer(c_id)
);

create table order_detail(
od_qty varchar(20) not null,
o_id int,
p_id int,
primary key(o_id, p_id),
foreign key (o_id) references `order`(o_id),
foreign key (p_id) references product(p_id)
);