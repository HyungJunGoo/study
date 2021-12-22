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
