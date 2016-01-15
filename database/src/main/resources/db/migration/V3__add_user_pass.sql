alter table user_info add column user_pass varchar (255);
update user_info set user_pass = user_name;
alter table user_info alter user_pass set not null;