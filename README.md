# Spring_Boot_Projects
Job Application Project  :  Spring Boot REST API to Microservices



:::::::::::::::::::::::::::::::::::::::::          Part 1          :::::::::::::::::::::::::::::::::::::::::

# Java-Spring-Boot-Project
Java Spring Boot Project : REST APIs : GET / PUSH / DELETE / PUT


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


📌 Project Overview


Job Application Spring Boot Project

This is a simple Spring Boot project designed to manage job applications. It provides a RESTful API to create, read, update, and delete job listings. The data is stored in-memory, simulating a job application management system.

Jobs (posted by companies)

Companies (with associated job listings)

Reviews (submitted by users about companies)





🛠️ Technology Stack
Backend Framework: Spring Boot

IDE: IntelliJ IDEA

API Testing: Postman

Build Tool: Maven

Java Version: 17

Dependencies:

Spring Web (for REST APIs, MVC, and embedded Tomcat)





🧱 Application Architecture
The project follows a 3-layer architecture:

Controller Layer – Handles HTTP requests.

Service Layer – Contains business logic.

Repository Layer – Communicates with the database.





📤 Flow of the Request
User sends a request (via browser or Postman).

Controller receives the request and passes it to the Service layer.

Service performs business logic and calls the Repository.

Repository interacts with the Database.

Data flows back through Repository → Service → Controller → User.







✅ Phase 1: Initial Setup
Visit start.spring.io

Configure:

Project: Maven

Group: com.gautami

Artifact: Job-Application-SpringBootProject

Name: Job-Application-SpringBootProject

Packaging: JAR

Java Version: 17

Dependency: Spring Web

Generate and extract the zip file.

Open it in IntelliJ IDEA.




///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




Overview


This project allows you to:

Create new job listings

View all job listings

View a specific job by ID

Update a job by ID

Delete a job by ID



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


API Endpoints


1. Get All Jobs
URL: GET /jobs

Description: Fetches a list of all jobs.

Response Example:


      [
        {
          "id": 1,
          "title": "Software Engineer",
          "description": "Develop software applications",
          "minSalary": "50000",
          "maxSalary": "100000",
          "location": "New York"
        }
      ]


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


2. Create a New Job

   
URL: POST /jobs

Description: Creates a new job entry.

Request Body Example:


    {
        "title": "Backend Developer",
        "description": "Develop backend services",
        "minSalary": "70000",
        "maxSalary": "120000",
        "location": "San Francisco"
    }



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


3. Get a Job by ID

   
URL: GET /jobs/{id}

Description: Fetches a job by its ID.

Response Example:


    {
        "id": 1,
        "title": "Software Engineer",
        "description": "Develop software applications",
        "minSalary": "50000",
        "maxSalary": "100000",
        "location": "New York"
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


4. Delete a Job

   
URL: DELETE /jobs/{id}

Description: Deletes a job by its ID.

Response Example:

    "Job deleted!!"

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


5. Update a Job

   
URL: PUT /jobs/{id}

Description: Updates a job by its ID.

Request Body Example:


    {
        "title": "Senior Software Engineer",
        "description": "Lead the software engineering team",
        "minSalary": "95000",
        "maxSalary": "150000",
        "location": "Seattle"
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



How to Test Using Postman



Start the application by running mvn spring-boot:run or ./gradlew bootRun.

Open Postman and create requests for the following API endpoints.

1. GET All Jobs

   
Method: GET

URL: http://localhost:8080/jobs

Description: Fetches all job listings from the application.

Steps:

Open Postman.

Set the request method to GET.

Enter http://localhost:8080/jobs in the URL field.

Click Send.

Expected Response:


    {
        "id": 1,
        "title": "Software Engineer",
        "description": "Develop software applications",
        "minSalary": "50000",
        "maxSalary": "100000",
        "location": "New York"
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


2. POST Create a Job

   
Method: POST

URL: http://localhost:8080/jobs

Description: Creates a new job listing.

Steps:

Open Postman.

Set the request method to POST.

Enter http://localhost:8080/jobs in the URL field.

Select Body and choose raw format.

Choose JSON from the dropdown next to raw.

Enter the following JSON in the body:

    {
        "title": "Backend Developer",
        "description": "Develop backend services",
        "minSalary": "70000",
        "maxSalary": "120000",
        "location": "San Francisco"
    }

  Click Send.

  Expected Response:

      "Job added Successfully!"


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

3. GET Job by ID

   
Method: GET

URL: http://localhost:8080/jobs/1

Description: Fetches a specific job by ID.

Steps:

Open Postman.

Set the request method to GET.

Enter http://localhost:8080/jobs/1 in the URL field (replace 1 with the actual job ID).

Click Send.

Expected Response:

    {
        "id": 1,
        "title": "Software Engineer",
        "description": "Develop software applications",
        "minSalary": "50000",
        "maxSalary": "100000",
        "location": "New York"
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


4. DELETE Job by ID


Method: DELETE

URL: http://localhost:8080/jobs/1

Description: Deletes a specific job by ID.

Steps:

Open Postman.

Set the request method to DELETE.

Enter http://localhost:8080/jobs/1 in the URL field (replace 1 with the actual job ID).

Click Send.

Expected Response:

    "Job deleted!!"

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


5. PUT Update Job by ID

   
Method: PUT

URL: http://localhost:8080/jobs/1

Description: Updates a specific job by ID.

Steps:

Open Postman.

Set the request method to PUT.

Enter http://localhost:8080/jobs/1 in the URL field (replace 1 with the actual job ID).

Select Body and choose raw format.

Choose JSON from the dropdown next to raw.

Enter the following JSON in the body:


    {
      "title": "Senior Software Engineer",
      "description": "Lead the software engineering team",
      "minSalary": "95000",
      "maxSalary": "150000",
      "location": "Seattle"
    }

Click Send.

Expected Response:

    "Job updated!!"


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


Code Explanation
Job.java
The Job class represents the job model with the following properties:

id: Unique identifier for the job

title: The job title

description: The job description

minSalary: Minimum salary for the job

maxSalary: Maximum salary for the job

location: Job location

JobService.java and JobServiceImpl.java
JobService.java: Interface defining the CRUD operations (create, read, update, delete).

JobServiceImpl.java: Implementation of the JobService interface using an in-memory list to store job data.

JobController.java
This is the REST controller that handles HTTP requests. It provides the routes for creating, updating, retrieving, and deleting jobs.

JobApplicationSpringBootProjectApplication.java
The main class that runs the Spring Boot application and starts the embedded web server.




:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::



