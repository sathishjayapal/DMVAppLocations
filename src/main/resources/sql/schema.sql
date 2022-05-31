CREATE TABLE IF NOT EXISTS WIDMV
(
    id         VARCHAR(60) PRIMARY KEY,
    objectid   VARCHAR NOT NULL,
    dmvDesc    VARCHAR NOT NULL,
    dmvAddress VARCHAR NOT NULL,
    dmvCnty    VARCHAR NOT NULL,
    dmvZipCode VARCHAR NOT NULL
);
