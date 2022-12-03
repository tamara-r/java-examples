# I/O Streams

## Overview

- In Java, streams are the sequence of data that are read from the source and written to the destination.
- An input stream is used to read data from the source. 
- An output stream is used to write data to the destination.
- Depending upon the data a stream holds, streams can be classified into:
  - Byte Stream 
  - Character Stream

### Byte Stream

- Byte stream is used to read and write a single byte (8 bits) of data.
- All byte stream classes are derived from base abstract classes called InputStream and OutputStream.
- The `InputStream` class 
  - part of the java.io package 
  - an abstract superclass that represents an input stream of bytes. 
  - since it is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.
  - some subclasses are:
    - FileInputStream
    - ByteArrayInputStream 
    - ObjectInputStream

- The `OutputStream` class 
  - part of the java.io package
  - an abstract superclass that represents an output stream of bytes. 
  - since OutputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to write data.
  - some subclasses are:
    - FileOutputStream
    - ByteArrayOutputStream
    - ObjectOutputStream


### Character Stream

- Character stream is used to read and write a single character of data.
- All the character stream classes are derived from base abstract classes Reader and Writer.
- The `Reader` class
  - part of the java.io package 
  - an abstract superclass that represents a stream of characters. 
  - since Reader is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.
  - some subclasses are:
    - BufferedReader 
    - InputStreamReader 
    - FileReader 
    - StringReader
- The `Writer` class
    - part of the java.io package
    - an abstract superclass that represents a stream of characters.
    - since Writer is an abstract class, it is not useful by itself. However, its subclasses can be used to write data.
    - some subclasses are:
        - BufferedWriter
        - InputStreamWriter
        - FileWriter
        - StringWriter
        
- `Example 1` and `Example 2`
  - demonstrate the usage of BufferedReader and BufferedWriter classes and its methods
  