package Collections;

import java.util.Scanner;
import java.util.TreeSet;

class University implements Comparable<University> {
    String name;
    int age;
    double gpa;

    University(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String toString() {
        return String.format("%s %d %.2f", name, age, gpa);
    }

    @Override
    public int compareTo(University o) {
        if (this.gpa != o.gpa) {
            return Double.compare(o.gpa, this.gpa);
        } else if (this.age != o.age) {
            return Integer.compare(this.age, o.age);
        } else {
            return this.name.compareTo(o.name);
        }
    }
}

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<University> set = new TreeSet<University>();
        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");
            int age = Integer.parseInt(s[1]);
            float gpa = Float.parseFloat(s[2]);
            University u = new University(s[0], age, gpa);
            set.add(u);
        }
        for (University university : set) {
            System.out.println(university);
        }
    }

}
