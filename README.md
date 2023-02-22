TODO List using Java + Springboot

1. open https://start.spring.io/ for creating a project and adding dependencies.
2. Select options as follows:
   a) Project => maven
   b) Language => Java
   c) Springboot => 3.0.2
   d) Project Metadata => com.practice
   e) Artifact => springboot-todo-app (name of project)
   f) Name => springboot-todo-app
   g) Description => Demo project for Spring Boot
   h) Package name => com.practice.springboot-todo-app
   i) Packaging => Jar
   j) Java => 19
3. Under Dependencies select following:
   a) Spring Web (WEB)
   b) Lombok (DEVELOPER TOOLS)
   c) H2 Database (SQL)
   d) Spring Data JPA (SQL)
   e) Validation (I/O)
   f) Spring Boot DevTools (DEVELOPER TOOLS)
4. Click on Generate Project, this downloads a zip file containing maven project with following structure:
   mvnw
   mvnw.cmd
   pom.xml
   src
   ├── main
   │ ├── java
   │ │ └── org
   │ │ └── acme
   │ │ └── SpringbootTodoAppApplication.java
   │ └── resources
   │ ├── application.properties
   │ ├── static
   │ └── templates
   └── test
   └── java
   └── org
   └── acme
   └── SpringbootTodoAppApplicationTests.java
