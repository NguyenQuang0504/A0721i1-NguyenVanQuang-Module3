create database case_study_module_3;
use case_study_module_3;

create table vi_tri(
ma_vt int primary key auto_increment,
ten_vt varchar(50)
);
insert into vi_tri(ten_vt) values ("Quan ly"),("Nhan vien");
create table trinh_do(
ma_td int primary key auto_increment,
ten_td varchar(50)
);
insert into trinh_do(ten_td) values
("Trung cap"),
("Cao dang"),
("Dai hoc"),
("Sau dai hoc");
create table bo_phan(
ma_bp int primary key auto_increment,
ten_bp varchar(45)
);
insert into bo_phan(ten_bp) values
("Sale-Maketting"),
("Hanh chinh"),
("Phuc vu"),
("Quan ly");
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
insert into nhan_vien values
(1,"Nguyễn Văn An", "1970-11-07","456231786",10000000,"0901234121","annguyen@gmail.com","295 Nguyễn Tất Thành, Đà Nẵng", 1, 3, 1),
(2, "Lê Văn Bình", "1997-04-09", "654231234", 7000000, "0934212314", "binhlv@gmail.com", "22 Yên Bái, Đà Nẵng",1,2,2),
(3, "Hồ Thị Yến","1995-12-12","999231723",14000000,"0412352315","thiyen@gmail.com","K234/11 Điện Biên Phủ, Gia Lai",1,3,2),
(4,"Võ Công Toản","1980-04-04","123231365",17000000,"0374443232","toan0404@gmail.com","77 Hoàng Diệu, Quảng Trị",1,4,4),
(5,"Nguyễn Bỉnh Phát","1999-12-09","454363232",6000000,"0902341231","phatphat@gmail.com","43 Yên Bái, Đà Nẵng",2,1,1),
(6,"Khúc Nguyễn An Nghi","2000-11-08","964542311",7000000,"0978653213","annghi20@gmail.com","294 Nguyễn Tất Thành, Đà Nẵng",2,2,3),
(7,"Nguyễn Hữu Hà","1993-01-01","534323231",8000000,"0941234553","nhh0101@gmail.com","4 Nguyễn Chí Thanh, Huế",2,3,2),
(8,"Nguyễn Hà Đông","1989-09-03","234414123",9000000,"0642123111","donghanguyen@gmail.com","111 Hùng Vương, Hà Nội",2,4,4),
(9,"Tòng Hoang","1982-09-03","256781231",6000000,"0245144444","hoangtong@gmail.com","213 Hàm Nghi, Đà Nẵng",2,4,4),
(10,"Nguyễn Công Đạo","1994-01-08","755434343",8000000,"0988767111","nguyencongdao12@gmail.com","6 Hoà Khánh, Đồng Nai",2,3,2);
select * from nhan_vien;
create table loai_khach(
ma_lk int primary key auto_increment,
ten_lk varchar(45) not null
);
insert into loai_khach(ten_lk) values
("Diamond"),
("Platinum"),
("Gold"),
("Silver"),
("Member");
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
insert into khach_hang values
(1,"Nguyễn Thị Hào","1970-11-07",0,"643431213","0945423362","thihao07@gmail.com","23 Nguyễn Hoàng, Đà Nẵng",5),
(2,"Phạm Xuân Diệu","1992-08-08",1,"865342123","0954333333","xuandieu92@gmail.com","K77/22 Thái Phiên, Quảng Trị",3),
(3,"Trương Đình Nghệ","1990-02-27",1,"488645199","0373213122","nghenhan2702@gmail.com","K323/12 Ông Ích Khiêm, Vinh",1),
(4,"Dương Văn Quan","1981-07-08",1,"543432111","0490039241","duongquan@gmail.com","K453/12 Lê Lợi, Đà Nẵng",1),
(5,"Hoàng Trần Nhi Nhi","1995-12-09",0,"795453345","0312345678","nhinhi123@gmail.com","224 Lý Thái Tổ, Gia Lai",4),
(6,"Tôn Nữ Mộc Châu","2005-12-06",0,"732434215","0988888844","tonnuchau@gmail.com","37 Yên Thế, Đà Nẵng",4),
(7,"Nguyễn Mỹ Kim","1984-04-08",0,"856453123","0912345698","kimcuong84@gmail.com","K123/45 Lê Lợi, Hồ Chí Minh",1),
(8,"Nguyễn Thị Hào","1999-04-08",0,"965656433","0763212345","haohao99@gmail.com","55 Nguyễn Văn Linh, Kon Tum",3),
(9,"Trần Đại Danh","1994-07-01",1,"432341235","0643343433","danhhai99@gmail.com","24 Lý Thường Kiệt, Quảng Ngãi",1),
(10,"Nguyễn Tâm Đắc","1989-07-01",1,"344343432","0987654321","dactam@gmail.com","22 Ngô Quyền, Đà Nẵng",2);
select * from khach_hang;
create table kieu_thue(
ma_kt int primary key auto_increment,
ten_kt varchar(45) not null
);
insert into kieu_thue(ten_kt) values
("year"),
("month"),
("day"),
("hour");
select * from kieu_thue;
create table loai_dich_vu(
ma_ldv int primary key auto_increment,
ten_ldv varchar(45) not null
);
insert into loai_dich_vu(ten_ldv) values
("Villa"),
("House"),
("Room");
select * from loai_dich_vu;
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
insert into dich_vu values
(1,"Villa Beach Front",25000,10000000,10,"vip","Có hồ bơi",500,4,1,3),
(2,"House Princess01",14000,5000000,7,"vip","Có thêm bếp nướng",null,3,2,2),
(3,"Room Twin01",5000,1000000,2,"normal","Có tivi",null,null,3,4),
(4,"Villa No Beach Front",22000,9000000,8,"normal","Có hồ bơi",300,3,1,3),
(5,"House Princess02",10000,4000000,5,"normal","Có thêm bếp nướng",null,2,2,3),
(6,"Room Twin02",3000,900000,2,"normal","Có tivi",null,null,3,4);
select * from dich_vu;

