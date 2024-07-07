# CRUD Operations Application

This is a simple CRUD (Create, Read, Update, Delete) application for managing products using Spring Boot and JPA (Java Persistence API).

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Entity](#entity)
- [Repository](#repository)
- [Service](#service)
- [Controller](#controller)
- [License](#license)

## Introduction

This application provides RESTful web services to manage products. It includes operations to create, read, update, and delete products.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (for testing purposes)
- Maven

## Getting Started

### Prerequisites

- JDK 11 or higher
- Maven
- An IDE such as IntelliJ IDEA or Eclipse

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/crud-operations.git
    ```

2. Navigate to the project directory:

    ```bash
    cd crud-operations
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

The application provides the following REST endpoints for managing products:

- `POST /createProduct`: Create a new product.
- `POST /createProducts`: Create multiple products at once.
- `GET /products`: Retrieve all products.
- `GET /productById/{id}`: Retrieve a product by ID.
- `GET /productByName/{name}`: Retrieve a product by name.
- `PUT /update`: Update an existing product.
- `DELETE /delete/{id}`: Delete a product by ID.

## Entity

The `Product` entity represents a product with attributes like ID, name, quantity, and price.

## Repository

The `ProductRepository` interface extends `JpaRepository` to perform CRUD operations on the `Product` entity. It includes custom query methods like `findByName`.

## Service

The `ProductService` class implements business logic for CRUD operations on products. It interacts with the `ProductRepository` to perform database operations.

## Controller

The `ProductController` class defines REST endpoints for product CRUD operations. It uses `ProductService` to handle business logic.

