DROP TABLE IF EXISTS users;
CREATE TABLE users (
                          id INT AUTO_INCREMENT  PRIMARY KEY,
                          username VARCHAR(250) NOT NULL,
                          password VARCHAR(250) NOT NULL
);