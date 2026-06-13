Employee API - Spring Boot CRUD Application

Overview

This project is a RESTful CRUD API built using Spring Boot and MongoDB.

The application allows users to:

- Create Employee
- Read Employee Details
- Update Employee
- Delete Employee

Technologies Used

- Java 21
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
- Git & GitHub

Project Structure

- Controller Layer
- Service Layer
- Repository Layer
- Model Layer

API Endpoints

Create Employee

POST /employees

Get All Employees

GET /employees

Get Employee By ID

GET /employees/{id}

Update Employee

PUT /employees/{id}

Delete Employee

DELETE /employees/{id}

MongoDB Configuration

application.properties

spring.data.mongodb.uri=mongodb://localhost:27017/employeedb

server.port=8081

How To Run Project

1. Start MongoDB Server
2. Open project in STS/Eclipse
3. Run EmployeeApiApplication.java
4. Test APIs using Postman or CURL

Sample JSON

{
"name": "Prateeksha",
"email": "prateeksha@gmail.com",
"department": "IT",
"salary": 50000
}

GitHub Repository

https://github.com/prateekshapandey643-glitch/employee.api
