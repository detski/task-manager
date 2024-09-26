# TaskManager

TaskManager is a Java-based Spring Boot application that allows users to manage tasks. This project uses Spring Boot with a MySQL database and includes JPA for data persistence, Thymeleaf for templating, and Maven for project management.

## Features ##

  * Spring Boot for application setup and management
  * Spring Data JPA for database interaction
  * Thymeleaf for rendering the user interface
  * MySQL database integration
  * Development tools provided by Spring Boot DevTools


### Prerequisites ###

Before you can run this application, ensure you have the following installed:
  * Java 17
  * Maven 4
  * MySQL database

## Getting Started ##

### Setup ###

**1. Clone the repository**
```
git clone https://github.com/your-username/TaskManager.git
cd TaskManager
```

**2. Configure MySQL Database**

Create a MySQL database and update your application’s database settings in the application.properties file. The settings should include the following:

```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

**3. Build and Run the Application**

You can build and run the application using Maven:
```
mvn clean install
mvn spring-boot:run
```

Alternatively, you can use the provided Maven wrapper:

```
./mvnw spring-boot:run
```

**4. Access the Application**

Once the application is running, you can access it in your web browser at:

http://localhost:8080


#### Dependencies ####

This project relies on the following key dependencies:
  * Spring Boot Starter Data JPA: Provides JPA implementation for database operations.
  * Spring Boot Starter Thymeleaf: Used for server-side rendering of HTML pages.
  * Spring Boot Starter Web: Handles web-related tasks like REST API creation.
  * Spring Boot DevTools: Adds tools for faster development, such as hot swapping.
  * MySQL Connector: Used to connect the Spring Boot application to the MySQL database.
