CREATE DATABASE productManagement
CHARACTER SET utf8  COLLATE utf8_general_Ci;

use productManagement;

CREATE TABLE users(
id int not null auto_increment PRIMARY key,
name VARCHAR(200),
username VARCHAR(200) UNIQUE KEY, 
pass VARCHAR(100),
created_at TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP null DEFAULT null,
deleted_at TIMESTAMP null default null
) ENGINE=INNODB;

CREATE TABLE products(
id int not null auto_increment PRIMARY key,
name VARCHAR(200) not null,
category VARCHAR(200) not null,
price DECIMAL(15,2),
created_at TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP null DEFAULT null,
deleted_at TIMESTAMP null default null
)ENGINE=INNODB;