# REST-API-CLIENT
Company: CODTECH IT SOLUTIONS
Name: Shivani Pawar
Intern ID: CTIS3902
Domain: Java Programming
Duration: 4 Weeks
Mentor: Neela Santosh

##Project Description

The REST API Client – Weather Fetcher is a Java-based console application developed as part of my internship at CODTECH IT SOLUTIONS. This project focuses on consuming external web services using Java’s built-in HTTP client and processing real-time JSON responses received from a public weather API.

The main objective of this task was to understand how Java applications interact with RESTful services over the internet. By implementing HTTP GET requests, handling API endpoints, and parsing the returned JSON data, this project demonstrates practical integration of Java programs with real-world web APIs. It strengthens knowledge of networking concepts and backend data communication while avoiding third-party libraries to maintain simplicity and clarity.

 What the Program Does

This application fetches live weather information for a specific geographic location (Pune) using latitude and longitude coordinates.

The program performs the following operations:

1️ Constructs API URL

Dynamically builds a request URL containing latitude and longitude.

Requests only the current weather details.

2️ Sends HTTP Request

Uses HttpClient, HttpRequest, and HttpResponse classes from java.net.http.

Sends a GET request to the weather API endpoint.

3️ Receives and Processes JSON Response

Captures the response body as a string.

Extracts key data such as:

Temperature

Wind speed

4️ Displays Weather Report

Prints a formatted weather summary on the console including:

Location name

Temperature in °C

Wind speed in km/h

5️ Handles Errors Gracefully

Wraps the entire execution inside a try-catch block.

Displays a friendly message if API access fails or network issues occur.

##Output:

<img width="1260" height="452" alt="image" src="https://github.com/user-attachments/assets/fd99fb42-2b20-4546-bce5-969fee42ce93" />
