# Multi-threading

## Overview

- Multithreading in Java is a process of executing multiple threads simultaneously.
- A thread is a lightweight sub-process, the smallest unit of processing. 
- Multiprocessing and multithreading, both are used to achieve multitasking.
- Threads exist in several states:
  - New - When we create an instance of Thread class, a thread is in a new state. 
  - Running - The Java thread is in running state. 
  - Suspended - A running thread can be suspended, which temporarily suspends its activity. A suspended thread can then be resumed, allowing it to pick up where it left off. 
  - Blocked - A Java thread can be blocked when waiting for a resource. 
  - Terminated - A thread can be terminated, which halts its execution immediately at any given time. Once a thread is terminated, it cannot be resumed.
- There are two ways to create a thread in Java:
  1) By extending Thread class (Example 1).
  2) By implementing Runnable interface (Example 2).

### Methods 

- In both, Example 1 and Example 2, used methods are following:
  - getName(): tt is used for obtaining a thread’s name 
  - getId(): it is used for obtaining a thread’s id
  - getState(): it is used for obtaining a thread’s state
  - start(): start a thread by calling its run() method
  - getPriority(): obtain a thread’s priority 
  - setPriority(): sets a thread’s priority
  - sleep(): suspend a thread for a period of time
  - isAlive(): determine if a thread is still running 
  - join(): wait for a thread to terminate
    
    