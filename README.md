# Train Consist Management App

## Overview

The **Train Consist Management App** is a **console-based Java application** that simulates how a railway system manages a train’s consist, which is the collection of bogies attached to a train engine.

This application demonstrates real-world railway operations while introducing important **Java programming concepts**, **data structures**, **functional programming**, and **validation techniques** through progressive use cases.

---

## Features

The application supports:

### Passenger Bogies

* Sleeper
* AC Chair
* First Class
* Seat Capacity Tracking

### Goods Bogies

* Rectangular Bogies
* Cylindrical Bogies
* Cargo Type Management
* Safety Validation Rules

### Train Operations

* Add/Remove Bogies
* Track Unique Bogie IDs
* Maintain Ordered Train Formation
* Sort and Filter Bogies
* Group Bogies by Category
* Calculate Total Seating Capacity
* Validate Input Formats
* Safety Compliance Checks

---

## Technologies Used

* **Java**
* **Java Collections Framework**
* **Streams API**
* **Lambda Expressions**
* **Regex Validation**
* **Comparator Interface**
* **Functional Programming Concepts**

---

## Project Structure / Use Cases Implemented

---

### UC1: Initialize Train and Display Consist Summary

**Concepts Used:**

* Class
* Main Method
* Static Keyword
* ArrayList
* List Interface

**Functionality:**

* Initializes train consist
* Displays welcome message
* Shows initial bogie count

---

### UC2: Add Passenger Bogies

**Concepts Used:**

* ArrayList Operations
* add()
* remove()
* contains()

**Functionality:**

* Add passenger bogies dynamically
* Remove bogies
* Check bogie existence

---

### UC3: Track Unique Bogie IDs

**Concepts Used:**

* HashSet
* Set Interface

**Functionality:**

* Prevent duplicate bogie IDs
* Maintain unique registrations

---

### UC4: Maintain Ordered Train Consist

**Concepts Used:**

* LinkedList
* addFirst()
* addLast()
* removeFirst()
* removeLast()

**Functionality:**

* Maintain physical bogie sequence
* Insert/remove bogies efficiently

---

### UC5: Preserve Insertion Order

**Concepts Used:**

* LinkedHashSet

**Functionality:**

* Preserve insertion order
* Prevent duplicate bogies

---

### UC6: Store Bogie Capacity Mapping

**Concepts Used:**

* HashMap
* Key-Value Pairs

**Functionality:**

* Store bogie names with seating capacities

---

### UC7: Sort Bogies by Capacity

**Concepts Used:**

* Comparator
* Custom Objects
* sort()

**Functionality:**

* Sort bogies by seating capacity

---

### UC8: Filter Passenger Bogies

**Concepts Used:**

* Stream API
* filter()
* Lambda Expressions

**Functionality:**

* Filter bogies based on capacity threshold

---

### UC9: Group Bogies by Type

**Concepts Used:**

* Collectors.groupingBy()
* Stream Pipeline
* Map Structure

**Functionality:**

* Group bogies into categories

---

### UC10: Count Total Seats

**Concepts Used:**

* map()
* reduce()
* Integer::sum

**Functionality:**

* Calculate total seating capacity

---

### UC11: Validate Train ID & Cargo Codes

**Concepts Used:**

* Regex
* Pattern
* Matcher

**Functionality:**

* Validate Train IDs
* Validate Cargo Codes

---

### UC12: Safety Compliance Check

**Concepts Used:**

* Streams API
* allMatch()
* Conditional Validation

**Functionality:**

* Validate goods bogie safety rules
* Ensure cylindrical bogies carry petroleum only

---

## Safety Rules Implemented

| Bogie Type  | Allowed Cargo  |
| ----------- | -------------- |
| Cylindrical | Petroleum Only |
| Open / Box  | Any Cargo      |

---

## Sample Validation Formats

### Train ID Format

Valid:
TRN-1234

Invalid:
TRAIN12
TRN12A
1234-TRN

---

### Cargo Code Format

Valid:
PET-AB

Invalid:
PET-ab
PET123
AB-PET

---

## Learning Outcomes

This project teaches:

* Core Java Fundamentals
* Java Collections Framework
* Object-Oriented Programming
* Functional Programming with Streams
* Regex Validation
* Business Rule Enforcement
* Data Aggregation & Processing
* Enterprise Coding Practices

---

## Future Enhancements

Possible future improvements:

* GUI Interface using JavaFX/Swing
* Database Integration (MySQL/PostgreSQL)
* File Persistence
* Real-Time Train Tracking
* REST API Integration
* Unit Testing with JUnit

---

## Conclusion

The **Train Consist Management App** provides a complete simulation of railway consist management while serving as a practical educational project for learning modern Java programming concepts through real-world business scenarios.

---
