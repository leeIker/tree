create table role(
	id int not null  auto_increment,
	name char not null,
	id_two int,
	id_three int,
	primary key(id),
	foreign key(id_two) references privilege_for_two(id_two),
	foreign key(id_three) references privilege_for_three(id_three)
)
