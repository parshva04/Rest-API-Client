# Rest-API-Client
*COMPANY* : CODTECH IT SOLUTIONS
*NAME* : PARSHVA SHAH
*INTERN ID* : CTIS4370
*DOMAIN* : JAVA
*DURATION* : 12 WEEKS
*MENTOR* : NEELA SANTOSH


## **Project Overview**
The REST API Client is a Java-based application designed to consume public REST APIs, fetch real-time data, and present it in a structured format. This project was developed as part of the **CODTECH Internship Task 2**, requiring the implementation of an **HTTP-based API client** capable of handling **JSON responses** efficiently.

The primary objective of this project is to retrieve and parse data from external web services, such as **weather updates**, **user details**, or other publicly available datasets. The application was built and executed using **Notepad++**, ensuring a lightweight yet efficient workflow with proper error handling and structured output formatting.

---

## **Technology Stack**
- **Programming Language:** Java  
- **HTTP Handling:** `HttpURLConnection`, `OkHttp` (alternative)  
- **JSON Parsing:** `org.json` library / `Gson`  
- **Development Environment:** Notepad++  
- **Data Processing:** Java Collections, Streams API  
- **API Used:** Public REST APIs (e.g., OpenWeatherMap, JSONPlaceholder)  

---

## **Project Workflow**
### **Step 1: Setting Up the API Client**
- The program initializes an HTTP connection to fetch data from a public REST API.
- The API URL is specified, and a GET request is sent using `HttpURLConnection`.
- The response is read using an input stream, and the JSON data is stored as a string.

**Execution Output (API Call Success)**  
API request sent successfully!  
Response received from API!  

### **Step 2: Parsing JSON Response**
- The response data is processed using the `org.json` library.
- JSON keys are extracted to retrieve relevant information (e.g., title, temperature, user details).
- The parsed data is then formatted for better readability.

### **Step 3: Displaying Data in a Structured Format**
- The extracted information is displayed in the console in a structured manner.
- Proper formatting ensures that users can easily interpret the output.
- If an error occurs, an exception handling mechanism prints an error message.

---

### **How to Run the Project**

Navigate to the project folder:  
```bash
cd CODTECH-REST-API-Client
```
Compile the Java program:  
```bash
javac -cp .;json-20210307.jar RestApiClient.java
```
Run the Java program:  
```bash
java -cp .;json-20210307.jar RestApiClient
```

**Execution Output**  
<img width="327" height="31" alt="Image" src="https://github.com/user-attachments/assets/af6b2b23-386d-4128-b27b-de9a4a51e049" />

---

## **Key Features Implemented**
**REST API Integration** → Fetches real-time data from public REST APIs using HTTP requests.  
**JSON Parsing** → Extracts and processes relevant information from JSON responses.  
**Efficient Data Handling** → Uses Java Collections and Streams API for structured data processing.  
**Error Handling & Robustness** → Implements exception handling to manage API failures and invalid responses.  
**Scalability** → Designed to handle multiple API requests efficiently for future extensions.  

---

## **Challenges Faced & Solutions**
### **1. Handling API Connectivity Issues**
**Issue:** API requests sometimes failed due to network issues or server downtime.  
**Solution:** Implemented retry mechanisms and proper exception handling to ensure resilience.  

### **2. Parsing Complex JSON Responses**
**Issue:** Some APIs returned deeply nested JSON structures, making data extraction challenging.  
**Solution:** Used the `org.json` library to navigate and extract required fields efficiently.  

### **3. Managing Large API Responses**
**Issue:** Fetching large datasets led to slow performance and high memory usage.  
**Solution:** Implemented pagination and limited API calls to fetch only necessary data.  

### **4. Ensuring Data Formatting & Readability**
**Issue:** Raw API responses were difficult to interpret in the console.  
**Solution:** Used structured output formatting and proper indentation for better readability.  

---

## **Enhancements for Future Development**
**Support for Multiple API Endpoints** – Extend functionality to handle different APIs dynamically.  
**Graphical User Interface (GUI)** – Develop a user-friendly GUI for better interaction and visualization.  
**Database Integration** – Store API responses in a database for historical analysis and offline access.  
**Caching Mechanism** – Implement caching to reduce redundant API calls and improve response time.  
**Advanced Error Handling** – Enhance logging and debugging capabilities for better fault tolerance.  

---

## **Conclusion**
The **REST API Client** successfully met the **CODTECH Task 2** requirements by implementing a **Java-based API consumer** that retrieves and processes data from **public REST APIs**. The development in **Notepad++** ensured a lightweight yet efficient workflow, allowing seamless API integration and JSON data handling.

This project reinforced key concepts in **HTTP communication, JSON parsing, and data processing**, demonstrating the importance of **real-time data retrieval** in modern applications. The system effectively **fetches, processes, and displays structured API data**, making it a **scalable and adaptable solution** for various real-world use cases.
