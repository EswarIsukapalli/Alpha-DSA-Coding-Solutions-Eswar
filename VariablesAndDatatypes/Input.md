# 📘 Input.java

## 🧩 Overview
`Input.java` is a beginner-friendly Java program that demonstrates how to take **user input** using the `Scanner` class.  
It accepts a student’s details such as roll number, name, college name, and CGPA, and then displays them neatly as output.

---

## 🧠 Concepts Covered
- **`Scanner` class** from `java.util` package  
- Reading different data types from user input:
  - `int` → Roll number  
  - `String` → Name, College name  
  - `float` → CGPA  
- Handling newline issues using `sc.nextLine()` after numeric input  
- Displaying output using `System.out.println()`

---

## 💻 Code
> 💡 *You can copy the code below directly into your `Input.java` file.*

```java
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Rollno : ");
        int sno = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Your Name : ");
        String sname = sc.nextLine();

        System.out.print("Enter Your College Name : ");
        String clg = sc.nextLine();

        System.out.print("Enter Your CGPA : ");
        float cgpa = sc.nextFloat();

        System.out.println("\n--- Student Details ---");
        System.out.println("Rollno : " + sno);
        System.out.println("Name : " + sname);
        System.out.println("College Name : " + clg);
        System.out.println("CGPA : " + cgpa);

        sc.close();
    }
}

---
🧾 Example Output
yaml
Copy code
Enter Your Rollno : 102
Enter Your Name : Eswar
Enter Your College Name : Aditya University
Enter Your CGPA : 9.2

--- Student Details ---
Rollno : 102
Name : Eswar
College Name : Aditya University
CGPA : 9.2
⚙️ How to Run
Save the file as Input.java

Open terminal or command prompt in the same directory.

Compile the code:

bash
Copy code
javac Input.java
Run the program:

bash
Copy code
java Input
🏁 Key Takeaways
✅ Use Scanner for reading input in Java.
✅ Always use sc.nextLine() after nextInt() or nextFloat() to clear buffer issues.
✅ Close the Scanner object after use to prevent resource leaks.

📂 File Name: Input.java
📄 Description: Demonstrates Java input handling using Scanner class.
🕹️ Author: Eswar Isukapalli---
Difficulty: Easy
Source: Java Basics
Tags:
  - Input Handling
  - Scanner
---

# 🚀 _Input.java — User Input Program_ 🧠

The problem can be found here: [Java Scanner Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

## 💡 **Program Description:**

Write a Java program that takes user input for a student's details such as **Roll Number**, **Name**, **College Name**, and **CGPA**, then displays the details neatly as output.

---

## 🔍 **Example Walkthrough:**

### 🧠 Input:

Enter Your Rollno : 102
Enter Your Name : Eswar
Enter Your College Name : Aditya University
Enter Your CGPA : 9.2

shell
Copy code

### ✅ Output:

--- Student Details ---
Rollno : 102
Name : Eswar
College Name : Aditya University
CGPA : 9.2

pgsql
Copy code

---

## 🎯 **Concepts Covered:**

- Using the `Scanner` class from the `java.util` package  
- Reading multiple data types (`int`, `String`, `float`) from user input  
- Handling newline buffer issues using `sc.nextLine()` after numeric input  
- Displaying formatted output using `System.out.println()`  

---

## 📝 **Code (Java)**

```java
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Rollno : ");
        int sno = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Your Name : ");
        String sname = sc.nextLine();

        System.out.print("Enter Your College Name : ");
        String clg = sc.nextLine();

        System.out.print("Enter Your CGPA : ");
        float cgpa = sc.nextFloat();

        System.out.println("\n--- Student Details ---");
        System.out.println("Rollno : " + sno);
        System.out.println("Name : " + sname);
        System.out.println("College Name : " + clg);
        System.out.println("CGPA : " + cgpa);

        sc.close();
    }
}
⚙️ How to Run
Save the file as Input.java

Open the terminal or command prompt in the same directory.

Compile the code:

bash
Copy code
javac Input.java
Run the program:

bash
Copy code
java Input
🕒 Time and Space Complexity
Time Complexity: O(1) (Fixed input operations)

Space Complexity: O(1) (Constant space used for variables)

🏁 Key Takeaways
✅ Use Scanner for reading input in Java.
✅ Always use sc.nextLine() after nextInt() or nextFloat() to clear the input buffer.
✅ Close the Scanner object after use to prevent resource leaks.

<details> <summary><h2 align='center'>👨‍💻 Additional Notes</h2></summary>
The Scanner class can read various data types using methods like:

nextInt() — reads integers

nextFloat() — reads floating-point numbers

nextLine() — reads full strings (including spaces)

Always remember to close the scanner using sc.close() to release system resources.

</details>
📅 Category: Java Basics / Input Handling