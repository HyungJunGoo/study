# Ch 2 Java primitve type, variables and arrays

## objectives
- What is primitive data type?
- Primitive type vs referece type
- Literal
- Variables and initialization
- Variable scope and lifetime
- Type casting
- Arrays

## What is primitive data type?

Java supports eight basic data types known as _primitive types_.

![](https://images.velog.io/images/hyungjungoo95/post/eee9b104-3e4a-4a2e-96d6-8e1d4d0014b6/image.png)

1) The _boolean_ type represents trueth values. Java is much stricter about its Boolean values than other languages. Boolean is neither an integral nor an object type and incompatible values cannot be used in place of a _boolean_.

2) The _char_ type represents Unicode characters. The rule to remember when using character, simply place it between single quotes.
Java supports a number of escape sequences that make it easy both to represent commonly used nonprinting ASCII charaters, such as _newline_, and to escape certain punctuation characters that have special meaning.\
For example, tab = '\t', nul = '\000', backspace = '\b', etc.\

    > **String Literals**\
    In addition to the _char_ type, Java also has a data type for working with strings of text. The **String** type is a class, however, and is not one of the primitive types of the language. Because strings are so commonly used, Java does have a syntax for including string values literally in a promgram.
3) The Integer types in Java are _byte_, _short_, _int_, and _long_. These four types differ only in the number of bits and the ragnge of numbers each data type can represent.\
Each integer types has a corresponding wrapper class: _Byte_, _Short_, _Integer_, and _Long_. Each of these classes defines **MIN_VALUE** and **MAX_VALUE** constants that describe the range of the type.
The classes also define useful static methods, such as Byte.parseByte() and Integer.parseInt() for converting strings to integer types.

4) Real numbers in Java are represented by the _float_ and _double_ data types. The _float_ and _double_ primitive types have corresponding classes, named Float and Double. Each classes defines the following useful constants : MIN_VALUE, MAX_VALUE, NEGATIVE_INFINITY, POSITIVE_INFINITY, and NaN.

### Primitive type conversions

Java allows conversions between integer values and floating-point values. In addition, because every character corresponds to a number in the Unicode encoding, _char_ values can be converted to and from the integer and floating-point types. In fact, _boolean_ is the only primitive type that cannot be converted to or from another primitive type in Java.

- Widening conversion
    - It occurs when a value of one type is converted to a wider type.
- Narrowing conversion
    - It occurs when a value is converted to a type that is not wider than it is.\
    Narrowing conversion is not always safe. It is reasonable to convert the integer value 13 to a _byte_ but it is not reasonable to convert 13000 to a _byte_. Because _byte_ can hold only numbers between -128 and 127.

## Reference Types

Reference types hold references to objects and provide a means to access those objects stored somewhere in memory. The memory locations are irrelevant to programmers. All referecne types are a subclass of type _java.lang.Object_.

### Five Java reference types
1. Annotation
    - it proides a way to associate metadata (data about data) with program elements.
2. Array
    - it provides a fixed-size data structure that stores data elements of the same type.
3. Class
    - it is designed to provide _inheritance_, _polymorphism_, and _encapsulation_.
    - it usually models somehting in the real world and consists of a set of values that holds data and a set of methods that operates on the data.
4. Enumeration
    - it is a referece for a set of objects that represents a related set of choices.
5. Interface
    - it provides a public API and is **implemented** by Java classes.

### Comparing Reference types to Primitive types
- There are unlimited number of reference types as they are defined by programmer. But primitive types has only 8 known types : boolean, char, byte, short, int, long, float and double
- Memory stores a reference to the **reference data**. But memory stores actual **data held by the primitive type**.
- When a reference type is assigned to another reference type, both will point to the same object. But when a value of a primitive type is assigned to another variable of the same type, a copy is made.
- When an object is passed into a method, the called method can change the contents of the object passed to it but not the address of the object. But when a primitive is passed into a method, only a copy of the primitive is passed. The called method does not have access to the original primitive value and therefore cannot chage it. The called method can change the copied value.

## Comparing Objects
### == operator (equality of reference)
== compares references, not actual objects. It means == tests whether two references refer to the same object; it does not test whether two objects have the same content.

### equals() (equality of object)
equals() method : distinguish two distinct objects that have the same content.

### Default Values
A default values are the values assigned to instance variables in Java.
Instance variables have a default value of _null_. _null_ references nothing.

## Literals

### String Literals
The String class represents text as a string of characters. Because programs usually communicate with their users through the written word, the ability to manipulate strings of text is quite important in any programming language.

Because strings are such a fundamental data type, Java allows us to include text literally in programs by placing it between double-quote(") characters.

### Type Literals
Class is one of the special object literal syntax.
Instances of the Class represents a Java data type, and contain metadata about the type taht is referre to.
To include a Class object literally in a Java program, follow the name of any type with .class.

## Arrays
An array is a special kind of object that holds zero or more primitive values or references.
These values are held in the elements of the array, which are unnamed variables referred to by their position or index.

Array types are reference types, just as classes are.
Instances of arrays are objects, just as the instances of a class are.

Unlike classes, array types do not have to be defined. Simply place square brackets after the element type.
> Example\
byte b; &nbsp; &nbsp; // byte is a primitive type\
byte[] arrayOfBytes; &nbsp; &nbsp; // byte[] is an array of byte values\
byte[][] arrayOfArrayOfBytes &nbsp; &nbsp; // byte[][] is an array of of byte[]\
String[] points; &nbsp; &nbsp; // String[] is an array of strings

### Creating and Initializing **Arrays**
To create an array value in Java, you use the _new_ keyword just as do to create object.

> // Create a new array to hold 1024 bytes\
byte[] buffer = new byte[1024];\
// Create an array of 50 references to strings\
String[] lines = new String[50];

When you create an array with this syntax, each of the array elements is automatically initialized to the same default value that is used for the fields of a class: false for boolean elements, \u0000 for char elements, 0 for integer elements, 0.0 for floating-point elemetns, and null for elements of reference type.

Initialize Arrays:
> String[] greetings = new String[] {"Hello", "Hi", "HEY"};\
int[] smallPrimes = new int[] {2,3,5,7};

Syntax allows arrays to be created, initialized and used without ever being assigned to a variable.

Array literals are created and initailized when the program is run, not when the program is compiled. 

### Copying Arrays
All array types implements the _Cloneable_ interface, and array can be copied by invoking its _clone()_.
The _clone()_ makes a shallow copy. If the element type of the array is a reference type, only the references are copied, not the referenced objects themselves.\
Addtionally, JVM supports _System.arraycopy()_ method which is designed to do simply copy eleemetns from one existing array to another existing array.