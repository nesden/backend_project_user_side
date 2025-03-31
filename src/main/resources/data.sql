CREATE TABLE users(
id INT AUTO_INCREMENT,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
email VARCHAR(50) UNIQUE NOT NULL,
age INT NOT NULL,
address VARCHAR(100) NOT NULL,
joining_date DATE,
--date is allowed to be null since we do not enter it. it finds the current date which is the date the user is made
PRIMARY KEY (id)
);

--CREATE TABLE question(
--id INT AUTO_INCREMENT,
--answer_1 VARCHAR(250) NOT NULL,
--answer_2 VARCHAR(250) NOT NULL,
--answer_3 VARCHAR(250) NOT NULL,
--answer_4 VARCHAR(250) NOT NULL,
--PRIMARY KEY (id)
--);
--
