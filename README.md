# Project_40236456_40220732_APP
Project for SOEN-6441 (Section-U Fall 2022)(Project_40236456_40220732_APP)
# Database Viewer Application

This Java-based command-line application allows users to retrieve and display data from a relational database. It is designed to work with MySQL databases and was developed as a part of a project.

## Overview

The application's primary functionality includes:

- Accepting user input through a Command Line Interface (CLI).
- Fetching data from a MySQL relational database.
- Mapping retrieved data to domain objects.
- Displaying the data on the screen for user access.

## Database Design

The relational database used for this project was created using MySQL, an open-source database management system. The data within the database was sourced from an Oracle API in JSON format, containing information about various countries and cities, including attributes like population, language, and area. The database consists of three tables that organize this data efficiently.

## Key Features

- **Parameterized Queries:** The application utilizes parameterized queries to efficiently retrieve data from the database, ensuring security and performance.

- **Testing:** JUnit 4 is used for testing to ensure the application's functionality and reliability.

- **Logging:** AspectJ is employed for logging, providing insights into the application's execution and assisting in debugging.

- **Data Subset:** To handle large datasets, the application focuses on processing a specific portion of the dataset rather than the entire dataset, optimizing resource usage.

## Note

Due to the extensive size of the original dataset, only a small subset of data was utilized for this application.

