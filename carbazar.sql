

create table buyer(

bid int primary key,
bname varchar(20) not null,
bemail varchar(20) not null unique,
bmob_no int
);


create table seller(

sid int primary key,
sname varchar(20) not null,
semail varchar(20)not null unique,
smob_no int
);

create table category(

cid int primary key,
cname varchar(20) not null
);

create table model(

mno int primary key,
mname varchar(20) not null
);


create table cars(

reno int primary key,
rcno varchar(20) not null,
age int not null,
average double(2,2) not null,
colour varchar(10),
mno int,
cid int,
sid int,
bid int,
constraint fk_mno foreign key(mno) references model(mno)
constraint fk_cid foreign key(cid) references category(cid)
constraint fk_sid foreign key(sid) references seller(sid)
constraint fk_bid foreign key(bid) references buyer(bid)
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

