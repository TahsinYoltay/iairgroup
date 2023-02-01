

IAG Automation Framework Template 
==================================================================================

- Introduction:
This project is a Java-based Automation Framework using Maven as a build tool, JUnit as a testing framework, BDD as a software development approach, Selenium for web automation, Page Object Modeling for a better design and structure, and Google Guice for Dependency Injection.

Prerequisites
==================================================================================
To run this project, you will need to have the following software installed:

- Java (1.8 or higher)
- Maven
- Selenium WebDriver

Getting Started
===========================

1. Clone the project from the repository.

   
      git clone https://github.com/TahsinYoltay/iairgroup.git
2. Make sure you have JDK, Maven, and an IDE installed in your system.

3. Import the project into the IDE as a Maven project.
4. Install all the required dependencies mentioned in the pom.xml file.
5. Use the following command to build and run the project:

   
    mvn clean install

6. The test results will be displayed in the console and also saved in the 
   1. "target/cucumber-reports" directory as a JSON file.


Features:
===========================
1. BDD (Behavior-Driven Development): BDD is a software development approach that combines Test Driven Development (TDD) and Domain-Driven Design (DDD) to improve communication between developers, testers, and business stakeholders.
2. JUnit: JUnit is a popular testing framework for Java programming language. The tests are written in JUnit and executed using JUnit.
3. Selenium: Selenium is an open-source tool for automating web browsers. The framework uses Selenium for web automation.
4. Page Object Modeling: Page Object Modeling is a design pattern in which web pages are represented as classes. It helps to improve the maintainability and structure of the tests.
5. Google Guice: Google Guice is a Dependency Injection framework. It provides a way to manage dependencies between different classes and objects.

YAML File:
===========================
The framework uses a YAML file to store the configuration information. The file contains information like browser, URL, and other relevant details.

BDD @tag Example:
===========================
The BDD tests are written using Cucumber and are tagged using @tag. The tags are used to categorize the tests. For example, if you have a scenario related to Login functionality, you can tag it with @login. The test can then be executed using the tag, and only the tests with the @login tag will be executed.

      @tag
      Scenario: Login functionality
      Given the user navigates to the login page
      When the user enters the correct credentials
      Then the user should be able to log in successfully

In this example, the scenario is tagged with @login, and the test can be executed using the tag.


Project Structure
=================
The project is structured as follows:

        features
        |-- sample.feature
        src
        |-- test
        |   |-- java
        |   |   |-- helper
        |   |   |   |-- BaseDriver.java
        |   |   |   |-- ChromeDriverManager.java
        |   |   |   |-- DriverManager.java
        |   |   |   |-- DriverManagerFactory.java
        |   |   |   |-- DriverTypes.java
        |   |   |   |-- TestConfigurations.java
        |   |   |   |-- Props.java
        |   |   |   |-- Wait.java
        |   |   |-- steps
        |   |   |   |-- StepDefinitions.java
        |   |   |   |-- Hook.java
        |   |   |-- pages
        |   |   |   |-- BasePage.java
        |   |   |   |-- HomePage.java
        |   |   |-- testRunner
        |   |       |-- TestRunner.java
        |   |-- resources
        |   |   |-- testConfiguration.yaml
        |-- main
        |   |-- java
        |   |-- resources
        webdriver
        |-- chromedriver



License
=================
This project is licensed under the MIT License - see the LICENSE.md file for details.



