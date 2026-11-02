# Employee Management System - Backend API

A robust backend REST API built for the Employee Management System technical assignment, engineered using **Java (Spring Boot)**, **Spring Data JPA**, and **PostgreSQL**.

---

## 🚀 Features
* **Full CRUD Operations:** Create, Read, Update, and Delete employee records.
* **Database Integration:** Persistent data storage using PostgreSQL with unique constraints on `email` and `contact`.
* **Input Validation:** Built-in Jakarta validation (`@NotBlank`, `@Email`, `@NotNull`) ensuring data integrity.
* **Global Exception Handling:** Custom error response structures handling validation failures and database duplicate conflicts (`409 Conflict`) cleanly.

---

## 🛠️ Tech Stack
* **Language:** Java (JDK 17 / 21)
* **Framework:** Spring Boot 3.x
* **Database:** PostgreSQL
* **IDE:** Eclipse
* **API Testing Tool:** Postman

---

## ⚙️ Setup & Installation Instructions

### Prerequisites
* Java JDK 17 or higher installed.
* PostgreSQL installed and running locally.
* Eclipse IDE.

### 1. Clone the Repository