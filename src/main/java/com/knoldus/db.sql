CREATE DATABASE emp;
use emp;
CREATE TABLE emp(
    EmpId Serial Primary key,
    FirstName VARCHAR(255) NOT NULL,
    LastName VARCHAR(255) ,
    Age int(3),
    Phone int(10) Unique NOT NULL,
    Designation VARCHAR(100)

);
Insert Into emp(FirstName, LastName,Phone,Designation) Values ("Sakshi","Malik",22,123345,"Intern");
Insert Into emp(FirstName, LastName,Phone,Designation) Values ("S","M",10,12,"Intern");
Insert Into emp(FirstName, LastName,Phone,Designation) Values ("emp","M",22,145,"Intern");
Insert Into emp(FirstName, LastName,Phone,Designation) Values ("A","K",48,345,"Intern");

SELECT * FROM emp WHERE FirstName like '[S]';
