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

| Feature                        | Description                                                                                            | Link to the source code                                                                                                                                                           |
|--------------------------------| ------------------------------------------------------------------------------------------------------ |-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Questionnaire                  | The core of the supplement recommendation process. Users fill out a questionnaire that assesses various aspects of their lifestyle, diet, and health goals, which is then used to generate personalized supplement recommendations. | [registration](https://github.com/masc-crew/supp-buddy-2.0/blob/user_profile/supp-buddy_2.0/src/main/java/io/suppbuddy/suppbuddy_20/service/UserServiceImpl.java)                 |
| User Login | Registered users can easily log into their accounts, and in case they forget their password, they can initiate a secure password recovery process. | [login](https://github.com/masc-crew/supp-buddy-2.0/blob/user_profile/supp-buddy_2.0/src/main/java/io/suppbuddy/suppbuddy_20/communication/controller/UserController.java)        |
| Logout Feature                 | Users can log out from their accounts to safeguard their personal information and ensure privacy.       | [logout](https://github.com/masc-crew/supp-buddy-2.0/blob/user_profile/supp-buddy_2.0/src/main/java/io/suppbuddy/suppbuddy_20/config/SecurityConfig.java)                         |
| Product Recommendation         | The application uses the provided health and lifestyle information to recommend nutritional supplements tailored to the user's specific needs. The recommendations are generated based on the responses from the questionnaire. | [product recommendation](https://github.com/masc-crew/supp-buddy-2.0/blob/dev/supp-buddy_2.0/src/main/java/io/suppbuddy/suppbuddy_20/logic/ProductRecommenderService.java)        |
| User Registration and Account Creation| Individuals can sign up and create their own personalized accounts within the application, enabling a tailored experience. | [registration](https://github.com/masc-crew/supp-buddy-2.0/blob/user_profile/supp-buddy_2.0/src/main/java/io/suppbuddy/suppbuddy_20/communication/controller/UserController.java) |
| Health Data                    | Users can enter, update, and manage their health-related data, such as medical conditions, dietary restrictions, and fitness goals, which helps refine supplement suggestions.          | [health data](https://github.com/masc-crew/supp-buddy-2.0/blob/dev/supp-buddy_2.0/src/main/java/io/suppbuddy/suppbuddy_20/service/UserPersonaCalculation.java)                                                                                                                                                                   |

The core of the supplement recommendation process. Users fill out a questionnaire that assesses various aspects of their lifestyle, diet, and health goals, which is then used to generate personalized supplement recommendations.
Individuals can sign up and create their own personalized accounts within the application, enabling a tailored experience.
## Database Structure

TODO: Put the diagram here.