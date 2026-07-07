
# Java Basics

## Boilerplate Code

### Definition

Boilerplate code is the basic structure required before writing a Java program.

### Syntax

```java
public class Main {

    public static void main(String[] args) {

        // Your code here

    }

}
```

> Execution always starts from the `main()` method.

---

## Data Types

### Definition

A data type specifies what kind of value a variable can store.

### Types of Data Types

| Primitive | Non-Primitive |
|------------|---------------|
| byte | String |
| short | Array |
| int | Class |
| long | Object |
| float | Interface |
| double | |
| char | |
| boolean | |

### Primitive Data Types

| Data Type | Size | Example |
|-----------|------|---------|
| byte | 1 byte | `byte a = 10;` |
| short | 2 bytes | `short b = 100;` |
| int | 4 bytes | `int age = 20;` |
| long | 8 bytes | `long num = 100L;` |
| float | 4 bytes | `float pi = 3.14f;` |
| double | 8 bytes | `double d = 3.14;` |
| char | 2 bytes | `char ch = 'A';` |
| boolean | true/false | `boolean isJava = true;` |

### Primitive vs Non-Primitive

| Primitive | Non-Primitive |
|------------|---------------|
| Stores value | Stores reference |
| Fixed size | Size varies |
| Built into Java | Created using classes |

---

## Strongly Typed Language

### Definition

Every variable must have a data type.

| Language | Type |
|----------|------|
| Java | Statically Typed |
| C++ | Statically Typed |
| Python | Dynamically Typed |

Example

```java
int age = 20;
double salary = 45000.50;
String name = "John";
```

---

## Comments

### Single-Line Comment

```java
// This is a comment
```

### Multi-Line Comment

```java
/*
This is a
multi-line comment.
*/
```

---
# Input in Java

## What is Input?

Input is the data entered by the user during program execution.

## Scanner Class

The `Scanner` class is used to take input from the user.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

## Scanner Methods

| Method | Reads |
|---------|-------|
| `next()` | One word |
| `nextLine()` | Complete line |
| `nextInt()` | Integer |
| `nextFloat()` | Float |
| `nextDouble()` | Double |
| `nextLong()` | Long |
| `nextShort()` | Short |
| `nextByte()` | Byte |
| `nextBoolean()` | Boolean |

## Syntax

```java
dataType variable = sc.method();
```

Example:

```java
int age = sc.nextInt();
String name = sc.nextLine();
double salary = sc.nextDouble();
```

## Important Points

- `next()` reads only one word.
- `nextLine()` reads the entire line.
- Use the method based on the required data type.
- Close the scanner using `sc.close();`

---
# Type Conversion , Casting and Promotion

## 1. Type Conversion (Implicit / Widening)

Automatically converts a **smaller** data type into a **larger** data type.

### Conditions

- Compatible data types.
- Destination type > Source type.

### Order

```text
byte → short → int → long → float → double
              ↘
              char
```

### Example

```java
int a = 25;
double b = a;
```

Output

```text
25.0
```

## 2. Type Casting (Explicit / Narrowing)

Manually converts a **larger** data type into a **smaller** data type.

### Syntax

```java
smallerType variable = (smallerType) value;
```

### Example

```java
float marks = 99.99f;
int result = (int) marks;
```

Output

```text
99
```

> **Note:** May cause **loss of data (Lossy Conversion).**

## 3. Type Promotion in Expressions

Java automatically promotes operands to a common larger data type while evaluating an expression.

### Rules

- `byte`, `short`, `char` → `int`
- If one operand is `long` → Result is `long`
- If one operand is `float` → Result is `float`
- If one operand is `double` → Result is `double`

### Example

```java
char a = 'a';
char b = 'b';

System.out.println(b - a);
```

Output

```text
1
```



# Java Program Execution

## JDK, JRE and JVM

| Component | Full Form | Purpose |
|-----------|-----------|---------|
| **JDK** | Java Development Kit | Used to develop, compile and run Java programs. |
| **JRE** | Java Runtime Environment | Provides the environment to run Java programs. |
| **JVM** | Java Virtual Machine | Executes the Java bytecode. |

### Relationship

```text
+------------------------------------------+
|                  JDK                     |
|                                          |
|   +------------------------------+       |
|   |            JRE               |       |
|   |                              |       |
|   |   +----------------------+   |       |
|   |   |        JVM           |   |       |
|   |   +----------------------+   |       |
|   |      + Java Libraries        |       |
|   +------------------------------+       |
|      + Development Tools                |
+------------------------------------------+
```

## Java Program Execution

```text
Source Code (.java)
        │
        ▼
   Java Compiler (javac)
        │
        ▼
   Bytecode (.class)
        │
        ▼
 Java Virtual Machine (JVM)
        │
        ▼
 Native Machine Code
        │
        ▼
      Output
```

### Steps

1. Write the program (`.java`).
2. Compile using **javac**.
3. Compiler creates **Bytecode (.class)**.
4. JVM converts bytecode to machine code.
5. Program executes and produces output.

## Why is Java Portable?

Java is called **Portable** because the compiled **bytecode (.class)** can run on any operating system that has a JVM.

**Write Once, Run Anywhere (WORA)**

Example:

```text
Windows  ─┐
Linux    ─┼──► Same .class file ► JVM ► Runs
macOS    ─┘
```

