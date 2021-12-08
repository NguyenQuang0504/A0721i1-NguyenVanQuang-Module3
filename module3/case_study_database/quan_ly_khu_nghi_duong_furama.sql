create database case_study_module_3;
use case_study_module_3;

create table vi_tri(
ma_vt int primary key auto_increment,
ten_vt varchar(50)
);

create table trinh_do(
ma_td int primary key auto_increment,
ten_td varchar(50)
);

create table bo_phan(
ma_bp int primary key auto_increment,
ten_bp varchar(45)
);

create table nhan_vien(
ma_nv int primary key auto_increment,
ho_ten_nv varchar(50) not null,
ngay_sinh date not null,
so_cmnd varchar(45) not null,
luong double,
so_dt varchar(45),
email varchar(50),
dia_chi varchar(45),
ma_vt int not null,
ma_td int not null,
ma_bp int not null,
foreign key(ma_vt) references vi_tri(ma_vt),
foreign key(ma_td) references trinh_do(ma_td),
foreign key(ma_bp) references bo_phan(ma_bp)
);

create table loai_khang(
ma_lk int primary key auto_increment,
ten_lk varchar(45) not null
);

create table khach_hang(
ma_kh int primary key auto_increment,
ten_kh varchar(45),
ngay_sinh_kh date,
gioi_tinh bit not null default 1,
so_cmnd_kh varchar(45) not null,
so_dien_thoai_kh varchar(45),
email_kh varchar(45),
dia_chi_kh varchar(45),
ma_lk int not null,
foreign key (ma_lk) references loai_khach(ma_lk)
);

create table kieu_thue(
ma_kt int primary key auto_increment,
ten_kt varchar(45) not null
);

create table loai_dich_vu(
ma_ldv int primary key auto_increment,
ten_ldv varchar(45) not null
);

create table dich_vu(
ma_dv int primary key auto_increment,
ten_dv varchar(45) not null,
dien_tich int,
chi_phi double not null,
so_nguoi int not null,
tieu_chuan_phong varchar(45),
tien_nghi varchar(45),
dien_tich_ho_boi double,
so_tang int,
ma_ldv int not null,
ma_kt int not null,
foreign key (ma_ldv) references loai_dich_vu(ma_ldv),
foreign key (ma_kt) references kieu_thue(ma_kt)
);

create table hop_dong(
ma_hd int primary key auto_increment,
ngay_lam date not null,
ngay_kt date not null,
tien_dat double not null,
ma_nv int,
ma_kh int,
ma_dv int not null,
unique(ma_nv,ma_kh),
foreign key(ma_dv) references dich_vu(ma_dv),
foreign key (ma_nv) references nhan_vien(ma_nv),
foreign key (ma_kh) references khach_hang(ma_kh)
);

create table dich_vu_di_kem(
ma_dvdk int primary key auto_increment,
ten_dvdk varchar(45),
gia double not null,
don_vi varchar(45),
trang_thai varchar(45)
);

create table hop_dong_chi_tiet(
ma_hdct int primary key auto_increment,
ma_dvdk int,
ma_hd int,
unique (ma_dvdk,ma_hd),
foreign key(ma_dvdk) references dich_vu_di_kem(ma_dvdk),
foreign key (ma_hd) references hop_dong(ma_hd)
);
