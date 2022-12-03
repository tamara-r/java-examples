# Reflection API

## Overview

- used to examine or modify the behavior of methods, classes, and interfaces at runtime
- The java.lang and java.lang.reflect packages provide classes for java reflection

- There are 3 ways to get the instance of Class class. They are as follows:
    - forName() method of Class class
    - getClass() method of Object class
    - the .class syntax


## java.lang.reflect package

`Classes`

- AccessibleObject - class is the base class for Field, Method and Constructor objects.
- Array	- provides static methods to dynamically create and access Java arrays.
- Constructor<T> - provides information about, and access to, a single constructor for a class.
- Executable - shared superclass for the common functionality of Method and Constructor.
- Field	- provides information about, and dynamic access to, a single field of a class or an interface.
- Method - provides information about, and access to, a single method on a class or interface.
- Modifier - provides static methods and constants to decode class and member access modifiers.
- Parameter	- provides information about method parameters.
- Proxy	- provides static methods for creating dynamic proxy classes and instances, and it is also the superclass of all dynamic proxy classes created by those methods.
- ReflectPermission	- legacy security code

`Interfaces`

- AnnotatedElement	- represents an annotated element of the program currently running in this VM.
- GenericArrayType	- represents an array type whose component type is either a parameterized type or a type variable.
- GenericDeclaration - a common interface for all entities that declare type variables.
- InvocationHandler	- interface implemented by the invocation handler of a proxy instance.
- Member - interface that reflects identifying information about a single member (a field or a method) or a constructor.
- ParameterizedType	- represents a parameterized type such as Collection<String>.
- Type - common superinterface for all types in the Java programming language.
- TypeVariable<D extends GenericDeclaration> - the common superinterface for type variables of kinds.
- WildcardType - represents a wildcard type expression, such as ?, ? extends Number, or ? super Integer.

## java.lang.Class

- The java.lang.Class class performs mainly two tasks:
  - provides methods to get the metadata of a class at run time.
  - provides methods to examine and change the run time behavior of a class.

- commonly used Methods in java.lang.Class
  - public String getName() - returns the name of the class.
  - public Class getSuperclass() - returnsthe super class reference
  - public Class[] getInterfaces() - returns an array of interfaces implemented by the specified class
  - public int getModifiers() - returns an integer value representing the modifiers of the specified class which needs to be passed as a parameter to “public static String toString (int i )” method which returns the access specifier for the given class.
  - public boolean isInterface() - checks if it is interface. 
  - public boolean isArray() - checks if it is array. 
  - public boolean isPrimitive() - checks if it is primitive.

