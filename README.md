# Spring Boot CRUD Application

This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot. The application demonstrates basic CRUD operations on a database for managing categories and products.

## Features

- Create a new category or product
- Read a single category/product or a list of categories/products
- Update an existing category or product
- Delete a category or product

## Technologies Used

- Spring Boot
- Spring Data JPA
- H2 Database (or any other relational database)
- Maven

## Setup and Run

1. **Clone the repository**:

    ```bash
    git clone https://github.com/SwarajBawankule/Spring_Boot_CRUD.git
    cd Spring_Boot_CRUD
    ```

2. **Build the project**:

    ```bash
    mvn clean install
    ```

3. **Run the application**:

    ```bash
    mvn spring-boot:run
    ```

4. **Access the application**:

    The application will be running at `http://localhost:8081`.

## API Endpoints

### Category CRUD Operations

- **GET /api/categories?page=3** - Retrieve all categories with pagination
- **POST /api/categories** - Create a new category
- **GET /api/categories/{id}** - Retrieve a single category by ID
- **PUT /api/categories/{id}** - Update an existing category by ID
- **DELETE /api/categories/{id}** - Delete a category by ID

### Product CRUD Operations

- **GET /api/products?page=2** - Retrieve all products with pagination
- **POST /api/products** - Create a new product
- **GET /api/products/{id}** - Retrieve a single product by ID
- **PUT /api/products/{id}** - Update an existing product by ID
- **DELETE /api/products/{id}** - Delete a product by ID

## License

This project is licensed under the MIT License.
