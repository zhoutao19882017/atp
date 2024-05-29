select 'executing drop database' as log from dual;
DROP DATABASE IF EXISTS `atp`;

-- Create the new database
select 'executing create database' as log from dual;
CREATE DATABASE `atp` DEFAULT CHARACTER SET utf8mb4;
