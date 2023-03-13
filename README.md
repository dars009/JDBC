## JDBC - Java Database Connectivity

## Index
• [Pre-requisite](#pre-requisite)
<br> • [Introduction](#introduction)
<br> • [JDBC Architecture](#jdbc-architecture)
<br> • [MySQL Queries](#mysql-queries)
<br> • [Steps to write a JDBC program](steps-to-write-a-jdbc-program)

## Pre-requisite
• [MySql Download](https://dev.mysql.com/downloads/installer/)
<br> • [JDK 1.8 Download](https://developers.redhat.com/products/openjdk/download)
<br> • [Eclipse Download](https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2022-12/R/eclipse-jee-2022-12-R-win32-x86_64.zip&mirror_id=1248)

## Introduction 
•	JDBC is used to interact with various type of Database such as Oracle, MS Access, My SQL and SQL Server. <br>
•	JDBC can also be defined as the platform-independent interface between a relational database and Java programming. <br>
•	It allows java program to execute SQL statement and retrieve result from database. <br>

## JDBC Architecture
![image](https://user-images.githubusercontent.com/22477406/223450119-b5a059f5-18a7-4532-a736-60768b275a00.png)

## MySQL Queries
• Drop (Delete) the database if exist 
```bash
  DROP DATABASE IF EXISTS employee;
```
• Create new schema/database if not exist 
```bash
  CREATE DATABASE IF NOT EXISTS employee;
```
• Setting the Default Database
```bash
USE southwind;
```
• Show all the tables in the current database.
```bash
SHOW TABLES;
```
• Create the table "products".
```bash
CREATE TABLE IF NOT EXISTS products (
productID INT UNSIGNED NOT NULL AUTO_INCREMENT,
productCode CHAR(3) NOT NULL DEFAULT '',
name VARCHAR(30) NOT NULL DEFAULT '',
quantity INT UNSIGNED NOT NULL DEFAULT 0,
price DECIMAL(7,2) NOT NULL DEFAULT 99999.99,
PRIMARY KEY (productID));
```
• Show all the tables to confirm that the "products" table has been created
```bash
SHOW TABLES;
```
• Describe the fields (columns) of the "products" table
```bash
DESCRIBE products;
```
• Show the complete CREATE TABLE statement used by MySQL to create this table
```bash
SHOW CREATE TABLE products \G
```
• Inserting Rows
```bash
INSERT INTO products VALUES (1001, 'PEN', 'Pen Red', 5000, 1.23);
```
• Insert multiple rows in one command
• Inserting NULL to the auto_increment column results in max_value + 1
```bash
INSERT INTO products VALUES (NULL, 'PEN', 'Pen Blue', 8000, 1.25),(NULL, 'PEN', 'Pen Black', 2000, 1.25);
```
• Insert value to selected columns
• Missing value for the auto_increment column also results in max_value + 1 
```bash
INSERT INTO products (productCode, name, quantity, price) 
VALUES
 ('PEC', 'Pencil 2B', 10000, 0.48),
 ('PEC', 'Pencil 2H', 8000, 0.49);
```
• Missing columns get their default values
```bash
INSERT INTO products (productCode, name) VALUES ('PEC','Pencil HB');
```
• 2nd column (productCode) is defined to be NOT NULL
```bash
INSERT INTO products values (NULL, NULL, NULL, NULL, NULL);
```
• show table
```bash
SELECT * FROM products;
```
• Remove the specific row
```bash
DELETE FROM products WHERE productID = 1006;
```
• List all rows for the specified columns
```bash
SELECT name, price FROM products;
```

## Steps to write a JDBC program
Step 1: Load the Driver class
Step 2: Establish the connection <br>
Step 3: Create the required statement <br>
Step 4: Prepare the Required SQL statement <br>
Step 5: Submit the SQL statement to Database <br>
Step 6: Process the Results <br>
Step 7: Release the Resources <br>
