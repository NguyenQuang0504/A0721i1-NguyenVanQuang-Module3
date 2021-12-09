create database products;
use products;
create table product(
Id int primary key auto_increment,
productCode varchar(20),
productName varchar(40),
productPrice double not null,
productAmount int not null,
productDescription varchar(45),
productStatus bit default 1
);

insert into product values
(1,"P1","Ao1",30000,100,"Ao hoodie",1),
(2,"P2","Ao2",20000,0,"Ao hoodie2",0),
(3,"P3","Ao3",120000,100,"Ao hoodie3",1),
(4,"P4","Ao4",3000,120,"Ao hoodie4",1),
(5,"P5","Ao5",30000,1000,"Ao hoodie5",1),
(6,"P6","Ao6",50000,10,"Ao hoodie6",1),
(7,"P7","Ao7",60000,0,"Ao hoodie7",0),
(8,"P8","Ao8",20000,1050,"Ao hoodie8",1),
(9,"P9","Ao9",330000,1020,"Ao hoodie9",1),
(10,"P10","Ao10",30000,1002,"Ao hoodie10",1);

select * from product;

-- Tao index
explain select * from product where productCode = "P1";
create index idx_product_code on product(productCode);
explain select * from product where productCode = "P1";

-- Tao view
create view get_product_view as
select  productCode, productName, productPrice, productStatus from product;
select * from get_product_view;
-- Sua view
create or replace view get_product_view as
select  productCode, productName, productPrice, productStatus from product where
productStatus = 1;
-- Xoa view 
drop view get_product_view;

-- Store procedure
-- Store procedure lay tat ca thong tin
DELIMITER //
	create procedure getInfor()
		begin
			select * from product;
        end //
DELIMITER ;

call getInfor();

-- Store procedure them san pham

DELIMITER //
	create procedure addProduct(
    in productCode varchar(25),
	in productName varchar(45),
	in productPrice double ,
	in productAmount int ,
	in productDescription varchar(45),
	in productStatus bit)
	begin
    insert into product(productCode,productName,productPrice,productAmount,productDescription,productStatus) values
    (productCode,productName,productPrice,productAmount,productDescription,productStatus);
    end//
DELIMITER ;
call addProduct("P11","Ao11",3000,1202,"Ao hoodie11",1);
select * from product;

-- Store procedure sua theo id
DELIMITER //
	create procedure editProduct( in id_edit int,
    in productCode varchar(25),
	in productName varchar(45),
	in productPrice double ,
	in productAmount int ,
	in productDescription varchar(45),
	in productStatus bit)
	begin
    set SQL_SAFE_UPDATES = 0;
    update product set productCode = productCode,
    productName = productName, 
    productPrice = productPrice,
    productAmount = productAmount, 
    productDescription = productDescription, 
    productStatus = productStatus where
    Id = id_edit;
    set SQL_SAFE_UPDATES = 1;
    end//
DELIMITER ;
 call editProduct(1,"P13","Ao13",3000,1202,"Ao hoodie13",1);
 select * from product;