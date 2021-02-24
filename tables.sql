DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE customers (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO customers (name) VALUES
('customer 1'),
('customer 2'),
('customer 3');


DROP TABLE IF EXISTS goods CASCADE;
CREATE TABLE goods (id bigserial PRIMARY KEY, name VARCHAR(255), cost int, customers_id bigint REFERENCES customers(id));
INSERT INTO goods (name, cost, customers_id) VALUES
('good 1', 1, 1),
('good 2', 2, 1),
('good 3', 3, 2),
('good 4', 4, 2);


