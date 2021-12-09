-- Tao mot procedure
DELIMITER //

CREATE PROCEDURE findAllCustomers()

BEGIN

  SELECT * FROM customers;

END //

DELIMITER ;

-- Sua producedure

DELIMITER //

DROP procedure if exists findAllCustomers//
create procedure findAllCustomers()
	begin
		select * from customers where customerNumber = 175;
    end//
DELIMITER ;
-- Goi procedure
call findAllCustomers();