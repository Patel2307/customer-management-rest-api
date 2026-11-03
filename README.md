# Customer Management REST API

A RESTful backend application built using Java and Spring Boot to manage customer records.

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- H2 In-Memory Database
- Maven
- Jakarta Bean Validation

## Features

- Create new customers
- Retrieve all customers
- Retrieve a customer by ID
- Update existing customer information
- Delete customers
- Validate customer names and email addresses
- Return appropriate HTTP status codes
- Handle validation errors with meaningful messages

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/customers` | Retrieve all customers |
| GET | `/api/customers/{id}` | Retrieve a customer by ID |
| POST | `/api/customers` | Create a new customer |
| PUT | `/api/customers/{id}` | Update an existing customer |
| DELETE | `/api/customers/{id}` | Delete a customer |

## Example Request

**POST** `/api/customers`

```json
{
  "name": "Alex",
  "email": "alex@example.com"
}
```

## How to Run

1. Install Java 21.
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA or another Java IDE.
4. Allow Maven to download the required dependencies.
5. Run `CustomerManagementApplication.java`.
6. Access the API at `http://localhost:8080/api/customers`.

## Database

This project uses an H2 in-memory database for local development. Customer records are not preserved after the application stops.

## Future Improvements

- Add automated unit and integration tests
- Add pagination and search functionality
- Add persistent database support
- Add API documentation using OpenAPI/Swagger
