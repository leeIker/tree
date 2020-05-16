create table tree_role(
	id int not null auto_increment,
	name char(50),
	id_name int,
	id_order int,
	primary key(id),
	foreign key(id_name) references name_privilege(id_name),
	foreign key(id_order) references order_privilege(id_order)
)
