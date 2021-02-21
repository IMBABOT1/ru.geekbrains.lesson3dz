DROP TABLE IF EXISTS customers;
CREATE TABLE customers (id bigserial PRIMARY KEY, name VARCHAR(255))
INSERT INTO customers (name) VALUES
('Customer1'),
('Customer1'),
('Customer3'),

DROP TABLE IF EXISTS items;
CREATE TABLE items (id bigserial PRIMARY KEY, title VARCHAR(255), price int);
INSERT INTO items (id, title, price)