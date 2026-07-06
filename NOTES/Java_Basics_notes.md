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