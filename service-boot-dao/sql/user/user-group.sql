create table users(
	username varchar(50) not null primary key,
	password varchar(50) not null,
	enabled boolean not null
);

create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null
);
create unique index ix_auth_username on authorities (username,authority);


create table groups (
	id bigint AUTO_INCREMENT primary key,
	group_name varchar(50) not null
);

create table group_authorities (
	group_id bigint not null,
	authority varchar(50) not null
);

create table group_members (
	id bigint AUTO_INCREMENT  primary key,
	username varchar(50) not null,
	group_id bigint not null
);
