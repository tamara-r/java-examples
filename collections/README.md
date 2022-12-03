# Collections

## Overview

- framework provides a set of interfaces and classes to implement various data structures and algorithms
- means a single unit of objects
- the Collection interface (java.util.Collection), Map interface (java.util.Map) and Iterator interface (java.util.Iterator) are the main root interfaces of Java Collection Framework
- interfaces:  Set, List, Queue, Deque
- classes: ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet

## Example 1 - HashSet

- used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface
- important points about Java HashSet class are:
  - HashSet stores the elements by using a mechanism called hashing.
  - HashSet contains unique elements only.
  - HashSet allows null value.
  - HashSet class is non synchronized.
  - HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
  - HashSet is the best approach for search operations

## Example 2 - LinkedList

- implements the List interface
- this class is an implementation of the LinkedList data structure which is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part
- the elements are linked using pointers and addresses
- each element is known as a node