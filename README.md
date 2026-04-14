# 🛒 SmartCart – Product Management System

## 📌 Project Overview

SmartCart is a backend application developed using **Spring Boot** that provides RESTful APIs to manage products.
It allows users to perform **CRUD operations** such as adding, viewing, updating, and deleting products.

---

## 🚀 Features

✨ Add new products
✨ View all products
✨ Get product by ID
✨ Update product details
✨ Delete products
✨ REST API architecture

---

## 🏗️ Tech Stack

* ☕ Java
* 🌱 Spring Boot
* 📦 Spring Data JPA
* 🗄️ MySQL
* 🔧 Maven
* 🔗 REST APIs

---

## 📁 Project Structure

```
com.yazhini.smartcart
│
├── controller        # Handles API requests
├── service           # Business logic
├── repository        # Database interaction
├── entity            # Database model
└── SmartcartApplication.java
```

---

## 🔗 API Endpoints

| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| GET    | /products      | Get all products  |
| GET    | /products/{id} | Get product by ID |
| POST   | /products      | Add new product   |
| PUT    | /products/{id} | Update product    |
| DELETE | /products/{id} | Delete product    |

---

## ⚙️ Configuration

Update your database details in `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/smartcart
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
server.port=8081
```

---

## ▶️ How to Run the Project

1. Clone the repository
2. Navigate to project folder
3. Run the application:

```
./mvnw spring-boot:run
```

4. Open in browser:

```
http://localhost:8081/products
```

---

## 🧪 Testing

Use **Postman** to test APIs:

* Send JSON data for POST/PUT
* Example:

```
{
  "name": "Laptop",
  "price": 50000,
  "quantity": 2
}
```

---

## 💡 Key Concepts Used

* REST API Design
* Layered Architecture
* Dependency Injection
* JPA & Hibernate
* MVC Pattern

---

## 🚧 Challenges Faced

* Port conflict issue (resolved by changing server port)
* Database connection setup
* API testing and debugging

---

## 🌟 Future Enhancements

* Add authentication (Spring Security)
* Add frontend (React.js)
* Implement pagination & filtering

---

## 👩‍💻 Author

**Yazhini**
B.Tech IT Student | Aspiring Full Stack Developer

---

## ⭐ Show your support

If you like this project, give it a ⭐ on GitHub!
