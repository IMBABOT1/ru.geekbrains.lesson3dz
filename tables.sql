DROP TABLE IF EXISTS universities CASCADE;
CREATE TABLE universities (id bigserial PRIMARY KEY, title VARCHAR(255));
INSERT INTO universities (title) VALUES
('DSTU'),
('NPU');

DROP TABLE IF EXISTS students CASCADE;
CREATE TABLE students (id bigserial PRIMARY KEY, name VARCHAR(255), university_id bigint REFERENCES universities (id));
INSERT INTO students (name, university_id) VALUES
('Alexander', 1),
('Bob', 2),
('John', 1);

DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE customers (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO customers (name) VALUES
('customer1'),
('customer2');


DROP TABLE IF EXISTS goods CASCADE;
CREATE TABLE goods (id bigserial PRIMARY KEY, name VARCHAR(255), cost int, customers_id bigint REFERENCES customers(id));
INSERT INTO goods (name, cost, customers_id) VALUES
('good1', 1, 1),
('good2', 2, 1),
('good3', 3, 2),
('good4', 4, 2);


