create database springdb;
use springdb;
create table employee (empno int primary key,name varchar(20),address varchar(20),salary double);

insert into employee(empno,name,address,salary) values (100,'amith','Hyderabad',45000),(101,'amith','Hyderabad',45000),(102,'John','Bangalore',35000),(103,'Kishan','Chennai',55000),(104,'Arun','Hyderabad',85000),(105,'Milan','Hyderabad',65000);