create table hop_dong(
ma_hd int primary key auto_increment,
ngay_lam date not null,
ngay_kt date not null,
tien_dat double not null,
ma_nv int not null,
ma_kh int not null,
ma_dv int not null,
foreign key(ma_dv) references dich_vu(ma_dv),
foreign key (ma_nv) references nhan_vien(ma_nv),
foreign key (ma_kh) references khach_hang(ma_kh)
);
drop table hop_dong;
select * from hop_dong;
insert into hop_dong values
(1,"2020-12-08","2020-12-08",0,3,1,3),
(2,"2020-07-14","2020-07-21",200000,7,3,1),
(3,"2021-03-15","2021-03-17",50000,3,4,2),
(4,"2021-01-14","2021-01-18",100000,7,5,5),
(5,"2021-07-14","2021-07-15",0,7,2,6),
(6,"2021-06-01","2021-06-03",0,7,7,6),
(7,"2021-09-02","2021-09-05",100000,7,4,4),
(8,"2021-06-17","2021-06-18",150000,3,4,1),
(9,"2020-11-19","2020-11-19",0,3,4,3),
(10,"2021-04-12","2021-04-14",0,10,3,5),
(11,"2021-04-25","2021-04-25",0,2,2,1),
(12,"2021-05-25","2021-05-27",0,7,10,1);
create table dich_vu_di_kem(
ma_dvdk int primary key auto_increment,
ten_dvdk varchar(45),
gia double not null,
don_vi varchar(45),
trang_thai varchar(45)
);
insert into dich_vu_di_kem values
(1,"Karaoke",10000,"giờ","tiện nghi,hiện tại"),
(2,"Thuê xe máy",10000,"chiếc","hỏng 1 xe"),
(3,"Thuê xe đạp",20000,"chiếc","tốt"),
(4,"Buffet buổi sáng",15000,"suất","đầy đủ đồ ăn, tráng miệng"),
(5,"Buffet buổi trưa",90000,"suất","đầy đủ đồ ăn, tráng miệng"),
(6,"Buffet buổi tối",16000,"suất","đầy đủ đồ ăn, tráng miệng");
create table hop_dong_chi_tiet(
ma_hdct int primary key auto_increment,
so_luong int not null,
ma_dvdk int,
ma_hd int,
unique (ma_dvdk,ma_hd),
foreign key(ma_dvdk) references dich_vu_di_kem(ma_dvdk),
foreign key (ma_hd) references hop_dong(ma_hd)
);
insert into hop_dong_chi_tiet values 
(1,5,4,2),
(2,8,5,2),
(3,15,6,2),
(4,1,1,3),
(5,11,2,3),
(6,1,3,1),
(7,2,2,1),
(8,2,2,12);
select * from nhan_vien;
-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien where (nhan_vien.ho_ten_nv like "K%" or nhan_vien.ho_ten_nv like "T%" or nhan_vien.ho_ten_nv like "H%")
and char_length(nhan_vien.ho_ten_nv)<=15;

