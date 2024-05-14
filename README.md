# Introduction

This is the repository that will contain the Automated E2E Tests for the NHSBSA Project

The tests are written in Java, using Cucumber framework, Maven build and Selenium library with BDD Approach

# Running the Tests
- Follow these steps to execute the automation test suite from the command line:

# Clone this repository to your local machine:
- git clone https://github.com/Harsh9747/Harsh-NHSBSA.git

# Navigate to the project directory:
- cd Harsh-NHSBSA

**Update the web browser in src/test/resources/configuration/defaults.properties to run with chrome or firefox browser**

# Execute the following Maven command to run the tests:
- Mvn clean test

**To run tag specific tests:**  

- This command will compile the code, execute the Cucumber tests, and display the test results in the terminal.

# Test Suite Structure
1. 'src/test/resources/features': Contains the feature files written in Gherkin syntax.
2. 'src/test/java/com/localhost/steps': Contains the step definitions written in Java to map the Gherkin steps to executable code.
3. 'src/test/java/com/localhost/runner': Contains the runner class (TestRunner.java) to execute the Cucumber tests.

# Contributors
- Harsh Patel

- Feel free to contribute to this project by opening issues or pull requests.
- Feel free to customize the README file according to your project structure and requirements.
