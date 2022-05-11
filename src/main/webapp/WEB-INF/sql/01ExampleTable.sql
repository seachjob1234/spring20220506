Create database mydb4;
use mydb4;

create TABLE Customers
select*from w3schools.Customers;

desc Customers;
alter table Customers
modify column CustomerID int PRIMARY KEY auto_increment;

create TABLE Employees
select*from w3schools.Employees;

desc Employees;
alter table Employees
modify column EmployeeID int PRIMARY KEY auto_increment;

select * from Customers;
select * from Employees;