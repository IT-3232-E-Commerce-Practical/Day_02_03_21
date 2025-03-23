# Day_02_03_21

Here's a **GitHub README.md** file for your Spring Boot controller:  

```markdown
# Student Controller - Spring Boot API

This project is a simple **Spring Boot REST API** that provides student details such as **name, registration number, and age**.

## Endpoints

The API provides the following endpoints:

| Method | Endpoint      | Description                 |
|--------|-------------|-----------------------------|
| GET    | `/app/name` | Returns the student's name  |
| GET    | `/app/reg`  | Returns the registration number |
| GET    | `/app/age`  | Returns the student's age   |

## Project Structure

```
src/
│── main/
│   ├── java/lk/ac/vau/fas/IT/controller/student_controller.java
│   ├── resources/
│   └── application.properties
└── pom.xml
```

## Getting Started

1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/your-repo.git
   cd your-repo
   ```

2. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

3. Access the API endpoints:
   - `http://localhost:8080/app/name`
   - `http://localhost:8080/app/reg`
   - `http://localhost:8080/app/age`

## Technologies Used

- Java 17+
- Spring Boot
- Maven

## License

This project is licensed under the **MIT License**.
```

Replace `your-username/your-repo` with your actual GitHub repository details. 🚀
