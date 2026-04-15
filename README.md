# Number Manipulation Application

A Java console application that performs various operations on an array of user-provided integers.

## Overview

This project was created as part of my Java coursework to demonstrate object-oriented programming principles, array manipulation, and user interaction through a menu-driven interface.

## Features

The application provides 12 different operations:

1. **Display first number** - Shows the first element in the array
2. **Display middle number** - Shows the middle element (lower middle for even-length arrays)
3. **Display last number** - Shows the last element in the array
4. **Calculate sum** - Computes the total of all numbers
5. **Find largest number** - Identifies the maximum value
6. **Find smallest number** - Identifies the minimum value
7. **Calculate average** - Computes the mean of all numbers
8. **Above-average numbers** - Displays all numbers greater than the average
9. **Even numbers** - Lists all even numbers and counts them
10. **Odd numbers** - Lists all odd numbers and counts them
11. **Search for number** - Checks if a specific number exists in the array
12. **Find number index** - Returns the position of a searched number

## Project Structure

- `NumberManipulation.java` - The instantiable class containing all data members and methods for array operations
- `NumberManipulationApp.java` - The application class with the main method and user interface

## How to Run

1. Ensure you have Java Development Kit (JDK) installed
2. Compile both files:
```bash
   javac NumberManipulation.java NumberManipulationApp.java
```
3. Run the application:
```bash
   java NumberManipulationApp
```
4. Follow the prompts to enter your numbers and select operations

## Example Usage

How many numbers would you like to enter? or enter 0 to exit
5
Please enter you number 1:
10
Please enter you number 2:
23
Please enter you number 3:
7
Please enter you number 4:
15
Please enter you number 5:
30
The Options for this app are:
1. Display the 1st number.
2. Display the middle number.
...
13. Exit
What would you like to do?
7
Average number: 17

## What I Learnt

- **Object-oriented design** - Separation of concerns between logic and presentation
- **Encapsulation** - Using private data members with public getter/setter methods
- **Array manipulation** - Working with dynamic arrays and index-based operations
- **String handling** - Using `StringBuffer` for efficient string concatenation
- **Input validation** - Handling edge cases like negative array lengths
- **Menu-driven interfaces** - Creating user-friendly console applications

## Technologies Used

- Java SE
- Scanner class for user input
- StringBuffer for string manipulation

## Author

Abooh Agyekum

## Course Context

This project was developed as part of my college Java programming coursework, specifically for practising array manipulation and object-oriented programming principles.
