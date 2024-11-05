package Encapsulation;

import java.util.Scanner;

class Restaurant1 {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;

    public Restaurant1() {

    }

    public Restaurant1(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
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

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}

public class Encap_example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NO OF RESTAURANTS: ");
        int n = sc.nextInt();
        Restaurant1 arr[] = new Restaurant1[n];
        for (int i = 0; i < n; i++) {

            System.out.print("ENTER ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("ENTER NAME: ");
            String name = sc.nextLine();
            System.out.print("ENTER EMAIL: ");
            String email = sc.nextLine();
            System.out.print("ENTER PHONE: ");
            String phone = sc.nextLine();
            System.out.print("ENTER ADDRESS: ");
            String address = sc.nextLine();

            Restaurant1 r = new Restaurant1(id, name, email, phone, address);
            arr[i] = r;

        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getEmail());
            System.out.println(arr[i].getPhone());
            System.out.println(arr[i].getId());
            System.out.println(arr[i].getAddress());
        }

    }
}
