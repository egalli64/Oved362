use me;

-- Inserire come assunti oggi: 201, Maria Rossi, 5000€ e 202, Franco Bianchi, 4500€
insert into coders values (201, "Maria", "Rossi", curdate(), 5000);
insert into coders values (202, "Franco", "Bianchi", curdate(), 4500);

-- Cambiare il nome da Maria a Mariangela
update coders set first_name = "Mariangela" where coder_id = 201;

-- Aumentare di 500€ i salari minori di 6000€
update coders set salary = salary + 500 where salary < 6000;

-- Eliminare Franco Bianchi
delete from coders where coder_id = 202;

commit;