-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from khach_hang where ((datediff("2021-12-10",khach_hang.ngay_sinh_kh)/365) between 18 and 50) 
and dia_chi_kh like "% Đà Nãng" or dia_chi_kh like "% Quảng Trị";

-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select count(khach_hang.ma_kh) as so_lan_dp, loai_khach.ten_lk, khach_hang.ten_kh, khach_hang.email_kh, khach_hang.gioi_tinh, khach_hang.so_cmnd_kh, khach_hang.so_cmnd_kh, loai_dich_vu.ten_ldv 
from (khach_hang inner join hop_dong on khach_hang.ma_kh = hop_dong.ma_kh 
inner join dich_vu on hop_dong.ma_dv = dich_vu.ma_dv
inner join loai_dich_vu on dich_vu.ma_ldv = loai_dich_vu.ma_ldv
inner join loai_khach on loai_khach.ma_lk = khach_hang.ma_lk)
where loai_khach.ten_lk = "Diamond" group by (khach_hang.ma_kh) order by so_lan_dp;

-- 5.Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select khach_hang.ma_kh, khach_hang.ten_kh, ten_lk,hop_dong.ma_hd, ngay_lam, ngay_kt, ten_dv , (dich_vu_di_kem.gia*hop_dong_chi_tiet.so_luong)+chi_phi as total
from khach_hang left join hop_dong on khach_hang.ma_kh = hop_dong.ma_kh 
left join loai_khach on loai_khach.ma_lk = khach_hang.ma_lk
left join dich_vu on dich_vu.ma_dv = hop_dong.ma_dv
left join hop_dong_chi_tiet on hop_dong.ma_hd = hop_dong_chi_tiet.ma_hd
left join dich_vu_di_kem on hop_dong_chi_tiet.ma_dvdk = dich_vu_di_kem.ma_dvdk;

-- 6.Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select dich_vu.ma_dv, dich_vu.ten_dv,dich_vu.dien_tich, dich_vu.chi_phi, loai_dich_vu.ten_ldv from dich_vu 
left join hop_dong on hop_dong.ma_dv = dich_vu.ma_dv left join loai_dich_vu on loai_dich_vu.ma_ldv = dich_vu.ma_ldv
where dich_vu.ma_dv not in(
	select dich_vu.ma_dv from dich_vu 
	left join hop_dong on hop_dong.ma_dv = dich_vu.ma_dv left join loai_dich_vu on loai_dich_vu.ma_ldv = dich_vu.ma_ldv
	where hop_dong.ngay_lam like "2021-03-%" or hop_dong.ngay_lam like "2021-02-%" or hop_dong.ngay_lam like "2021-01-%"
)
 group by dich_vu.ma_dv;

-- 7.Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

select dich_vu.ma_dv, dich_vu.ten_dv, dich_vu.dien_tich, dich_vu.so_nguoi, dich_vu.chi_phi, loai_dich_vu.ten_ldv, loai_dich_vu.ma_ldv from dich_vu
inner join loai_dich_vu on dich_vu.ma_ldv = loai_dich_vu.ma_ldv inner join hop_dong on hop_dong.ma_dv = dich_vu.ma_dv where hop_dong.ngay_lam like "2020-%"
and dich_vu.ma_dv not in
(
	select dich_vu.ma_dv from dich_vu
	inner join loai_dich_vu on dich_vu.ma_ldv = loai_dich_vu.ma_ldv 
	inner join hop_dong on hop_dong.ma_dv = dich_vu.ma_dv where hop_dong.ngay_lam like "2021-%"
    group by dich_vu.ma_dv
)
group by dich_vu.ma_dv;

-- 8.Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
select khach_hang.ten_kh from khach_hang group by ten_kh having count(ten_kh)<2;

