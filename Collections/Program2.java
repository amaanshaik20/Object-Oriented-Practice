package Collections;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        lst.add(100);
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);
        Object[] a = lst.toArray();
        // System.out.println(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
