# Introduction

This is the repository that will contain the Automated E2E Tests for the NHSBSA Project

The tests are written in Java with the Cucumber framework, Maven build tool, and Selenium library, following the BDD approach.

# Running the Tests
- Follow these steps to execute the automation test suite from the command line:

# Clone this repository to your local machine:
- git clone https://github.com/Harsh9747/Harsh-NHSBSA.git

# Navigate to the project directory:
- cd Harsh-NHSBSA

**(Update the web browser in src/test/resources/configuration/defaults.properties to run with chrome or firefox browser,
default-chrome browser)**

# Execute the following Maven command to run the tests:
**To run all tests:**
- mvn clean test

**To run tag specific tests:**
- mvn clean test -Dcucumber.options="--tags @tagName"

# Test Reports
**After the test run is complete 3 reports are currently generated:**
- A HTML Cucumber report
- A PDF Cucumber report
- A HTML Index report

# Test Suite Structure
1. 'src/test/resources/features': Contains the feature files written in Gherkin syntax.
2. 'src/test/java/com/localhost/steps': Contains the step definitions written in Java to map the Gherkin steps to executable code.
3. 'src/test/java/com/localhost/runner': Contains the runner class (TestRunner.java) to execute the Cucumber tests.

# Contributors
  **Harsh Patel**

- Feel free to contribute to this project by opening issues or pull requests.
- Feel free to customize the README file according to your project structure and requirements.
