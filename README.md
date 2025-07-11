# Password Checker

## Overview
This Java program is a simple password verification 
system that checks if the user's input matches the 
correct password ("swordfish"). The program demonstrates 
basic input & output operations, conditional logic, and 
exception handling in Java.

## Features
- Prompts the user to enter a password
- Compares the input against the correct password ("swordfish")
- Provides appropriate feedback (access granted/denied)
- Includes proper resource management (Scanner closure)
- Implements basic error handling

## How to Use
1. Compile the program: `javac Solution.java`
2. Run the program: `java Solution`
3. When prompted, enter a password
4. The program will display whether access is granted or denied

## Requirements
- Java Development Kit (JDK) installed
- Basic command line knowledge

## Code Structure
- Uses a `Scanner` object for user input
- Implements a try-catch-finally block for error handling
- Uses text blocks for multi-line output messages
- Simple if-else logic for password verification

## Example Output
```
What is your password: swordfish
Password: swordfish
Access granted.
Welcome!
```

```
What is your password: password123
Password: password123
Access denied.
Incorrect password.
```
