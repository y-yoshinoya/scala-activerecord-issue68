# Tasks schema

# --- !Ups
create table users (
  login varchar(128) not null,
  profiles varchar,
  id bigint not null primary key auto_increment
);

# --- !Downs
drop table users;
