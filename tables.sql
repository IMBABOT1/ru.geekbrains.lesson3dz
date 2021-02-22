DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE customers (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO customers (name) VALUES:
('Customer1')
('Customer2');


DROP TABLE IF EXISTS items CASCADE;
CREATE TABLE items (id bigserial PRIMARY KEY, title VARCHAR(255), price int, item_id bigint REFERENCES customers(id));
INSERT INTO  items(title, price, item_id) VALUES
('item1', 1, 1)
('item2', 2, 1)
('item3', 3, 2)
('item4', 4, 2)
