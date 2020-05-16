CREATE TABLE `base_privilege` (
	`id_basc` int(11) NOT NULL auto_increment,
	`name` char(50) NOT NULL,
	`value` boolean NOT NULL,
	PRIMARY KEY (`id_basc`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;
