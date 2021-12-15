# ch 1 What is JVM and how to run the Java program
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

Some of the disadvantages include delays and the overhead of compilation during runtime. To optimize it, many JIT compilers only compile code paths that are frequently used.

**J**ust **I**n **T**ime Compilation, JIT or Dynamic Translation, is compilation that is being done during the execution of a program.
The advantages of a JIT commpiler are due to the fact, that since the compilation takes place in run time, a JIT compiler has access to dynamic runtime information enabling it to make better optimizations.

<https://www.freecodecamp.org/news/just-in-time-compilation-explained/>

## JVM structure