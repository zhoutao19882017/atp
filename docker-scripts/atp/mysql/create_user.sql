select 'executing drop user atp' as log from dual;
drop user if exists 'atp'@'%';

-- Creates the user
select 'executing create user atp' as log from dual;
create user 'atp'@'%' identified by 'atp';

-- Gives all the privileges to the new user on the
select 'executing grant privilege' as log from dual;
grant all on atp.* to 'hoppscotch'@'%';
