\c docker_database_1
CREATE TABLE public.test(
    id int PRIMARY KEY,
    name varchar(255),
    lastName varchar(255)
);

INSERT INTO public.test
    (id, name, lastName)
VALUES
    (1, 'Youri', 'Seijkens')
