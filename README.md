# 📓 Journal App

A RESTful Journal application built with **Java** and **Spring Boot** that lets you create, view, update, and delete journal entries through a clean REST API.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Maven](https://img.shields.io/badge/Build-Maven-red)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

---

## ✨ Features

- Create a new journal entry (title, content, date)
- Get all journal entries
- Get a journal entry by ID
- Update an existing entry
- Delete an entry
- Proper HTTP status codes (`201`, `200`, `404`, `204`)
- Layered architecture (Controller → Service → Repository)

## 🛠️ Tech Stack

| Layer        | Technology                 |
|--------------|----------------------------|
| Language     | Java 17                    |
| Framework    | Spring Boot 3, Spring Web  |
| Persistence  | Spring Data JPA, Hibernate |
| Database     | MySQL 8                    |
| Build Tool   | Maven                      |
| Testing      | JUnit 5, Postman           |

## 📁 Project Structure

```
journal-app/
├── src/
│   ├── main/
│   │   ├── java/com/paresh/journalapp/
│   │   │   ├── controller/
│   │   │   │   └── JournalEntryController.java
│   │   │   ├── service/
│   │   │   │   └── JournalEntryService.java
│   │   │   ├── repository/
│   │   │   │   └── JournalEntryRepository.java
│   │   │   ├── entity/
│   │   │   │   └── JournalEntry.java
│   │   │   └── JournalAppApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- JDK 17 or higher
- Maven 3.8+
- MySQL 8+
- Git

### 1. Clone the repository

```bash
git clone https://github.com/PareshMali2000/journal-app.git
cd journal-app
```

### 2. Create the database

```sql
CREATE DATABASE journal_app;
```

### 3. Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/journal_app
spring.datasource.username=root
spring.datasource.password=YOUR_DB_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

### 4. Build and run

```bash
mvn clean install
mvn spring-boot:run
```

The app starts at **http://localhost:8080**.

## 📡 API Endpoints

Base URL: `/journal`

| Method | Endpoint          | Description              |
|--------|-------------------|--------------------------|
| POST   | `/journal`        | Create a journal entry   |
| GET    | `/journal`        | Get all journal entries  |
| GET    | `/journal/{id}`   | Get an entry by ID       |
| PUT    | `/journal/{id}`   | Update an entry          |
| DELETE | `/journal/{id}`   | Delete an entry          |

### Sample Request

`POST /journal`

```json
{
  "title": "First day learning Spring Boot",
  "content": "Built my first REST controller today."
}
```

### Sample Response

```json
{
  "id": 1,
  "title": "First day learning Spring Boot",
  "content": "Built my first REST controller today.",
  "date": "2026-10-19T21:10:00"
}
```

### Error Response

```json
{
  "status": 404,
  "message": "Journal entry not found with id: 10"
}
```

## 🧪 Testing the API

Use **Postman** or `curl`:

```bash
curl -X GET http://localhost:8080/journal
```

Run unit tests:

```bash
mvn test
```

## 🧠 Concepts Used

- Spring Boot auto-configuration and starters
- `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
- `@PathVariable` and `@RequestBody`
- Dependency Injection with `@Autowired`
- Spring Data JPA repositories
- `ResponseEntity` for HTTP status handling

## 🗺️ Future Improvements

- [ ] User registration and login with Spring Security
- [ ] JWT authentication
- [ ] Link journal entries to users
- [ ] Pagination and search by date or keyword
- [ ] Global exception handling with `@ControllerAdvice`
- [ ] Docker support and deployment on AWS

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m "Add your feature"`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a Pull Request

## 📄 License

This project is licensed under the [MIT License](LICENSE).

## 👤 Author

**Paresh Mali**

- GitHub: [@PareshMali2000](https://github.com/PareshMali2000)
- LinkedIn: [paresh-mali-57811](https://linkedin.com/in/paresh-mali-57811)
