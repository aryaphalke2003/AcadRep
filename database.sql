create DATABASE aims;

CREATE TABLE coursecatalog(

    coursecode VARCHAR NOT NULL,
    dept varchar not null,
    pos varchar not null,
    credits INTEGER NOT NULL,
    lec INTEGER NOT NULL,
    tut INTEGER NOT NULL,
    prac INTEGER NOT NULL,
    prereq varchar,
    PRIMARY KEY (coursecode,dept)
);

create  table offeredc(
    coursecode VARCHAR not null,
    dept varchar not null,
    pos varchar not null, 
    facultyname varchar not null,
    year int not null,
    semester INT not null,
    cgcr real DEFAULT 0.0,
    PRIMARY key (coursecode,year,semester,facultyname)

);

CREATE table sems(
    year int not null,
    semester int not null,
    status varchar not null,
    PRIMARY key(year,semester)
);


create  table compc(

    coursecode varchar not null,
    stumail varchar not null,
    stuname varchar not null,
    facultyname varchar not null,
    year int not null,
    semester int not null,
    dept varchar not null,
    pos varchar not null,
    credits int not null,
    grade varchar,
    PRIMARY KEY (coursecode,stumail)
    

);


CREATE  table runc(

    coursecode varchar not null,
    stumail varchar not null,
    stuname varchar not null,
    year int not null,
    semester int not null,
    dept varchar not null,
    pos varchar not null,
    credits int not null,
    PRIMARY key (coursecode,stumail)

);




create  table auth(

    email varchar not null,
    password varchar not null,
    username varchar not null,
    role varchar not null,
    PRIMARY KEY (email)
);


create  table student(

    email varchar not null,
    stuname varchar not null,
    startyear int,
    dept varchar not null,
    PRIMARY KEY (email)
);


create table faculty(

    email varchar not null,
    facname varchar not null,
    dept varchar not null,
    PRIMARY key (email)

);
