# Annotations

## Overview

- Metadata (data about data) for program source code
- Begin with ‘@’
- Provide additional information about the program to the compiler
- Do not alter the execution of the program
- dDifferent from comments since they can affect how the program is treated by the compiler

## Annotation types

1. Predefined annotations 
2. Meta-annotations
3. Custom annotations

### 1. Predefined annotations

 - `@Deprecated` - marker annotation that indicates the element (class, method, field, etc) is deprecated and has been replaced by a newer element
 - `@Override` - specifies that a method of a subclass overrides the method of the superclass with the same method name
 - `@SuppressWarnings` - instructs the compiler to suppress warnings that are generated while the program executes.
 - `@SafeVarargs` - asserts that the annotated method or constructor does not perform unsafe operations on its varargs
 - `@FunctionalInterface` - indicates that the type declaration on which it is used is a functional interface

### 2. Meta-annotations

- `@Retention` - specifies the level up to which the annotation will be available
  - `RetentionPolicy.SOURCE` - the annotation is available only at the source level and is ignored by the compiler
  - `RetentionPolicy.CLASS` - the annotation is available to the compiler at compile-time, but is ignored by the JVM
  - `RetentionPolicy.RUNTIME` - the annotation is available to the JVM
- `@Documented` - used to include custom annotation in the Javadoc documentation
- `@Target` - restrict an annotation to be applied to specific Element Types
  - `ElementType` can have one of the following types: 
    - ElementType.ANNOTATION_TYPE
    - ElementType.CONSTRUCTOR
    - ElementType.FIELD
    - ElementType.LOCAL_VARIABLE
    - ElementType.METHOD
    - ElementType.PACKAGE
    - ElementType.PARAMETER
    - ElementType.TYPE 	(any element of class) 
- `@Inherited` - to inherit an annotation from a superclass to a subclass
- `@Repeatable` - can be applied multiple times to the same declaration

### 3. Custom annotations

- can be created by using @interface followed by the annotation name
- can have elements that look like methods but they do not have an implementation
- default value is optional
- parameters cannot have a null value