---

# Identifiers

## What are Identifiers?

Identifiers are the **names given to variables, methods, classes, objects, interfaces, etc.**

Example:

```java
int age = 20;
String name = "Tony";
```

`age` and `name` are identifiers.

## Rules for Identifiers

| Rule | Example |
|------|---------|
| Must begin with a letter, `_` or `$` | `age`, `_count`, `$price` |
| Cannot begin with a number | ❌ `1age` |
| Cannot contain spaces | ❌ `my age` |
| Cannot use Java keywords | ❌ `int`, `class` |
| Can contain letters, digits, `_`, `$` | `student1`, `_id`, `$salary` |
| Java is case-sensitive | `Age` and `age` are different |

## Valid Identifiers

```java
age
studentName
_marks
$salary
count1
```

## Invalid Identifiers

```java
1age
student name
class
int
my-name
```





# Operators in Java

## Types of Operators

- Arithmetic Operators
- Relational Operators
- Logical Operators
- Bitwise Operators
- Assignment Operators

## Arithmetic Operators

Arithmetic operators perform mathematical operations.

### Binary Operators

| Operator | Meaning |
|----------|---------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |

### Unary Operators

| Operator | Meaning |
|----------|---------|
| `++` | Increment |
| `--` | Decrement |

### Pre vs Post Increment

| Pre Increment | Post Increment |
|---------------|----------------|
| `++a` | `a++` |
| Value increases **before** use | Value increases **after** use |

Example

```java
int a = 10;

System.out.println(++a);   // 11
System.out.println(a++);   // 11
System.out.println(a);     // 12
```

## Relational Operators

Used to compare two values.

| Operator | Meaning |
|----------|---------|
| `==` | Equal to |
| `!=` | Not Equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or Equal to |
| `<=` | Less than or Equal to |

> Returns `true` or `false`.

## Logical Operators

Used to combine multiple conditions.

| Operator | Meaning |
|----------|---------|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

Example

```java
int age = 20;

System.out.println(age >= 18 && age <= 25);
```


## Assignment Operators

Assignment operators are used to assign or update the value of a variable.

| Operator | Description | Example | Result |
|:--------:|-------------|---------|--------|
| `=` | Assign value | `a = 10` | `a = 10` |
| `+=` | Add and assign | `a += 5` | `a = a + 5` |
| `-=` | Subtract and assign | `a -= 5` | `a = a - 5` |
| `*=` | Multiply and assign | `a *= 5` | `a = a * 5` |
| `/=` | Divide and assign | `a /= 5` | `a = a / 5` |
| `%=` | Modulus and assign | `a %= 5` | `a = a % 5` |

## Operator Precedence & Associativity

| Operators | Precedence | Associativity |
|-----------|------------|---------------|
| Postfix Increment & Decrement | `++` `--` | Left → Right |
| Prefix Increment, Decrement & Unary | `++` `--` `+` `-` `~` `!` | Right → Left |
| Multiplicative | `*` `/` `%` | Left → Right |
| Additive | `+` `-` | Left → Right |
| Shift | `<<` `>>` `>>>` | Left → Right |
| Relational | `<` `>` `<=` `>=` `instanceof` | Left → Right |
| Equality | `==` `!=` | Left → Right |
| Bitwise AND | `&` | Left → Right |
| Bitwise XOR | `^` | Left → Right |
| Bitwise OR | `\|` | Left → Right |
| Logical AND | `&&` | Left → Right |
| Logical OR | `\|\|` | Left → Right |
| Ternary | `?:` | Right → Left |
| Assignment | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `\|=` `<<=` `>>=` `>>>=` | Right → Left |

### Note

- **Precedence** decides **which operator is evaluated first**.
- **Associativity** decides the **evaluation direction** when operators have the same precedence.



# Conditional Statements

## if

```java
if (condition) {
    // statements
}
```

## if...else

```java
if (condition) {
    // statements
} else {
    // statements
}
```

## else if

```java
if (condition1) {
    // statements
} else if (condition2) {
    // statements
} else {
    // statements
}
```

## Ternary Operator

```java
result = (condition) ? value1 : value2;
```

Example

```java
int max = (a > b) ? a : b;
```

## switch

```java
switch (expression) {

    case value1:
        // statements
        break;

    case value2:
        // statements
        break;

    ...

    default:
        // statements
}
```

# Java Loops - Syntax

---

## `for` Loop

```java
for (initialization; condition; update) {
    // code
}
```

---

## Enhanced `for` Loop (For-Each)

```java
for (DataType variable : collection) {
    // code
}
```

---

## `while` Loop

```java
while (condition) {
    // code
}
```

---

## `do-while` Loop

```java
do {
    // code
} while (condition);
```

---

## Infinite `for` Loop

```java
for (;;) {
    // code
}
```

---

## Infinite `while` Loop

```java
while (true) {
    // code
}
```

---

## Nested `for` Loop

```java
for (initialization; condition; update) {
    for (initialization; condition; update) {
        // code
    }
}
```

---

## Nested `while` Loop

```java
while (condition) {
    while (condition) {
        // code
    }
}
```

---

## Nested `do-while` Loop

```java
do {
    do {
        // code
    } while (condition);
} while (condition);
```

