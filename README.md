# Exceptions

**Author:** Emerson Albert  
**Course:** Software Development I  
**CRN:** CEN3024C-24205  

## Project Description  

This repository contains a Java project designed to demonstrate key programming concepts such as exception handling, user input validation, and object-oriented programming principles.  

### Project Overview  
The uploaded project is divided into two main components:  

1. **Division Application:**  
   - **Purpose:** Allows users to divide two single-digit integers.  
   - **Key Concepts:** Exception handling (`ArithmeticException`) to gracefully handle division by zero.  
   - **Expected Inputs:** Two single-digit integers from the user.  
   - **Expected Outputs:**  
     - A formatted result of the division, or  
     - An error message when division by zero is attempted.  

2. **Account Creation Application:**  
   - **Purpose:** Validates usernames and passwords based on specific rules and creates user accounts if the inputs meet the criteria.  
   - **Key Concepts:**  
     - Custom exceptions for username and password validation.  
     - Input validation using custom methods for counting vowels, digits, special characters, and specific letters.  
     - Object-oriented principles (classes, constructors, and encapsulation).  
   - **Expected Inputs:**  
     - **Username Rules:**  
       - 10 characters long with at least 4 vowels, or  
       - At least 5 characters long with 3 digits.  
     - **Password Rules:**  
       - At least 20 characters long.  
       - Contains at least 3 special characters.  
       - Includes exactly 10 occurrences of the letter 'E'.  
   - **Expected Outputs:**  
     - Confirmation messages for valid usernames and passwords.  
     - Error messages with specific reasons for invalid inputs.  
     - A final display of all valid accounts created.  

## Programming Concepts and Tools Employed  
- **Exception Handling:**  
  - Use of `try-catch` blocks to prevent crashes and handle specific scenarios like division by zero.  
  - Custom exceptions (`PasswordVerifyException`) to enforce input validation rules.  
- **Object-Oriented Programming:**  
  - Encapsulation of username and password validation logic within the `PasswordVerify` class.  
  - Modular design with methods for specific validation tasks (e.g., counting vowels, digits, special characters).  
- **Input Handling:**  
  - Use of the `Scanner` class to read user input.  
- **String Manipulation:**  
  - Methods for analyzing strings (e.g., `indexOf`, loops for character-by-character checks).  
- **Formatting Outputs:**  
  - Using `System.out.printf` for neatly formatted output.  

---

Feel free to explore the code and see how these programming concepts are implemented.
