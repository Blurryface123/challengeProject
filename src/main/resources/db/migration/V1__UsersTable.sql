CREATE TABLE users IF NOT EXISTS(
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age int NOT NULL,
    userName VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);