DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE customers (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO customers (name) VALUES
('Customer1'),
('Customer2');

DROP TABLE IF EXISTS goods CASCADE:
CREATE TABLE goods (id bigserial PRIMARY KEY, name VARCHAR(255), cost int, goods_id bigint REFERENCES customers(id));
INSERT INTO goods(name, cost, goods_id) VALUES
('product1', 1, 1),
('product2', 2, 1),
('product3', 3, 2),
('product4', 4, 2),


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
