-- PC program core EC engineer core ES electives

truncate table auth;
truncate table student;
truncate table faculty;

insert into auth(email,password,username,role)  values ('arya@gmail.com','arya','Arya Admin','admin');

insert into auth (email,password,username,role) VALUES ('faculty@iitrpr.ac.in', 'arya', 'Arya Faculty','faculty');
insert into auth (email,password,username,role) VALUES ('faculty1@iitrpr.ac.in', 'arya', 'Arya CSE','faculty');
insert into auth (email,password,username,role) VALUES ('faculty2@iitrpr.ac.in', 'arya', 'Arya MNC','faculty');
insert into auth (email,password,username,role) VALUES ('faculty3@iitrpr.ac.in', 'arya', 'Arya HSS','faculty');

insert into auth (email,password,username,role) VALUES ('1@iitrpr.ac.in', 'arya', 'Student1','student');
insert into auth (email,password,username,role) VALUES ('2@iitrpr.ac.in', 'arya', 'Student2','student');
insert into auth (email,password,username,role) VALUES ('3@iitrpr.ac.in', 'arya', 'Student3','student');
insert into auth (email,password,username,role) VALUES ('4@iitrpr.ac.in', 'arya', 'Student4','student');
insert into auth (email,password,username,role) VALUES ('5@iitrpr.ac.in', 'arya', 'Student5','student');

insert into student(email,stuname,startyear,dept) VALUES ('1@iitrpr.ac.in', 'Student1' , 2021, 'CSE');
insert into student(email,stuname,startyear,dept) VALUES ('2@iitrpr.ac.in', 'Student2' , 2021, 'CSE');
insert into student(email,stuname,startyear,dept) VALUES ('3@iitrpr.ac.in', 'Student3' , 2021, 'MNC');
insert into student(email,stuname,startyear,dept) VALUES ('4@iitrpr.ac.in', 'Student4' , 2021, 'MNC');
insert into student(email,stuname,startyear,dept) VALUES ('5@iitrpr.ac.in', 'Student5' , 2021, 'CSE');

insert into faculty(email,facname,dept) VALUES ('faculty@iitrpr.ac.in','Arya Faculty','CSE');
insert into faculty(email,facname,dept) VALUES ('faculty1@iitrpr.ac.in','Arya CSE','CSE');
insert into faculty(email,facname,dept) VALUES ('faculty2@iitrpr.ac.in','Arya MNC','MNC');
insert into faculty(email,facname,dept) VALUES ('faculty3@iitrpr.ac.in','Arya HSS','HSS');



-- insert into offeredc(coursecode,dept,pos,facultyname,year,semester,cgcr ) 
-- VALUES ('CS201','CSE','PC','Arya Faculty',2023,2,0.0);

-- insert into runc(coursecode,stumail,stuname,year,semester,dept,pos,credits) 
-- values('CS303','1@iitrpr.ac.in','Student1','2023','2','CSE','PC',4);

-- insert into compc(coursecode,stumail,stuname,facultyname,year,semester,dept,pos,credits,grade)
-- values('CS201','3@iitrpr.ac.in','Student3','AryaFaculty',2022,1,'CSE','PC',3,'A');


-- insert into sems(year,semester,status) values (2022,1,'completed');
-- insert into sems(year,semester,status) values (2022,2,'completed');
-- insert into sems(year,semester,status) values (2023,1,'completed');
-- insert into sems(year,semester,status) values (2023,2,'running');

truncate table sems;
truncate table runc;
insert into sems(year,semester,status) values (2022,1,'running');

--delete from runc where coursecode='CS501';

--CSE
CP301 CSE PC 3 4-3-2 None
CP302 CSE PC 3 4-3-2 None
CP303 CSE PC 3 4-3-2 None
II301 CSE PC 3 4-3-2 None

CS201 CSE PC 3 4-3-2 None
CS202 CSE PC 3 4-3-2 None
CS203 CSE PC 3 4-3-2 None
CS204 CSE PC 3 4-3-2 None
CS205 CSE PC 3 4-3-2 None
CS206 CSE PC 3 4-3-2 None

CS301 CSE PC 4 4-3-2 CS201
CS302 CSE PC 4 4-3-2 CS201,CS202
CS303 CSE PC 4 4-3-2 CS201,CS202,CS203
CS304 CSE PC 4 4-3-2 None
CS305 CSE PC 4 4-3-2 None
CS306 CSE PC 4 4-3-2 None

CS401 CSE PC 4 4-3-2 CS301
CS402 CSE PC 4 4-3-2 CS301,CS302
CS403 CSE PC 4 4-3-2 CS301,CS302,CS303

CS501 CSE PC 4 4-3-2 None
CS502 CSE PC 4 4-3-2 None
CS503 CSE PC 4 4-3-2 None


--MNC
CP301 MNC PC 3 4-3-2 None
CP302 MNC PC 3 4-3-2 None
CP303 MNC PC 3 4-3-2 None
II301 MNC PC 3 4-3-2 None

MA201 MNC PC 3 4-3-2 None
MA202 MNC PC 3 4-3-2 None
MA203 MNC PC 3 4-3-2 None
MA204 MNC PC 3 4-3-2 None
MA205 MNC PC 3 4-3-2 None
MA206 MNC PC 3 4-3-2 None

MA301 MNC PC 4 4-3-2 None
MA302 MNC PC 4 4-3-2 None
MA303 MNC PC 4 4-3-2 None
MA304 MNC PC 4 4-3-2 None
MA305 MNC PC 4 4-3-2 None
MA306 MNC PC 4 4-3-2 None

MA401 MNC PC 4 4-3-2 None
MA402 MNC PC 4 4-3-2 None
MA403 MNC PC 4 4-3-2 None

MA501 MNC PC 4 4-3-2 None
MA502 MNC PC 4 4-3-2 None
MA503 MNC PC 4 4-3-2 None


--EC
GE101 OPN EC 4 4-3-2 None
GE102 OPN EC 4 4-3-2 None
GE103 OPN EC 4 4-3-2 None
GE104 OPN EC 4 4-3-2 None
GE105 OPN EC 4 4-3-2 None

GE111 OPN EC 4 4-3-2 GE101,GE102
GE112 OPN EC 4 4-3-2 None
GE113 OPN EC 4 4-3-2 GE101,GE103
GE114 OPN EC 4 4-3-2 None
GE115 OPN EC 4 4-3-2 GE111



--ES
HS101 OPN ES 4 4-3-2 None
HS102 OPN ES 4 4-3-2 HS101
HS103 OPN ES 4 4-3-2 None
HS104 OPN ES 4 4-3-2 HS102,HS103
HS105 OPN ES 4 4-3-2 None

HS111 OPN ES 4 4-3-2 
HS112 OPN ES 4 4-3-2 None
HS113 OPN ES 4 4-3-2 HS112,HS111
HS114 OPN ES 4 4-3-2 None
HS115 OPN ES 4 4-3-2 HS111,HS101
