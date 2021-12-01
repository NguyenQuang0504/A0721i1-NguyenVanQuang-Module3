create database quan_ly_diem_thi;
use quan_ly_diem_thi;
create table hoc_sinh(
ma_hs varchar(20) primary key,
ten_hs varchar(30),
ngay_sinh datetime,
lop varchar(30),
gioi_tinh varchar(20)
);

create table mon_hoc(
ma_mh varchar(20) primary key,
ten_mh varchar(30)
);

create table bang_diem(
ma_hs varchar(20),
ma_mh varchar(20),
diem_thi int,
ngay_kt datetime,
foreign key (ma_hs) references hoc_sinh (ma_hs),
foreign key (ma_mh) references mon_hoc (ma_mh)
);

create table giao_vien(
ma_gv varchar(20) primary key,
ten_gv varchar(20),
sdt varchar(10)
);

alter table mon_hoc add ma_gv varchar(20);
alter table mon_hoc add constraint fk_ma_gv foreign key (ma_gv) references giao_vien(ma_gv);
select * from giao_vien;
select * from hoc_sinh;
select * from mon_hoc;
select * from bang_diem;