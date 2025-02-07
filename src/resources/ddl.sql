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

INSERT INTO clothes (id, name, price, stock) VALUES
(1, 'DeadSquad - Curse Of The Black Plague', 180000, 5),
(2, 'COLORCODE - Check My Sanity', 155000, 2),
(3, 'KOIL - Megalo Emperor', 160000, 6),
(4, 'Revenge The Fate - Sinsera', 200000, 8),
(5, 'Eastcape - Obsessed', 180000, 1),
(6, 'The Sigit - Another Day', 160000, 2),
(7, 'Morfem - Sneakerfuzz', 140000, 9),
(8, 'Darksovls - Radiusinis', 160000, 3),
(9, 'Modern Guns - Everything Falls Apart', 160000, 2),
(10, 'Puupen - Injak Balik!', 190000, 1);


