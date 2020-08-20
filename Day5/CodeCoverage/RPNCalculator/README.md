# Lab - Code Coverage using Jacoco plugin

In this lab exercise, you will learn about jacoco code-coverage plugin.

You may review the pom.xml file in this project.  Under the plugin section, 
the jacoco plugin is configured for code-coverage.

From the terminal, navigate to

cd devops-aug-2020/Day5/CodeCoverage/RPNCalculator

You may create a jar package as shown below
mvn clean package

At this point, jacoco plugin would have prepared the code coverage report for your project.

You may open the report from your web browser from the below path

devops-aug-2020/Day5/CodeCoverage/RPNCalculator/target/site/index.html

You may use this source code and create a Jenkins job to check the test code-coverage as part of yourproject build.
