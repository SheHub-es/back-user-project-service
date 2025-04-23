# SheHub — User & Project Service

**Part of the SheHub platform — empowering women through tech, community, and growth.**
SheHub is a digital platform designed to connect, inspire, and support women in their personal and professional journeys.

This repository contains the User & Project macroservice, responsible for managing user profiles, projects, and their associations within the SheHub ecosystem.

🌐 [Visit our teaser page](http://www.shehub.es)

---

## 🧩 Service Overview
This macroservice is a core component of the SheHub backend. It handles logic and data for:

User profile creation and updates

Project creation and management (individual and collaborative)

Associations between users and projects

Integration with the auth-service via UUID-based user identities

This service is built with Java, Spring Boot, and PostgreSQL, and is designed for modular, scalable deployment.

⚠️ Status: Currently in early development.

---

## ⚙️ Tech Stack

- **Java 21**
- **Spring Boot 3**
- **Spring Security (JWT)**
- **Spring Data JPA**
- **PostgreSQL**
- **Dotenv for environment config**
- **Lombok for boilerplate reduction**
- **REST API (will support event-based messaging in future)**

---

## 🔗 Related Services

This macroservice is part of the broader SheHub platform and works alongside:
- auth-service – manages authentication and creates shared user UUIDs

Other future services may include:
- Notification service
- Team collaboration service
- Messaging service

## 🧱 Architectural Context
SheHub is built using a macroservices approach — splitting functionality across a few well-scoped services. This service manages both user and project domains, reducing the need for complex inter-service communication in early stages while allowing for future modularization.

Communication between services (e.g., with auth-service) happens via REST or planned message queues like Kafka or RabbitMQ.

---

## 🧑‍💻 Contributing
This project is currently under internal development. External contributions may be welcome in the future — stay tuned!

---

## 📄 License
TBD — the license will be defined as the project stabilizes.

---

## 💌 Contact
If you'd like to get in touch or follow along with the progress:

🌍 Website: www.shehub.es

📧 Email: [info@shehub.es]

🐙 GitHub: [(https://github.com/SheHub-es)] 


