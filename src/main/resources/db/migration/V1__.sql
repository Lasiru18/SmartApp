CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE item
(
    id BIGINT NOT NULL,
    _item_code          VARCHAR(255),
    _item_name          VARCHAR(255),
    _remaining_quantity VARCHAR(255),
    CONSTRAINT pk_item PRIMARY KEY (id)
);

CREATE TABLE stock_item
(
    id BIGINT NOT NULL,
    _item_code      VARCHAR(255),
    _stock_batch    VARCHAR(255),
    _added_quantity VARCHAR(255),
    _1_item_price   VARCHAR(255),
    CONSTRAINT pk_stockitem PRIMARY KEY (id)
);