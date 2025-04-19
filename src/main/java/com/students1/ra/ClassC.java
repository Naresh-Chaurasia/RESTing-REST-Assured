package com.students1.ra;

// ClassC.java
public class ClassC {
    public ClassC methodC() {
        System.out.println("Method C in ClassC is called.");
        // Returning itself
        return new ClassC();
    }
}