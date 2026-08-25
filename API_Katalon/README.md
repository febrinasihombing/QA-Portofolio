# Katalon API Automation Testing

## 📌 Overview

This project contains API automation testing using **Katalon Studio** to validate CRUD operations on a REST API built with **Supabase**.

The testing focuses on validating user data through HTTP methods such as **GET, POST, PUT, PATCH, and DELETE**.

## 🛠️ Tools & Technologies

* Katalon Studio
* REST API
* Supabase
* Groovy
* Git & GitHub

## 🧪 API Testing Scope

The following API operations are covered:

| Method | Function    | Description                |
| ------ | ----------- | -------------------------- |
| GET    | Get User    | Retrieve user data         |
| POST   | Create User | Add a new user             |
| PUT    | Update User | Update existing user data  |
| PATCH  | Update User | Partially update user data |
| DELETE | Delete User | Delete an existing user    |

## 📂 Project Structure

```text
API_Katalon/
├── Object Repository/
│   ├── GET User
│   ├── POST User
│   ├── PUT User
│   ├── PATCH User
│   └── DELETE User
├── Profiles/
├── Scripts/
├── Test Cases/
├── Test Suites/
└── README.md
```

## ✅ Test Scenarios

The automation includes test cases for:

* Verify GET user endpoint
* Verify POST user endpoint
* Verify PUT user endpoint
* Verify PATCH user endpoint
* Verify DELETE user endpoint
* Verify CRUD operations
* Validate API endpoint responses

## 🔐 Environment Variables

Sensitive API credentials are **not stored in this repository**.

The API key and authorization values are configured through Katalon Global Variables and should be provided locally when executing the test cases.

Example:

```text
BASE_URL = https://<your-project>.supabase.co/rest/v1/users
API_KEY = <your-api-key>
AUTHORIZATION = <your-authorization-token>
```

> **Note:** Replace the placeholder values with your own credentials when running the project locally.

## 🎯 Testing Objective

The objective of this project is to demonstrate API testing skills, including:

* REST API testing
* HTTP method validation
* CRUD operation testing
* Request and response validation
* Test automation using Katalon Studio
* Test case organization
* Environment variable management
* Basic API security practices

## 📊 Expected Result

Each test case should successfully validate the corresponding API operation and confirm that the API returns the expected response.

---

**Created for QA Automation Portfolio**
