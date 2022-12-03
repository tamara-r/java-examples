# Lambda Expressions

## Overview

- Java Lambda Expressions are particular code segments that behave like a regular method. 
- They are designed to accept a set of parameters as input and return a value as an output. 
- Unlike methods, a Lambda Expression does not mandatory require a specific name.
- Lambda expressions are just like functions and they accept parameters just like functions.
- Lambda expressions implement the only abstract function and therefore implement functional interfaces.
- In other words, lambda expressions can only be used to implement functional interfaces.

### Functional interfaces

- A functional interface is an interface that contains only one abstract method. 
- They can have only one functionality to exhibit.
- There is no need to use the abstract keyword as it is optional to use the abstract keyword because, by default, the method defined inside the interface is abstract only.
- The functional Interface is represented or identified, through its unique Functional Interface annotation.
- `@FunctionalInterface` annotation 
  - Used to ensure that the functional interface can’t have more than one abstract method. 
  - In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message. 
  - However, it is not mandatory to use this annotation.
- Apart from custom functional interfaces, in Java, there are also built-in functional interfaces.

- `Example 1` demonstrates Predicate interface
  - The Predicate interface has only one single method test(). 
  - It may be true or false depending on the values of its variables.
- `Example 2` demonstrates custom functional interfaces