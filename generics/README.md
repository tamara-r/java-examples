# Generics

## Overview

- generics mean parameterized types
- the Object is the superclass of all other classes, and Object reference can refer to any object. These features lack type safety
- generics add that type of safety feature
- JDK 5.0 introduced Java Generics with the aim of reducing bugs and adding an extra layer of abstraction over types
- generic type is a generic class or interface that is parameterized over types
- generics allow us to create a single class, interface, and method that can be used with different types of data

## Advantage of Java Generics

- type - safety
- type casting is not required
- compile - time checking
- code reuse

## Type Parameter Naming Conventions

- by convention, type parameter names are single, uppercase letters
- the most commonly used type parameter names are:
  - E - Element (used extensively by the Java Collections Framework)
  - K - Key
  - N - Number
  - T - Type
  - V - Value
  - S,U,V etc. - 2nd, 3rd, 4th types
  
## Wildcards

- the question mark (?) is known as the wildcard in generic programming 
- it represents an unknown type
- the wildcard can be used in a variety of situations such as the type of parameter, field, or local variable

### Wildcard Types

1. Upper Bounded Wildcards
2. Lower Bounded Wildcards
3. Unbounded Wildcards

`Upper Bounded Wildcards` 
- the wildcard that relaxes the restriction of the variable type
- it is expressed using the wildcard character (‘?’), followed by the extends keyword, followed by its upper bound 
- `<? extends A>` means that are instances of the class A, or subclasses of A

`Lower Bounded Wildcards`
- to widen the use of the type of variable
- it is expressed using the wildcard character (‘?’), followed by the super keyword, followed by its lower bound
- `<? super A>` means that is typed to either the A class, or a superclass of A

`Unbounded Wildcards`
- wildcard type is specified using the wildcard character (?)
- it means an unknown type 
