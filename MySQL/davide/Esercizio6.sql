-- Scrivere e invocare la procedura tomorrow() che stampa la data di domani
drop procedure if exists tomorrow;

delimiter //
create procedure tomorrow()
begin
	select date_add(curdate(), interval 1 day) as tomorrw_date;
end;
// delimiter ;

call tomorrow;

drop procedure if exists what_day_will_be;

delimiter //
create procedure what_day_will_be (
	in p_day integer
) begin
	select date_add(curdate(), interval p_day day) as future_date;
end;
// delimiter ;

call what_day_will_be(42);

-- Scrivere e invocare la procedura get_coder() che ritorna nome e cognome di un coder identificato via id
drop procedure if exists get_coder;

delimiter //
create procedure get_coder(
	in p_coder_id integer,
    out p_nome_cognome varchar(50)  
) begin
	select concat(first_name, ' ', last_name)
    into p_nome_cognome
    from coders
    where coder_id = p_coder_id;
end;
// delimiter ;

call get_coder(104, @result);
select @result;