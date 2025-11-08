# Variables and Data Types — Variable.java

## What this program demonstrates

`Variable.java` is a tiny Java program that demonstrates basic variable declaration, assignment, and value copying. It shows how primitive variables behave when assigned and how reassignment affects values.

## Key concepts covered

- Variables: Named storage locations for data. In Java every variable has a type.
- Primitive types vs. reference types:
  - `int` is a primitive numeric type (stores value directly).
  - `String` is a reference type (object) in Java; it refers to an instance of the `String` class.
- Assignment and copying:
  - Assigning one primitive variable to another copies the value. Subsequent changes to the source do not affect the copy.
  - Reassigning a variable simply updates which value is stored in that variable.
- Immutability (for `String`): `String` objects are immutable; assigning a new string creates a new object reference.

## The program (source)

```java
public class Variable{
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        String name = "Eswar";
        System.out.println(a);
        System.out.println(b);
        a = 50;
        b = a;
        System.out.println(a);
        System.out.println(b);
    }
}
```

### Line-by-line explanation

1. `int a = 10;` — declares an integer variable `a` and initializes it with `10`.
2. `int b = 5;` — declares an integer variable `b` and initializes it with `5`.
3. `String name = "Eswar";` — declares a `String` reference named `name` and points it to the string literal `"Eswar"`.
4. `System.out.println(a);` — prints the current value of `a` (10).
5. `System.out.println(b);` — prints the current value of `b` (5).
6. `a = 50;` — reassigns `a` to the new value `50`.
7. `b = a;` — copies the value of `a` into `b`. Since `int` is primitive, this is a value copy; `b` becomes `50`.
8. `System.out.println(a);` — prints the updated value of `a` (50).
9. `System.out.println(b);` — prints the value of `b` (50).

## Expected output

When you compile and run `Variable.java`, the program prints:

```
10
5
50
50
```

Explanation: the first two lines show the initial values. After changing `a` to `50` and copying it into `b`, both print as `50`.

## Contract (inputs/outputs)

- Inputs: None (the program uses hard-coded values).
- Output: Four lines printed to standard output, as shown above.
- Error modes: None expected for this simple program.

## Edge cases and notes

- If you change `a` after `b = a;`, `b` will not change because `b` contains a copy of the primitive value.
- If `name` were used and mutated (strings are immutable), reassigning `name` would point it to a new `String` instance rather than modifying the old one.

## How to compile and run (Windows PowerShell)

1. Open PowerShell and change to the directory containing `Variable.java`:

```powershell
cd "d:\Alpha DSA Coding Solutions Eswar\VariablesAndDatatypes"
```

2. Compile:

```powershell
javac Variable.java
```

3. Run:

```powershell
java Variable
```

## Suggestions for extensions (good follow-ups for learners)

- Add more types: try `double`, `char`, `boolean`, and observe their default behaviors.
- Prompt the user for input (use `Scanner`) to practice reading values at runtime.
- Add comments to every line to make the purpose explicit for beginners.
- Write unit tests (using JUnit) for methods that perform computations (if you refactor code into methods).

## Why this matters

Understanding variables and data types is fundamental to programming. This small program provides clear, observable behavior showing how values are stored, updated, and copied in Java. It helps build intuition that leads to correct use of primitive types and references in larger programs.

---
