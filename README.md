#File-Handling-Utility

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: SHALU

*INTERN ID*: CT06DF405

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 6 WEEKS

*MENTOR*: NEELS SANTHOSH KUMAR

DESCRITON: The FileOperation is a Java-based console application designed to perform basic text file operations in a user-friendly, menu-driven manner. This project demonstrates how Java handles file I/O (input and output) through practical and interactive use cases. It serves as an educational tool for beginners and intermediate programmers to understand the fundamentals of file management in Java using the java.io package and related classes.

At its core, the application allows the user to interact with text files without requiring any graphical interface or external libraries. Upon launching, the user is presented with a simple menu that includes multiple options: creating a file, writing to a file, reading file contents, modifying the content by replacing specific words, clearing file contents without deleting the file, and deleting the entire file. These operations are selected by entering a number corresponding to each action, making it intuitive to use even for those new to programming.

One of the main highlights of this application is the write-to-file functionality. It allows users to input multiple lines of text that will be written into a file until the user types the keyword end. This makes it possible to enter structured and multi-line data conveniently. If the file already exists, the content is appended rather than overwritten, ensuring that previous data is preserved unless the user chooses to clear it manually.

The read functionality is built to detect whether the file is empty and notify the user accordingly by displaying "File is empty." If content exists, it reads and displays each line, helping users verify the contents of their file quickly. Similarly, the modify function enables users to find a specific word within the file and replace it with another. This is particularly useful for batch content updates or correcting common words without manually editing the file.

To provide complete file lifecycle control, the program includes options to delete the entire file or simply clear its contents. Deleting a file removes it from the system entirely, while clearing it only erases its content, keeping the file structure intact. This distinction is essential for users who may want to preserve the filename or reuse the file later.

The program is implemented using standard Java libraries, including File, Scanner, FileWriter, and BufferedReader, avoiding any dependencies on third-party frameworks. This ensures portability and makes it easy to run on any platform with Java installed. It was developed using Visual Studio Code, though it can be compiled and executed from any Java-compatible environment.

The program allows the user to:

📁 **Create a new text file**

✍️ **Write text to a file** with multi-line input (ends with "end")

📖 **Read the content** of the file and display it (indicates if the file is empty)

🔁 **Modify existing content** by replacing a specific word

🗑️ **Delete the entire file**

🧹 **Clear the content** of the file without deleting it

*OUTPUT*:
![Image](https://github.com/user-attachments/assets/3378e1aa-17ca-4a4c-992f-d5945b3045c9)
![Image](https://github.com/user-attachments/assets/8874bbec-ebaa-4457-a8a5-a30d044e8d91)
![Image](https://github.com/user-attachments/assets/515daa3c-0d52-4221-a917-d5e2c9765289)
![Image](https://github.com/user-attachments/assets/8f002b54-26fc-4704-a4a6-4dd2122a2a22)
![Image](https://github.com/user-attachments/assets/76fe0c02-754e-4a33-abb4-93784c7440cb)
