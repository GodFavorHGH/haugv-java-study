drop database if exists dockerdb;
create database dockerdb;
use dockerdb;
drop table if exists user;
create table user(
    id int not null auto_increment,
    login_name varchar(64) not null,
    password varchar(256) not null,
    email varchar(64) not null,
    phone varchar(16) not null,
    primary key pk_id(id),
    unique index idx_lg_nm(login_name),
    unique index idx_ph(phone)
);


