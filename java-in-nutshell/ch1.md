# Ch 1 What is JVM and how to run the Java program
## objectives
- What is JVM?
- How to compile?
- How to run?
- What is bytecode?
- What is JIT compiler and how it runs
- JVM structure
- JDK vs JRE


## What is JVM?
The **JVM(Java Virtual Machine)** is a program that provides the runtime environment necessary for Java programs to execute.

`Java <args> <program>`

This brings up the JVM which as an operating system process that provides the Java runtime environment, then executes our program in the context of the freshly started virtual machine.

Java source code is not directly provided to the JVM. Instead, Java source code must be compiled into a form known as Java bytecode.
Java bytecode must be supplied to the JVM in a format called **class files**.

> Is Java an interpreted language?

The JVM is basically an interpreter. But, most interpreted languates(like PHP, Perl, Ruby, and Python) directly interpret programs from source form. The JVM interpreter, on the other hand, requires class files which require a separate source code compilation step with _javac_.

## How to compile?
_javac_ is a program which takes Java source codes to produce class files contain the source code compiled to Java bytecode.

The class file is  the smallest unit of functionality the platform will deal with, and the only way to get new code into a running program.

## What is bytecode?
Bytecode is not actuaylly very similar to machine code that would run on a real hardware processor. Instead, bytecode is a sort of _intermediate representation_ - a halfeway house between source code and machine code.
It is a format that can be executed efficiently by the JVM's interpreter.

## What is JIT compiler and how it runs?
Dynamic compilation has some advantages over static compilation. When running Java or C# applications, the runtime environment can profile the application while it is being run. This allows for more optimized code to be generated.
Because if the application's behaviour changes frequently on the runtime, the JVM should recompile the code.

Some of the disadvantages include delays and the overhead of compilation during runtime. To optimize it, many **JIT compilers only compile code paths that are frequently used.**

**J**ust **I**n **T**ime Compilation, JIT or Dynamic Translation, is compilation that is being done during the execution of a program.
The advantages of a JIT commpiler are due to the fact, that since the compilation takes place in run time, a JIT compiler has access to dynamic runtime information enabling it to make better optimizations.

<https://www.freecodecamp.org/news/just-in-time-compilation-explained/>

## JVM Structure
![](https://images.velog.io/images/hyungjungoo95/post/fff1a6d0-5753-4f07-8c51-ed34d620c0ee/image.png)

1) Class Loader

    Class loader is a subsystem used for loading class files. It performs three major functions (Loading, Linking, Initialization).

2) Method Area

    JVM Method Area stores class structure like metadata, the constant runtime pool, and the code for methods.

3) Heap

    All the Objects, their related instace variables, and arrays are stored in the heap. This memory is common and shared across multiple threads.

4) JVM langauge Stacks

    Java language stacks store local variables, and it's parital results. Each thread has its own JVM stack, created simultaneously as the thread is created. A new frame is created whenever a method is invoked, and it is deleted when method invocation process is complete.

5) PC Registers

    PC register stores the address of the JVM instruction which is currently executing. In Java, each thread has its seperate PC register.

6) Native Method Stacks

    Native method stacks hold the instruction of native code depends on the native library. It is written in another language instead of Java.

7) Execution Engine

   It is a type of software used to test hardware, software, or complete systems. The test execution engine never carries any information about the tested product.

8) Native Method interface

    The Native Method Interface is a programming framework. It allows Java code which is running in a JVM to call by libraries and native applications.

9) Native Method Libraries

    Native Libraries is a collection of the Native Libraries(C, C++) which are needed by Execution Engine.


## JDK vs JRE
JDK is a software development environment used for making applets and Java applications. The full form of JDK is s Java Development Kit. Java developers can use it on Windows, MacOS, and Linux. JDK helps them to code and run Java programs. It is possible to install more than one JDK verion on the same computer.

JRE is a piece of a software which is designed to run other software. It contains the class libraries, loader class, and JVM. In simple terms, if you want to run Java program you need JRE. If you are not a programmer, you don't need to install JDK, but just JRE to run Java programs. Though, all JDK versions comes bundled with Java Runtime Environment, so you don't need to donload and install the JRE separately in your computer.