-- 9.Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(hop_dong.ngay_lam) as month, count(month(hop_dong.ngay_lam)) as so_khach from khach_hang 
right join hop_dong on hop_dong.ma_kh = khach_hang.ma_kh where hop_dong.ngay_lam like "2021%" 
group by `month`
order by `month`;
    
-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc,
-- tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select hop_dong.ma_hd, hop_dong.ngay_lam, hop_dong.ngay_kt, hop_dong.tien_dat, sum(hop_dong_chi_tiet.so_luong) as num_dvdk from
hop_dong left join hop_dong_chi_tiet on hop_dong.ma_hd = hop_dong_chi_tiet.ma_hd left join
dich_vu_di_kem on dich_vu_di_kem.ma_dvdk = hop_dong_chi_tiet.ma_dvdk group by hop_dong.ma_hd;

-- 11.Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select dich_vu_di_kem.ma_dvdk, dich_vu_di_kem.ten_dvdk, dich_vu_di_kem.gia from dich_vu_di_kem inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dvdk = dich_vu_di_kem.ma_dvdk 
inner join hop_dong on hop_dong_chi_tiet.ma_hd = hop_dong.ma_hd inner join khach_hang on khach_hang.ma_kh = hop_dong.ma_kh 
inner join loai_khach on loai_khach.ma_lk = khach_hang.ma_lk where ten_lk = "Diamond" 
and (dia_chi_kh like "%, Vinh" or dia_chi_kh like "%, Quảng Ngãi");

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu,
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021
select hop_dong.ma_hd, nhan_vien.ho_ten_nv, khach_hang.ten_kh, khach_hang.so_dien_thoai_kh, dich_vu.ten_dv, sum(hop_dong_chi_tiet.so_luong), ngay_lam
from nhan_vien inner join hop_dong on hop_dong.ma_nv = nhan_vien.ma_nv inner join khach_hang on khach_hang.ma_kh = hop_dong.ma_kh
inner join dich_vu on dich_vu.ma_dv = hop_dong.ma_dv left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hd = hop_dong.ma_hd where 
hop_dong.ngay_lam like "2020-10-%" or hop_dong.ngay_lam like "2020-11-%" or hop_dong.ngay_lam like "2020-12-%" group by hop_dong.ma_hd
and hop_dong.ma_hd not in (select hop_dong.ma_hd
from nhan_vien inner join hop_dong on hop_dong.ma_nv = nhan_vien.ma_nv inner join khach_hang on khach_hang.ma_kh = hop_dong.ma_kh
inner join dich_vu on dich_vu.ma_dv = hop_dong.ma_dv left join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hd = hop_dong.ma_hd where 
hop_dong.ngay_lam like "2021-01-%" or hop_dong.ngay_lam like "2021-02-%" or hop_dong.ngay_lam like "2021-03-%" or
hop_dong.ngay_lam like "2021-04-%" or hop_dong.ngay_lam like "2021-05-%" or hop_dong.ngay_lam like "2021-06-%");

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
create view table_view as
(select sum(so_luong) as max, dich_vu_di_kem.ma_dvdk, ten_dvdk from khach_hang 
inner join hop_dong on khach_hang.ma_kh = hop_dong.ma_kh
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hd = hop_dong.ma_hd 
inner join dich_vu_di_kem on dich_vu_di_kem.ma_dvdk = hop_dong_chi_tiet.ma_dvdk 
group by hop_dong_chi_tiet.ma_dvdk);
select * from table_view where max = 15;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
select count(so_luong) as so_lan_sd, hop_dong.ma_hd, ten_dvdk from khach_hang 
inner join hop_dong on khach_hang.ma_kh = hop_dong.ma_kh
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_hd = hop_dong.ma_hd 
inner join dich_vu_di_kem on dich_vu_di_kem.ma_dvdk = hop_dong_chi_tiet.ma_dvdk 
group by hop_dong_chi_tiet.ma_dvdk having so_lan_sd = 1;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm 
-- ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

select nhan_vien.ma_nv, nhan_vien.ho_ten_nv, trinh_do.ten_td, nhan_vien.so_dt, nhan_vien.dia_chi 
from nhan_vien inner join hop_dong on hop_dong.ma_nv = nhan_vien.ma_nv inner join trinh_do on trinh_do.ma_td = nhan_vien.ma_td 
group by nhan_vien.ma_nv having count(nhan_vien.ma_nv) = 1;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.