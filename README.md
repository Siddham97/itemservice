# ItemService

A backend microservice built with Spring Boot to power item management and search functionality.  
This service provides REST endpoints for creating, retrieving, updating, and deleting items — ideal for integrating into frontend clients like search applications, catalog UIs, or e-commerce backends.

---

## 🚀 Features

- CRUD (Create, Read, Update, Delete) operations on items  
- Search eligible fields (name, description, tags, etc.)  
- Pagination support for large result sets  
- Clean separation of controller, service, repository layers  
- Built with Spring Boot, Spring Data JPA, and H2/MySQL (configurable)  
- Easy to extend with filters, sorts or additional endpoints  

---

## 🛠️ Getting Started

### Prerequisites  
- Java 17 (or whichever version you use)  
- Maven (or Gradle)  
- Git  

### Clone the repository  
```bash
git clone https://github.com/Siddham97/itemservice.git
cd itemservice
Install dependencies & build
bash
Copy code
mvn clean install
# or for Gradle: ./gradlew build
Run the service
bash
Copy code
mvn spring-boot:run
# or
java -jar target/itemservice-0.0.1-SNAPSHOT.jar
Once running, the API is typically available at http://localhost:8080/.

⚙️ Configuration
Edit src/main/resources/application.properties (or application.yml) to configure your database and other properties. For example:

ini
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/itemdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

# H2 (for development/test)
spring.datasource.url=jdbc:h2:mem:itemdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
You can also override with environment variables or command-line parameters:

ini
Copy code
-Dspring.profiles.active=prod
📁 Project Structure (example)
css
Copy code
itemservice/
├── src/
│   ├── main/
│   │   ├── java/com/example/itemservice/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   └── model/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
├── pom.xml
└── README.md
🧪 Usage Examples
Create an item
bash
Copy code
POST /api/items
Content-Type: application/json

{
  "name": "Item Name",
  "description": "Item description",
  "price": 29.99,
  "tags": ["tag1", "tag2"]
}
Get items (with pagination)
arduino
Copy code
GET /api/items?page=0&size=20
Search items
sql
Copy code
GET /api/items/search?query=something&page=0&size=10
Update an item
bash
Copy code
PUT /api/items/{itemId}
Content-Type: application/json

{
  "name": "Updated Name",
  "description": "Updated description",
  "price": 24.99,
  "tags": ["tag1", "tag3"]
}
Delete an item
bash
Copy code
DELETE /api/items/{itemId}
