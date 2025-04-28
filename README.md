# 📆📅 Exercise Description

The goal of this exercise is to create a class called `Month` to store the name of each month of the year, manage the months using Java's `ArrayList` and `HashSet`, and demonstrate proper list and set operations in Java.

### ✅ What You Must Implement

#### 🔹 Month Class
- Create a class named `Month` with one attribute: `String name`.

#### 🔹 ArrayList Handling
- Instantiate 11 different `Month` objects, **excluding** the month `"Agost"`.
- Add them to an `ArrayList` maintaining the order of months.
- Insert the `"Agost"` object in its correct position (between `"Juliol"` and `"Setembre"`).
- Print the list to demonstrate the correct order is preserved.

#### 🔹 HashSet Conversion
- Convert the `ArrayList` into a `HashSet`.
- Ensure that no duplicates are added (e.g., trying to add `"Gener"` again should be ignored).
- Override `equals()` and `hashCode()` in the `Month` class for correct behavior.

#### 🔹 Iteration
- Traverse the list using:
  - A classic `for` loop.
  - An `Iterator`.

This exercise is designed to practice **object-oriented programming**, **collection manipulation**, and **iteration techniques** in Java.

---

# 💻 Technologies Used

- Java 17  
- IntelliJ IDEA (Community Edition)  
- Maven  
- Git & GitHub  

---

# 📋 Prerequisites

Ensure the following are installed on your system:

- Java JDK 17  
- IntelliJ IDEA Community Edition  
- Git Bash or any terminal  
- GitHub account  

---

# 🛠️ Installation and Setup

1. **Install necessary software:**
   - Java JDK 17  
   - IntelliJ IDEA Community Edition  
   - Git Bash  

2. **Clone the repository:**
```bash
git clone https://github.com/yourusername/month-collection-java.git
cd month-collection-java
Open the project in IntelliJ:

Go to File → Open

Select the cloned project folder

▶️ Running the Project
Open the Main.java file inside IntelliJ.

Right-click on the file and choose Run 'Main.main()'.

The console will display:

The ordered ArrayList with all 12 months.

The contents of the HashSet, demonstrating duplicate prevention.

Two different ways of iterating through the list.

🌐 Deployment
This is a console-based Java project and does not require deployment.
You can run it locally using your IDE or any Java-supporting terminal.

🤝 Acknowledgements
Special thanks to Ana, Alejandro, Adrià, and Ignasi for their continued support and contributions during this learning process.
