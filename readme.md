Budgeting Tool Proposal
Sam Allen, CSCI 121

# Purpose
This project demonstrates proficiency in key ideas learned in CSCI 121, such as Object-Oriented Programming, use of data structures, and file IO. 

# Overview
- This budgeting tool will be used to automate tasks I do for my budget. 
- It will use classes to embody different parts of my budget, such as record keeping and monetary allocation, in addition to an abstract class containing useful methods for handling the linked lists and organizing the data that both other classes will inherit. An instance of the first two classes will be made in a Budget class that will act like main and have its own menu. 
- Classes will also be used to define the methods of different data types and create corresponding linked lists. 
- There will be Linked Lists made using the classes..
  - Date to contain and format dates, (this will be custom made)
  - Integers to contain basic integer like the paycheck, monthly payments, or transaction expenses
  - ResultingInt to contain integers that are the result of multiple other integers, such as subtracting monthly payments from the paycheck, multiplying the money made by a certain percentage, or adding the sum of balances belonging to each bank account (this will be custom made, the specific type will be decided by the user when the instance is made)
  - Strings will be used for string information, mainly in the Record Keeping class since many of those values don't need to be saved as integers
- It will then use those a multi list to organize data and know how to handle the data in different ways. An main Linked Lists will contain the head of a column of data, since each column will have specific attributes. 
  - Each part of the main linked list will have a linked list coming from it in order to contain the column title and bank account the money is kept in, if applicable, two integers representing the amount of money in that section of the budget and the value to use to manipulate the data, and finally a string instructing the program how to manipulate that data (such as use the previous value to subtract, multiply etc)
  - Each part of the main linked list will also have a linked list coming from it that contains each cell of data, all integers, in that column. These will all be handled the same way, using the information in the above mentioned linked list
  - The main linked list serves to keep the data organized and in a specific order while making it highly editable. 
- The tool will be highly editable to fit different customers present and future needs. 
- Ultimately, the data will be saved as a file openable to excel so that the customer can view it that way as well. Therefore, it will also have to be able to be loadable from an excel file. 

# Anticipated Use Cases
- This will be used specifically for people to handle their budget. It is made to be flexible so people can set it up according to their own needs but then it will handle all of the automatic processes and formatting by itself. 

# Use of OOP Ideas
- Inheritance: The Record class and MoneyAllocation class will inherit methods for adding, changing, moving around, and maybe saving data from the various Linked Lists. 
- Encapsulation: All of the data members are hidden and accessible only through getters and setters. 
- Polymorphism: The abstract class will have methods such as menu and saving that will be customized to the class that inherits them. 
- Abstraction: The abstract class will not have all of the methods defined, as they are meant to be implimented and defined in the classes that inherit them. 
- Composition: The main class will implement instances of the Record and MoneyAllocation classes. 
- Serialization: Even though the data will be able to be saved to an excel file, it might be easier to serialize the data as well and load it from that. The only downside is that the user won't be able to edit the excel file and load it from that. Regardless, serialization will be used at the very least to do a backup save. 

# Use of Data Structures
- This project will use Linked lists of different types to make a multi list and effectively categorize different types of data that each have their own actions and uses. 

# Technology/Implementation
- Java would be the most useful language for writing this project due to its ability to serialize the data. Other than the ability to save and load from an excel file, the user interface will just be the Command Line because there's no need to do anything else for it. 

# Milestones
- UML approved
- Data Classes (Date and ResultingInt specifically)
- Abstract class
- Record keeping class
- MoneyAllocation class
- Serializability
- Save/load from Excel