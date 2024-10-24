# Spring Boot REST API with PostgreSQL

This project demonstrates how to create a simple REST API using Spring Boot, PostgreSQL, and JPA. The API allows for basic CRUD (Create, Read, Update, Delete) operations on a product entity.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Technologies Used

- **Java**: 21
- **Spring Boot**: Latest version
- **PostgreSQL**: Database
- **Maven**: Project management and build tool
- **Eclipse**: IDE for Java development

## Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/springapi.git
   cd springapi
2. **Create PostgreSQL Database**:
   Open your PostgreSQL client and create a new database
   ```sql
   CREATE DATABASE springapidb;

4. **Configure Application Properties**:
   Update the src/main/resources/application.properties file with your PostgreSQL database credentials
   ```java
   spring.datasource.url=jdbc:postgresql://localhost:5432/springapidb
   spring.datasource.username=your_postgresql_username
   spring.datasource.password=your_postgresql_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

6. **Build the Project**:
   Make sure you have Maven installed. Run the following command in your project directory
   ```bash
   mvn clean install
   
8. **Run the Application**:
   You can run the application from your IDE (Eclipse) or use the command line
   ```bash
   mvn spring-boot:run

## Usage
Once the application is running, you can interact with the API using a tool like Postman or Curl.

## API Endpoints
Create a Product (POST):
URL: http://localhost:8080/api/v1/products
Request Body (JSON):
```json
{
    "name": "Product 1",
    "price": 100.0,
    "quantity": 10
}
```

Get All Products (GET):
URL: http://localhost:8080/api/v1/products

Get a Product by ID (GET):
URL: http://localhost:8080/api/v1/products/{id}

Delete a Product (DELETE):
URL: http://localhost:8080/api/v1/products/{id}

## License
This project is licensed under the MIT License - see the LICENSE file for details.

### Instructions for Use:
1. Replace `yourusername` with your actual GitHub username in the clone URL.
2. Customize any additional sections as needed (e.g., adding instructions for updating the project or contributing).
3. Save this as `README.md` in the root directory of your project repository.
