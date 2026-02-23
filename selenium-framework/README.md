# Selenium Automation Framework (POM, TestNG, CI Ready)

## Overview

This is a scalable Selenium automation framework designed using industry best practices.

Application Under Test:
https://automationexercise.com/

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- GitHub Actions (CI)

## Features

- Page Object Model (POM)
- Parallel execution using TestNG
- Headless execution support
- Multiple resolution testing
- CI/CD integration ready
- Thread-safe DriverFactory

## Framework Structure

src/main/java
- base
- pages
- utils

src/test/java
- tests

## Execution

Run locally:

mvn clean test

Run headless:

mvn clean test -Dheadless=true

## CI/CD

Integrated with GitHub Actions

Tests run automatically on pull request.
