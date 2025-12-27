# ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) Introduction to Java

A beginner-friendly guide to **Java**, explaining how it works, why it is **platform-independent**, and the purpose of components like **JDK, JRE, JVM, and Bytecode**.

---

## 📌 What is Java?

**Java** is a **high-level, object-oriented, class-based programming language** developed by **Sun Microsystems** (now **Oracle**).  

It follows the principle:

**_“Write Once, Run Anywhere (WORA)”_**  

> A Java program can run on **any operating system** that has a **Java Virtual Machine (JVM)** installed.

---

## 1️⃣ Why Java is Platform Independent?

Java achieves platform independence using **two main components**:

### ✔ Java Compiler (`javac`)

- Converts Java source code (`.java`) into **bytecode** (`.class`) instead of machine code.  

### ✔ Java Virtual Machine (JVM)

- Each operating system has its own **JVM implementation**.  
- All JVMs execute the **same bytecode**, making Java programs **platform-independent**.

**Platform Independence Flow:**

```text
Your Java Code (.java)
          |
          v
Java Compiler (javac)
          |
          v
Bytecode (.class)
          |
          v
JVM (OS-specific)
          |
          v
Program Output

# ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) Introduction to Java

A beginner-friendly guide to **Java**, explaining how it works, why it is **platform-independent**, and the purpose of components like **JDK, JRE, JVM, and Bytecode**.

---

## 🏗️ 1️⃣ Java Architecture Components

### **A. JDK (Java Development Kit)**

**What it is:**  
> The **JDK** is a complete development toolkit used to **write, compile, and run Java programs**.

**Includes:**

- 🟢 **JRE** – Java Runtime Environment  
- 🟢 **JVM** – Java Virtual Machine  
- 🟢 **Compiler (`javac`)** – Converts `.java` → `.class`  
- 🟢 **Debugger** – Helps find and fix errors  
- 🟢 **Development tools** – e.g., `javadoc`, `jar`, `javap`

**Who needs it:**  
- **Developers/programmers** who want to create Java applications.

---

### **B. JRE (Java Runtime Environment)**

**What it is:**  
> The **JRE** provides the **libraries and tools to run Java programs**, but **cannot compile or develop programs**.

**Includes:**

- 🟢 **JVM** – Executes bytecode  
- 🟢 **Core Libraries** – Pre-built Java classes  
- 🟢 **Runtime Classes** – Standard Java functionality

**Who needs it:**  
- **End users** who only want to **run Java applications**.

---

### **C. JVM (Java Virtual Machine)**

**What it is:**  
> The **JVM** is the **engine that executes Java bytecode**. Each OS has its own JVM, but all JVMs understand the **same bytecode**, enabling **platform independence**.

**Responsibilities:**

- 🟢 Loads and verifies bytecode  
- 🟢 Converts bytecode to machine code (**JIT compiler**)  
- 🟢 Executes the program  
- 🟢 Manages memory (**Heap, Stack, Garbage Collection**)

**Key point:**  
> JVM is **included in JRE**, so you don’t install it separately.

---

### **💡 JDK vs JRE vs JVM (Quick Comparison)**

| Feature             | JDK                       | JRE                     | JVM                      |
|--------------------|--------------------------|------------------------|--------------------------|
| **Full Form**       | Java Development Kit      | Java Runtime Environment| Java Virtual Machine     |
| **Purpose**         | Develop + Run Java apps   | Run Java apps           | Execute Java bytecode    |
| **Includes Compiler** | ✅ Yes                  | ❌ No                  | ❌ No                    |
| **Includes JVM**     | ✅ Yes                  | ✅ Yes                  | ✅ Yes                   |
| **Target Users**    | Developers               | End Users              | Everyone running programs|

---

## ⚙️ 2️⃣ Java Compilation & Execution Process

**Step-by-step:**

```bash
# Write Java code
Program.java

# Compile
javac Program.java   # Produces Program.class (bytecode)

# Execute
java Program
