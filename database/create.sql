create database argus;
use argus;
CHARACTER SET utf8 COLLATE utf8_hungarian_ci
create table buildings(
    id int NOT NULL primary key AUTO_INCREMENT,
    city varchar(50) not null,
    address varchar(50) not null,
    busage varchar(50) not null,
    size int not null,
    price int not null,
);