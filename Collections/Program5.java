package Collections;

import java.util.Scanner;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    @Override
    public int compareTo(Student o) {
        if (this.age != o.age) {
            return Integer.compare(this.age, o.age);
        } else if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        } else {
            return Integer.compare(this.id, o.id);
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<Student> set = new TreeSet<Student>();
        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");
            int id = Integer.parseInt(s[0]);
            String name = s[1];
            int age = Integer.parseInt(s[2]);
            Student student = new Student(id, name, age);
            set.add(student);
        }
        for (Student student : set) {
            System.out.println(student);
        }

    }
}
