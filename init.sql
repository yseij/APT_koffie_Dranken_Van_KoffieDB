\c postgres
CREATE TABLE test(
    id int PRIMARY KEY,
    name varchar(255),
    lastName varchar(255)
);

INSERT INTO test
    (id, name, lastName)
VALUES
    (1, 'Youri', 'Seijkens')