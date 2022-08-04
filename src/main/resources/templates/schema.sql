-- NOT GONNA BE EXECUTED

CREATE SEQUENCE IF NOT EXISTS hibernate_sequence;

CREATE SEQUENCE IF NOT EXISTS customer_seq;
CREATE TABLE IF NOT EXISTS customers(
	customer_id BIGINT NOT NULL DEFAULT nextval('customer_seq') PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
	adress VARCHAR(100) NOT NULL,
	phone_number VARCHAR(100) NOT NULL,
	description VARCHAR(100) NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS orders_seq;
CREATE TABLE IF NOT EXISTS orders(
    order_number BIGINT NOT NULL DEFAULT nextval('orders_seq') PRIMARY KEY,
    product VARCHAR(100) NOT NULL,
    version VARCHAR(100) NOT NULL,
    quantity BIGINT NOT NULL,
    customer_id BIGINT REFERENCES customers
);