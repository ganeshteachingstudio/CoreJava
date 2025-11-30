Introduction to Java

A beginner-friendly explanation of how Java works, why it is platform-independent, and what components like JDK, JRE, JVM, and Bytecode actually mean.

📌 What is Java?

Java is a high-level, object-oriented, class-based programming language developed by Sun Microsystems (now Oracle).
It follows the principle:

Write Once, Run Anywhere (WORA)

This means a program written in Java can run on any operating system that has a Java Virtual Machine (JVM).

1. Why Java is Platform Independent?

Java’s platform independence comes from two things:

✔️ 1. Java Compiler (javac)

Java source code (.java) is not converted into machine code directly.
Instead it is converted into bytecode (.class files).

✔️ 2. Java Virtual Machine (JVM)

Each operating system (Windows / Linux / Mac) has its own JVM implementation.

But they all understand the same bytecode.

➡️ So the program is same everywhere, only JVM changes.

⚙️ Platform Independence Flow
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

2. Java Execution Architecture Components
A. JDK (Java Development Kit)

Contains everything needed to develop Java applications.

JDK includes:

JRE

JVM

Compiler (javac)

Debugger

Development tools

👉 If you are a programmer, you must install JDK.

B. JRE (Java Runtime Environment)

Contains everything needed to run a Java program.

JRE includes:

JVM

Libraries

Runtime classes

👉 End users who only run Java programs need JRE.

C. JVM (Java Virtual Machine)

JVM is the heart of Java.

JVM Responsibilities:

Loads bytecode

Verifies bytecode

Converts bytecode to machine code (via JIT compiler)

Executes the program

Handles memory management, garbage collection

Each operating system has its own JVM implementation, but all JVMs understand same bytecode → This makes Java platform independent.

3. Java Compilation & Execution Process
🧩 Step-by-step:

Write Code → Program.java

Compile → javac Program.java
Output → Program.class (bytecode)

Execute → java Program

JVM internally:

Loads class

Verifies bytecode

Interprets or JIT-compiles

Executes

4. What is Bytecode?

Bytecode is an intermediate code which is:

Platform neutral

Not human-readable

Understood only by JVM

Example:

0x2a
0xb7
0x1c


Bytecode is what makes Java portable.

5. Key Features of Java
✔ Platform Independent
✔ Object-Oriented
✔ Simple & Secure
✔ Robust (Strong memory management)
✔ Multithreading
✔ High Performance (using JIT compiler)
✔ Portable
✔ Distributed
6. JVM Internal Architecture (Summary)
JVM contains:

Class Loader

Bytecode Verifier

Execution Engine

Interpreter

JIT compiler

Runtime Data Areas

Heap

Method Area

Stack

PC Register

Native Method Stack

Garbage Collector

7. What Makes Java Secure?

Java eliminates:

Manual memory allocation

Pointer manipulations

Direct access to memory

Java has:

Bytecode verifier

Strict access controls

Sandbox environment

8. Why Java is Popular Today?

Java is used in:

Banking applications

Web applications

Android apps

Enterprise systems

Cloud applications

Automation & testing (Selenium)

9. Java Editions
Edition	Purpose
Java SE	Core Java (standard apps)
Java EE / Jakarta EE	Enterprise applications
Java ME	Mobile devices (legacy)
Java FX	UI applications
10. Summary Table
Component	Purpose
JDK	Development + Execution
JRE	Execution only
JVM	Runs bytecode
Bytecode	Platform-independent code
Compiler (javac)	Converts .java → .class