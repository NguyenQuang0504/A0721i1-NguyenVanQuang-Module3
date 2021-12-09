-- Tao index
explain select * from customers where customerName = "Land of Toys Inc."; -- Truy xuat thong thuong duyet qua 122 record
create index idx_search_customer on customers(customerName);
explain select * from customers where customerName = "Land of Toys Inc.";-- Truy xuat sau khi tao index qua 1 record