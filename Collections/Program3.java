package Collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            int c = lhm.getOrDefault(a[i], 0);
            lhm.put(a[i], c + 1);
        }
        System.out.println(lhm);
        Set<Integer> keys = lhm.keySet();
        System.out.println(keys);
        for (Integer key : keys) {
            int value = lhm.get(key);
            System.out.println(key + " - " + value);
        }

    }
}
