/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  User
 * Created: Feb 7, 2025
 */

CREATE TABLE clothes (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    price DOUBLE PRECISION,
    stock INT
);

CREATE TABLE roles (
    id INT PRIMARY KEY,
    code VARCHAR(5),
    name VARCHAR(255),
    description VARCHAR(255)
);

INSERT INTO roles (id, code, name, description)
VALUES (1, 'A', 'Admin', 'Administration Role'), 
(2, 'U', 'User', 'User Role');

CREATE SEQUENCE users_id_seq;

CREATE TABLE users (
    id INT PRIMARY KEY,
    role_id INT REFERENCES roles(id),
    name VARCHAR(50),
    email VARCHAR(100),
    username VARCHAR(25),
    password VARCHAR(255)
);

ALTER TABLE users ADD COLUMN salt VARCHAR(255) NOT NULL DEFAULT '';

ALTER TABLE users ALTER COLUMN id SET DEFAULT nextval('users_id_seq');

ALTER SEQUENCE users_id_seq OWNED BY users.id;



