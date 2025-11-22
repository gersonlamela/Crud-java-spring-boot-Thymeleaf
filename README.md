# Crud Java Spring Boot Thymeleaf

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-blue)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-green)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A robust web application built with Java and Spring Boot, using Thymeleaf as the frontend templating engine. It provides
a full CRUD system for managing products, complete with image uploads, data validation, and a user-friendly interface,
making inventory management simple and efficient.

## ✨ Key Features

- **Product Management**: Create, read, update, and delete products
- **Image Uploads**: Attach images to products, with automatic storage in the server
- **Data Validation**: Ensure required fields are filled and data is consistent
- **Responsive Interface**: Clean and intuitive design using Thymeleaf templates
- **Sorting & Filtering**: View products in descending order by ID
- **Error Handling**: Handles validation errors and file upload issues gracefully

## 🛠️ Technologies

| Layer             | Technologies                                                |
|-------------------|-------------------------------------------------------------|
| **Backend**       | Spring Boot, Spring Data JPA, Spring MVC                    |
| **Frontend**      | Thymeleaf, HTML, CSS, Bootstrap                             |
| **Database**      | JPA/Hibernate, relational databases (H2, MySQL, PostgreSQL) |
| **File Handling** | MultipartFile for uploading and managing images             |
| **Validation**    | Jakarta Validation (Bean Validation)                        |

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL 5.7+ (or another relational database)

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/gersonlamela/Crud-java-spring-boot-Thymeleaf.git
cd Crud-java-spring-boot-Thymeleaf
```

### 2. Database Configuration

```bash
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/store
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# File Upload Configuration
spring.servlet.multipart.max-file-size=2MB
spring.servlet.multipart.max-request-size=2MB
```

### 3. Build and Run the Application

```bash
# Using Maven Wrapper
./mvnw spring-boot:run

# Or using installed Maven
mvn spring-boot:run
```

### 4. Access the Application

```bash
http://localhost:8080/products
```

### 📁 Project Structure

```bash
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── store/
│   │               ├── controllers/     # Handles HTTP requests and routes
│   │               ├── models/          # DTOs and Entity classes
│   │               ├── services/        # Repository interfaces and business logic
│   │               └── StoreApplication.java
│   └── resources/
│       ├── static/
│       │   └── public/
│       │       └── images/              # Folder for storing uploaded product images
│       ├── templates/
│       │   └── products/                # Thymeleaf templates for product views
│       └── application.properties
└── test/
    └── java/
        └── com/example/store/
```

### 🔧 Configuration

```bash
Database Options
The application supports multiple databases. Update your application.properties accordingly:

MySQL (Default):

spring.datasource.url=jdbc:mysql://localhost:3306/store
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

PostgreSQL:

spring.datasource.url=jdbc:postgresql://localhost:5432/store
spring.datasource.username=postgres
spring.datasource.password=
spring.datasource.driver-class-name=org.postgresql.Driver

H2 (In-memory for development):

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

File Upload Configuration

# Maximum file size for uploads
spring.servlet.multipart.max-file-size=2MB
spring.servlet.multipart.max-request-size=2MB

# Custom upload path (optional)
app.upload.dir=./uploads/

```

### 🐛 Troubleshooting

```bash
Common Issues
Database Connection Error

Verify database is running

Check credentials in application.properties

Ensure database store exists

Image Upload Fails

Check file size limits

Verify public/images/ directory exists and is writable

Ensure file is a valid image format

Build Failures

Ensure Java 17+ is installed

Run mvn clean install to refresh dependencies
```

👨‍💻 Author
Gerson Lamela

📄 License
This project is open-source and free to use under the MIT License.

