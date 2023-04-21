

create table buyer(

bid int primary key auto increment default 0,
bname varchar(20) not null,
bemail varchar(20) not null unique,
bmob_no varchar(15)
);


insert into buyer values('ramesh','ramesh@gmail.com','2643158764');
insert into buyer values('rama','rama@gmail.com','9862543178');
insert into buyer values('ganesh','ganesh@gmail.com','9956487236');



create table seller(

sid int primary key,
sname varchar(20) not null,
semail varchar(20)not null unique,
smob_no varchar(15)
);


insert into buyer values(default,'mahesh','mahesh@gmail.com','5648731968');
insert into buyer values(default,'virat','virat@gmail.com','8657942310');
insert into buyer values(default,'rohit','rohit@gmail.com','9862541320');



create table category(
cid int primary key,
cname varchar(20) not null
);




create table model(

mno int primary key,
mname varchar(20) not null,
cid int,
constraint fk_cid foreign key(cid) references category(cid)
on delete set null
on update cascade
);


create table cars(

reno int primary key,
rcno varchar(20) not null,
average double(2,2) not null,
age int not null,
colour varchar(10),
price double(9,2),
mno int,
sid int,
constraint fk_mno foreign key(mno) references model(mno)
constraint fk_sid foreign key(sid) references seller(sid)
on delete set null
on update cascade
);

create table payment(

pid int primary key,
custrno int,
pdate date,
pamount double(9,2) not null,
tid varchar(20),
status varchar(10),

constraint fk_cust foreign key(custrno) references buyer(bid) 
on delete set null
on update cascade
);

create table staff(

empno int primary key,
ename varchar(20) not null,
email varchar(20) not null,
job varchar(10) not null,
mobile varchar(15)
);


create table login(
loginid int primary key,
username varchar(20) not null,
password varchar(10) not null
);









