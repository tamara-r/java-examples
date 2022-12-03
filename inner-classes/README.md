# Inner Classes (Nested Classes)

## Overview

- inner class or nested class is a class that is declared inside the class or interface
- used to logically group classes and interfaces in one place to be more readable and maintainable
- there are three advantages of inner classes in Java:
  - nested classes represent a particular type of relationship that is it can access all the members (data members and methods) of the outer class, including private
  - nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only
  - Code Optimization -  it requires less code to write

## Types of Nested classes

- two types of nested classes:
  - non-static nested classes - also known as inner classes
  - static nested classes

`Non-static nested class (inner class)`
  - Member inner class 
    - class created within class and outside method
    - can access any private instance variable of the outer class
  - Anonymous inner class 
    - declared without any name
    - can be created in two ways - as a subclass of the specified type or as an implementer of the specified interface
  - Local inner class 
    - class created within the method of an outer class
    - cannot use a local variable of the outer method until that local variable is not declared as final

`Static nested class`
- static class is a class that is created inside a class
- technically not inner class
- more like a static member of outer class
- it can access static data members of the outer class, including private
- cannot access non-static data members or methods
