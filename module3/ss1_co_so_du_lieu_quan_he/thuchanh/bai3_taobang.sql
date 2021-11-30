-- Tao database
create database ss1_cosodulieuquanhe;
-- Su dung database ss1_cosodulieuquanhe de truy van
use ss1_cosodulieuquanhe;
create table sinh_vien(
ma_sv int,
name_sv varchar(70), -- 70 la so luong ky tu toi da cua ten sv
age int,
country varchar(20) -- 20 la so luong ky tu toi da
);
-- Hien thi table
-- Dau * hien thi tat ca thong tin
select * from sinh_vien;
-- Hien thi Ma sv
select ma_sv from sinh_vien;