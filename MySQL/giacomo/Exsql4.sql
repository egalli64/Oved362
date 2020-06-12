select team_id, name, first_name from team_coder join coders using (coder_id) join teams using (team_id) order by 1;

insert into coders (coder_id, first_name, last_name, hire_date, salary) values (201, 'Maria', 'Rossi', '2006-04-04', 5000), (202, 'Franco','Bianchi', '2010-12-08', 4500);

update coders set first_name = 'Mariangela' where coder_id = 201;

update coders set salary = salary+500 where coder_id > 0 and salary < 6000;

delete from coders where coder_id = 202;

commit;