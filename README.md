# Supp-Buddy-2.0

SuppBuddy is a tool for recommending nutritional supplements. Users fill out a questionnaire in which various aspects of their lifestyle and diet are queried. Based on the answers, the application recommends suitable products from a database.

---
| **Contributors**                                             |
|--------------------------------------------------------------|
| **Ali Khoshen** [GitHub](https://github.com/alikhoshen)      |
| **Sarah Fuchs** [GitHub](https://github.com/sarah-fuchs)     |
| **Carlos R. Vasquez** [GitHub](https://github.com/crv-9)     |
| **Maximilian Morawitz** [GitHub](https://github.com/mamoraw) |
---
## Technologies and Frameworks

- Java 17
- Spring Boot
- JPA (Hibernate)
- Maven
- Spring Security
- Spring Web
- Integration of a SQL database
- Unit and Integration tests

## Features

| Feature                                     | Description                                                                                            | Link to the source code |
|---------------------------------------------| ------------------------------------------------------------------------------------------------------ |-------------|
| User Registration and Account Creation      | Individuals can sign up and create their own personalized accounts within the application, enabling a tailored experience. | [registraiton]() |
| User Login and Password Recovery            | Registered users can easily log into their accounts, and in case they forget their password, they can initiate a secure password recovery process. | [login]() & [password]() |
| Logout Feature                              | Users can log out from their accounts to safeguard their personal information and ensure privacy.       | [logout]()  |
| Profile Management                          | Both volunteers and help seekers have the ability to manage their profiles. Volunteers can showcase their skills and expertise, while help seekers can update their profiles to accurately communicate their needs. | [helpseeker-profile]() & [volunteeer-profile]() |
| Activity Creation and Publication           | Help seekers can create activities, describing the assistance they need. Once published, activities become visible to volunteers, who can browse and apply for them. | [activity]() |
| Volunteer Application Process               | Volunteers can review published activities, submit applications, and track their application status. | [application]() |
| Help seekers Assess and Manage Applications | Help seekers can assess and manage volunteer applications to choose the most suitable candidate.          | [manage application]() |


## Database Structure

TODO: Put the diagram here.