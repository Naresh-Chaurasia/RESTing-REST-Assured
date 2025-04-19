package com.students1.ra;

// ClassA.java
public class ClassA {
    public ClassB methodA() {
        System.out.println("Method A in ClassA is called.");
        // Returning an instance of ClassB
        return new ClassB();
    }
}