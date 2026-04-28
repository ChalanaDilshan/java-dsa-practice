#  Java Stack Implementation (Array-Based)

A fundamental, array-based implementation of the **Stack** data structure in Java. This project is designed to practically demonstrate the core **LIFO (Last In, First Out)** principle and fundamental Data Structures and Algorithms (DSA) concepts.

##  Tech Stack
* **Language:** Java
* **Concepts:** Data Structures, Arrays, Object-Oriented Programming (OOP)

##  Implemented Operations

This implementation handles all core stack operations along with proper validation to prevent array boundary errors:

* **`push(int value)`**: Adds an element to the top of the stack. Includes **Stack Overflow** validation.
* **`pop()`**: Removes and returns the topmost element. Includes **Stack Underflow** validation (returns `-1` if empty).
* **`peek()`**: Retrieves the topmost element without removing it from the stack.
* **`display()`**: Iterates and prints all current elements from bottom to top.
* **`isEmpty()` & `isFull()`**: Helper methods to check the current state of the stack.

##  Project Structure

* **`Stack.java`**: The core data structure class containing the array operations, capacity management, and the `top` pointer logic.
* **`StackApplication.java`**: The driver class containing the `main` method to test and execute the stack operations.

##  How to Run

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/ChalanaDilshan/java-dsa-practice.git

2. Navigate to the project directory and compile the Java files:
   ```bash
   javac JavaStackOperation/*.java
   ```
3. Run the main application:
   ```bash
   java JavaStackOperation.StackApplication
   ```

## 📊 Console Output Example

When executed, the program demonstrates pushing elements, checking the top element, and handling overflow conditions:

```text
--- pushing 21,74,65,88 ---
Pushed: 21
Pushed: 74
Pushed: 65
Pushed: 88

Stack Elements: (bottom -> top)
21
74
65
88

Peek: 88

=== Pushing 11,55 ===
Pushed: 11
Pushed: 55

Stack Elements: (bottom -> top)
21
74
65
88
11
55

Peek: 55
Popped: 55

Stack Elements: (bottom -> top)
21
74
65
88
11

=== Pushing 7,3,99 ===
Pushed: 7
Pushed: 3
Pushed: 99
Stack Overflow! Cannot insert elements!
```
*Created for practicing fundamental Data Structures and Algorithms.*
