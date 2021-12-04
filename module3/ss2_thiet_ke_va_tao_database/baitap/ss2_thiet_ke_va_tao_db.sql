
create database demo_a07;
use demo_a07;
create table `tai_khoan` (
	username varchar(15) primary key,
	`password` varchar(100) not null -- là bắt buộc nhập thông tin khi thêm mới hoặc sửa 
);
create table lop_hoc(
	ma_lop_hoc int primary key auto_increment,
	ten_lop_hoc varchar(100)
);
create table giang_vien(
	ma_giang_vien int primary key auto_increment,
	ten_giang_vien varchar(100),
	ngay_sinh date
);
create table hoc_vien (
-- auto_increment : tự động tăng, áp dụng cho số
	ma_hoc_vien int primary key auto_increment unique,
	ten_hoc_vien varchar(100),
	ngay_sinh date,
	email varchar(100),
-- unique : không trùng lặp
	username varchar(15) unique,
	ma_lop_hoc int,
	foreign key(ma_lop_hoc) references lop_hoc(ma_lop_hoc),
	foreign key(username) references tai_khoan(username)
    );​
create table dia_chi(
	ma_dia_chi int primary key auto_increment,
	`dia_chi` varchar (255),
	ma_hoc_vien int,
	foreign key(ma_hoc_vien) references hoc_vien(ma_hoc_vien)
);
select * from hoc_vien;
create table giang_vien_day_lop_hoc(
	ma_giang_vien int,
	ma_lop_hoc int,
	primary key(ma_giang_vien,ma_lop_hoc), -- khóa phức hợp
	foreign key(ma_giang_vien) references giang_vien(ma_giang_vien),
	foreign key(ma_lop_hoc) references  lop_hoc(ma_lop_hoc)
);
insert into tai_khoan 
values('toan1', '123123'), 
	('toan2', '123123'), 
    ('toan3', '123123'), 
    ('toan4', '123123'), 
	('toan5', '123123'), 
    ('toan6', '123123'),
	('toan7', '123123');
      
insert into lop_hoc
values (1,'A0721I1'),
	   (2,'A0721I2'),
       (3,'A031I1'),
       (4,'A0321I2'),
       (5,'C0321I1'),
       (6,'C0321I2'),
       (7,'C0421I1');
  
insert into giang_vien
values (1,'Truong Tan Hai', '1994-10-12'),
	   (2,'Tran Duc Linh ', '1991-12-20'),
       (3,'Nguyen Van Chien', '1999-04-15'),
       (4,'Nguyen Linh Nam', '1987-09-13'),
       (5,'Tran Van Chanh', '1990-05-21'),
       (6,'Hoang Van Chien', '1997-03-15'),
       (7,'Duong Van Tuan', '1998-09-09');
       insert into hoc_vien(ma_hoc_vien, ten_hoc_vien, ngay_sinh, email,username) values (1,'Toan', '2000-11-08', 'hung@gmail.com', 'Toan1');
insert into hoc_vien
values 
	   (2,'Hieu', '2000-09-30', 'hieu@gmail.com','Toan2', 2),
       (3,'Toan', '2000-12-27', 'toan@gmail.com', 'Toan3', 3),
       (4,'Thang', '2000-01-01', 'thang@gmail.com', 'Toan4', 4),
       (5,'Nhan', '2000-02-02', 'nhan@gmail.com', 'Toan5', 5),
       (6,'Nhat', '2002-03-03', 'nhat@gmail.com', 'Toan6', 6),
       (7,'Danh', '2000-04-04', 'danh@gmail.com', 'Toan7', 7);
       
insert into dia_chi (`dia_chi`, ma_hoc_vien)
values ('QN', 1), ('DN', 2), ('HN', 3), ('HCM', 4), ('Hue', 5), ('QN', 6), ('QN', 7);
insert into giang_vien_day_lop_hoc
values (1, 3),
 (2, 4),
 (3, 5),
 (4, 6),
 (5, 7),
 (6, 2), 
 (7, 1);
use demo_a07;
select * from giang_vien_day_lop_hoc;
select * from giang_vien;
select * from lop_hoc;
select * from hoc_vien;

-- baitapvenha
-- Lấy ra thông tin của các học viên đang theo học tại lớp, và lớp đó do giảng viên nào dạy  
select * from giang_vien_day_lop_hoc inner join hoc_vien on giang_vien_day_lop_hoc.ma_lop_hoc = hoc_vien.ma_lop_hoc inner join giang_vien on giang_vien_day_lop_hoc.ma_giang_vien = giang_vien.ma_giang_vien inner join lop_hoc on giang_vien_day_lop_hoc.ma_lop_hoc = lop_hoc.ma_lop_hoc;


