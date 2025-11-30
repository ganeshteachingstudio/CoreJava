# ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) Introduction to Java

A beginner-friendly explanation of how **Java works**, why it is **platform-independent**, and what components like **JDK, JRE, JVM, and Bytecode** mean.

---

## 📌 What is Java?

**Java** is a **high-level, object-oriented, class-based programming language** developed by **Sun Microsystems** (now **Oracle**).  

It follows the principle:

**_“Write Once, Run Anywhere (WORA)”_**  

> A program written in Java can run on **any operating system** that has a **Java Virtual Machine (JVM)**.

---

## 1️⃣ Why Java is Platform Independent?

Java’s platform independence comes from **two key components**:

### ✔ Java Compiler (javac)

- Converts Java source code (`.java`) into **bytecode** (`.class`) instead of machine code.
  
### ✔ Java Virtual Machine (JVM)

- Each operating system (Windows / Linux / Mac) has its own JVM.  
- JVM executes the same **bytecode**, making Java **platform-independent**.

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
Output
