CREATE TABLE `order_privilege` (
	`id_order` int(11) NOT NULL auto_increment,
	`name` char(50) NOT NULL,
	`add_order` int(11) NOT NULL,
	`delete_order` int(11) NOT NULL,
	`modify_order` int(11) NULL,
	PRIMARY KEY (`id_order`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
