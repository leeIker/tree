CREATE TABLE `name_privilege` (
	`id_name` int(11) NOT NULL auto_increment,
	`name` char(50) NOT NULL,
	`add_name` int(11) NOT NULL,
	`delete_name` int(11) NOT NULL,
	`modify_name` int(11) NULL,
	PRIMARY KEY (`id_name`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
