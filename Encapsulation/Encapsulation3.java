package Encapsulation;

import java.util.Scanner;

class Employee11 {
    private int id;
    private String name;
    private String email;
    private String address;

    public Employee11() {

    }

    public Employee11(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of details:");
        int num = sc.nextInt();
        sc.nextLine();
        Employee11[] employees = new Employee11[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for employee " + (i + 1) + " (Comma separated):");
            String[] details = sc.nextLine().split(",");
            int id = Integer.parseInt(details[0]);
            String name = details[1];
            String email = details[2];
            String address = details[3];
            employees[i] = new Employee11(id, name, email, address);
        }

        sc.close();

        System.out.println("Employee details:");
        for (int i = 0; i < num; i++) {
            Employee11 e = employees[i];
            System.out.println("ID: " + e.getId());
            System.out.println("Name: " + e.getName());
            System.out.println("Email: " + e.getEmail());
            System.out.println("Address: " + e.getAddress());
            System.out.println();
        }
    }
}
