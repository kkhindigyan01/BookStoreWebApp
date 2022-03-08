CREATE DATABASE  IF NOT EXISTS jdbcpooldb;
CREATE TABLE IF NOT EXISTS `jdbcpooldb`.`book_table` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `author` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`book_id`),
  UNIQUE KEY `book_id_UNIQUE` (`book_id`),
  UNIQUE KEY `title_UNIQUE` (`title`)
);

INSERT INTO `jdbcpooldb`.`book_table`
(`title`,
`author`,
`price`)
VALUES
('Core Java','Kathy Sierra',900.0);

INSERT INTO `jdbcpooldb`.`book_table`
(`title`,
`author`,
`price`)
VALUES
('Spring in Action',' Craig Walls',950.0);
