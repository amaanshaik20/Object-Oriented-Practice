package Interfaces;

// we can write variables inside interface
// which are by default public, static and final.
interface Animals1 {
    int a = 50;

}

class Demo implements Animals1 {
    // a=20;
    // as a is final we cannot change its value
}

public class Rule10 {
    public static void main(String[] args) {
        System.out.println(Demo.a);
        // as a is static variable, a can be accessed through
        // class name.
        // and as a is public, this can be accessed from anywhere
        // in the same project.
    }
}

// rule 11
// an empty interface is called marker interface or tagged interface.
// inbuilt interface in java is serializable.
interface Ahmed {

}