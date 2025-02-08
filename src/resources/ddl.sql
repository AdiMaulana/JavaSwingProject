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

CREATE TABLE users (
    id INT PRIMARY KEY,
    role_id INT REFERENCES roles(id),
    name VARCHAR(50),
    email VARCHAR(100),
    username VARCHAR(25),
    password VARCHAR(255)
);

ALTER TABLE users ADD COLUMN salt VARCHAR(255) NOT NULL DEFAULT '';

CREATE SEQUENCE users_id_seq;

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

CREATE SEQUENCE clothes_id_seq;

ALTER TABLE clothes ALTER COLUMN id SET DEFAULT nextval('clothes_id_seq');

ALTER SEQUENCE clothes_id_seq OWNED BY clothes.id;

CREATE TABLE revenue (
    id SERIAL PRIMARY KEY,                  -- Unique identifier for the sale
    clothing_id INTEGER NOT NULL,          -- Foreign key to your clothing table
    sale_date TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT NOW(),  -- Date and time of the sale
    quantity INTEGER NOT NULL,             -- Number of items sold
    price_per_item DECIMAL(10, 2) NOT NULL, -- Price of each item
    total_amount DECIMAL(10, 2) NOT NULL,   -- Total amount for this line item (quantity * price_per_item)
    customer_id INTEGER,                   -- (Optional) Foreign key to your customer table
    discount_amount DECIMAL(10, 2) DEFAULT 0.00, -- (Optional) Discount amount applied
    payment_method VARCHAR(50),             -- (Optional) e.g., "Credit Card", "Cash", "Online"
    FOREIGN KEY (clothing_id) REFERENCES clothes(id) -- Assuming you have a 'clothing' table with an 'id' column
);

CREATE SEQUENCE revenue_id_seq;

ALTER TABLE revenue ALTER COLUMN id SET DEFAULT nextval('revenue_id_seq');

ALTER SEQUENCE revenue_id_seq OWNED BY revenue.id;
