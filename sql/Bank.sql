create table Account (
accid numeric primary key not null,
accpin char(4),
accbalance numeric(38)
);

create table Customer (
cid numeric primary key not null,
cname varchar(30) not null, 
accid numeric references Account(accid)not null
); 

create table Transaction(
trandid numeric primary key not null,
tranamount numeric(38),
trantype varchar(30),
accid references Account(accid) not null
);

insert into Account values (1,'1500',500);
insert into Account values (2,'2468',500);
insert into Account values (3,'1647',500);
insert into Account values (4,'7946',500);
insert into Account values (5,'3214',500);
insert into Account values (6,'7412',500);
insert into Account values (7,'1649',500);
insert into Account values (8,'9478',500);
insert into Account values (9,'5547',500);
insert into Account values (10,'7794',500);
drop table Account;
select * from Account;

insert into Customer values (1,'Spencer',2);
insert into Customer values (2,'Mark',5);
insert into Customer values (3,'John',6);
insert into Customer values (4,'Philip',7);
insert into Customer values (5,'Joemil',9);
insert into Customer values (6,'Justin',10);
insert into Customer values (7,'Bryce',3);
insert into Customer values (8,'Kevin',8);
insert into Customer values (9,'Aver',4);
insert into Customer values (10,'Mary Jun',01);
drop table Customer;
select * from Customer;

insert into Transaction values(1,500,'Savings',1);
insert into Transaction values(2,67700,'Loan',2);
insert into Transaction values(3,125070,'Savings',3);
insert into Transaction values(4,23500,'Loan',6);
insert into Transaction values(5,76500,'Loan',7);
insert into Transaction values(6,9500,'Savings',1);
insert into Transaction values(7,50110,'Savings',5);
insert into Transaction values(8,5080,'Loan',7);
insert into Transaction values(9,600,'Savings',8);
insert into Transaction values(10,6500,'Loan',3);
insert into Transaction values(11,4500,'Loan',2);
insert into Transaction values(12,33500,'Savings',8);
insert into Transaction values(13,1500,'Savings',5);
insert into Transaction values(14,8500,'Loan',4);
drop table Transaction;
select * from Transaction;