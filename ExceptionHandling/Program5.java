package ExceptionHandling;

// Errors are also two types.

// compile time, Run time
// compile time errors occur when there is faulty syntax or infinite recursion
// run time errors occur when there is lack of system resourses
// some of run time errors are OutOfMemoryError, stackOverflowError.

public class Program5 {
    static void runTimeError2() {
        runTimeError2();
    }

    static void runTimeError1() {
        int a[] = new int[Integer.MAX_VALUE];
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        // runTimeError1();
        // runTimeError2();
    }
}
