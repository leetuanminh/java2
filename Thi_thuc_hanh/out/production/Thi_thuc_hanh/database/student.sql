create database if not exists managementStudent;

use managementStudent;

drop table  if exists students;
create table students (
                          studentId varchar(10),
                          name varchar(50),
                          Address varchar(50),
                          phone varchar(20),
                          primary key (id)
);

insert into students value ('B01010', 'Nguyen Tuan Anh', 'Ha Noi', '0904818238');
insert into students value ('B01222', 'Nguyen Hoang Hai', 'Ha Noi', '0494949494');
insert into students value ('B01214', 'Nguyen Van An', 'Ha Noi', '0999999999');
insert into students value ('B01950', 'Do Nhu Binh', 'Ha Noi', '0988888888');