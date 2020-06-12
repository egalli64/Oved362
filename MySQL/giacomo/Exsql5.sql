drop procedure if exists tomorrow;

delimiter //
	create procedure tomorrow()
		begin
			select date_add(curdate(), interval 1 day) as tomorrow;
		end;
// delimiter ;

call tomorrow();

drop procedure if exists tomorrow_lavendemmia;

delimiter //
	create procedure tomorrow_lavendemmia(in days int, in name varchar(30))
		begin
			select date_add(curdate(), interval days day) as tomorrow, name;
		end;
// delimiter ;

call tomorrow_lavendemmia(30,'Jesus');

drop procedure if exists get_coder;

delimiter //
	create procedure get_coder(in id int)
		begin
			select concat(first_name,' ',last_name) as coder from coders where coder_id = id;
		end;
// delimiter ;

call get_coder(103);