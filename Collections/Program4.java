package Collections;

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
        University u1 = new University("amaan", 22, 9.50);
        University u2 = new University("mabi", 22, 9.50);
        University u3 = new University("hussain", 23, 9.82);
        University u4 = new University("manish", 19, 10.00);
        TreeSet<University> set = new TreeSet<University>();
        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        for (University university : set) {
            System.out.println(university);
        }
    }

}
