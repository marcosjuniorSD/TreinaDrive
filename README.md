# Treina Drive

**Treina Drive** is a platform that connects people who want to learn how to drive with car owners who are willing to provide practical lessons. The goal is to make driving practice more accessible and affordable, especially for those without access to traditional driving schools.

---

## 🚀 MVP Scope

This MVP includes the essential features to validate the core concept:

- 🔒 **Authentication with Keycloak**
  Secure login and token-based authentication with role management.
  
- 🧑‍🎓👨‍🏫 **Role-based access to Student and Instructor (JWT with user roles)**
  Different access levels for learners and instructors.
  
- 🙋 **Basic user registration and login**
  View and update personal user information.

- 🚘 **Vehicle registration (Instructor side)**
  Instructors can register their vehicles to offer lessons.

- 🗓️ **Simple lesson scheduling system (prototype)**  
  Students can request and manage lesson sessions.
  
- 💠 **Microservices architecture with RESTful communication**  
  Each feature is separated into independent services.

- 🐳 **Dockerized environment for local development**  
  Services and databases run locally using Docker and Docker Compose.

---

## 🧱 Tech Stack

| Layer              | Technology                    |
|--------------------|-------------------------------|
| Backend            | Spring Boot (Java 17)         |
| Authentication     | Keycloak                      |
| Database           | PostgreSQL                    |
| API Security       | OAuth2 + JWT                  |
| Containers         | Docker & Docker Compose       |
| Architecture       | Microservices (RESTful APIs)  |

---

## 📁 Project Structure

```bash
Treina Drive/
├── auth-service/           # Authentication logic (JWT + Keycloak)
├── user-service/           # User profile and role management
├── vehicle-service/        # Instructors register their vehicles
├── schedule-service/       # Handles lesson requests and scheduling
├── gateway/                # API Gateway (optional)
├── docker-compose.yml      # Runs everything with one command
└── README.md
