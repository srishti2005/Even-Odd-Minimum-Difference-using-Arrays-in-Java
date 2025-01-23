# Even-Odd-Minimum-Difference-using-Arrays-in-Java
This is a java program to print two new arrays for even and odd from the given input array by the user and the next method provides the index of the minimum difference between the elements of the input array
Array Functions in Java
Overview
This project demonstrates the use of Java classes and methods to perform various operations on arrays, including:

Separating even and odd elements.
Finding the index of the element with the minimum difference between consecutive elements.
Taking user input for arrays dynamically.
The project is divided into three Java files:

ArrayFunctions.java: Contains methods to process arrays.
Main.java: The entry point to the program where methods from ArrayFunctions are invoked.
UserInput.java: Handles user input for arrays.
File Descriptions
1. ArrayFunctions.java
This file contains the following methods:

display(ArrayList<Integer> array):
Prints the elements of the provided array.
oddEven(int[] array):
Separates the input array into odd and even numbers.
Displays the odd and even numbers using the display method.
minDiff(int[] array):
Calculates the index of the element with the minimum difference between consecutive elements.
Returns the index of the first element in the pair with the smallest difference.
2. Main.java
This is the main file that serves as the entry point for the program. It:

Creates instances of UserInput and ArrayFunctions.
Accepts an array input from the user.
Invokes methods from ArrayFunctions to perform operations such as finding the minimum difference or separating even and odd numbers.
3. UserInput.java
This file contains:

arrayInput():
Prompts the user to input 5 integers.
Returns the entered integers as an array.
How to Run the Project
Compile All Java Files:

bash
Copy
Edit
javac UserInput.java ArrayFunctions.java Main.java
Run the Program:

bash
Copy
Edit
java Main
Program Flow:

The program will prompt the user to enter 5 integers.
Based on the uncommented methods in Main.java, the program will:
Either display the index of the minimum difference element.
Or, separate and display the even and odd elements.
Example Input/Output
Example 1: Finding Minimum Difference Index
Input:
mathematica
Copy
Edit
Enter 5 numbers:
10 12 15 14 18
Output:
csharp
Copy
Edit
The index is: 2
Example 2: Displaying Odd and Even Numbers
Input:
mathematica
Copy
Edit
Enter 5 numbers:
10 12 15 14 18
Output:
csharp
Copy
Edit
Array is: [15]
Array is: [10, 12, 14, 18]
Features
Dynamic User Input: Easily accepts input arrays from the user.
ArrayList Usage: Efficiently separates even and odd elements.
Custom Methods: Encapsulates logic for better reusability and readability.
