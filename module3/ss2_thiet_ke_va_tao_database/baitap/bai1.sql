create database bai_tap_1;
use bai_tap_1;
create table phieu_xuat(
so_px int not null primary key auto_increment,
ngay_xuat date
);

create table nha_cc(
ma_nha_cc int not null primary key auto_increment,
ten_nha_cc varchar(30) not null,
dia_chi varchar(30) not null
);

create table vat_tu(
ma_vt int not null primary key auto_increment,
ten_vt varchar(20)
);

create table phieu_nhap(
so_pn int not null primary key auto_increment,
ngay_nhap date
);

create table don_dh(
so_dh int not null primary key auto_increment,
ngay_dh date,
ma_nha_cc int not null,
foreign key (ma_nha_cc) references nha_cc(ma_nha_cc)
);


create table sdt(
ma_sdt int not null primary key auto_increment,
so_dt varchar(11) not null,
ma_nha_cc int not null,
foreign key (ma_nha_cc) references nha_cc(ma_nha_cc)
);

create table chi_tiet_phieu_xuat(
gd_xuat varchar(20),
so_luong_xuat int not null,
so_px int not null,
ma_vt int not null,
primary key(so_px, ma_vt),
foreign key (so_px) references phieu_xuat(so_px),
foreign key (ma_vt) references vat_tu(ma_vt)
);

create table chi_tiet_phieu_nhap(
dg_nhap varchar (30),
so_luong_nhap int not null,
ma_vt int,
so_pn int,
primary key(ma_vt, so_pn),
foreign key (ma_vt) references vat_tu(ma_vt),
foreign key (so_pn) references phieu_nhap(so_pn)
);

create table chi_tiet_don_hang(
so_dh int,
ma_vt int,
primary key(so_dh, ma_vt),
foreign key (so_dh) references don_dh(so_dh),
foreign key (ma_vt) references vat_tu(ma_vt)
);
