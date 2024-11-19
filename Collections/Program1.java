package Collections;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);

        list.add(1, 150);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.set(1, 220);
        System.out.println(list);

        System.out.println(list.get(2));
        list1.addAll(list);
        System.out.println(list1);
        list.retainAll(list1);
        System.out.println(list);

    }
}
