package Encapsulation;

import java.util.Scanner;

class Restaurant {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;

    public Restaurant() {

    }

    public Restaurant(int id, String name, String email, String phone, String address) {
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

public class Encap_example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("ENTER NAME: ");
        String name = sc.nextLine();
        System.out.println("ENTER EMAIL: ");
        String email = sc.nextLine();
        System.out.println("ENTER PHONE: ");
        String phone = sc.nextLine();
        System.out.println("ENTER ADDRESS: ");
        String address = sc.nextLine();

        Restaurant r = new Restaurant(id, name, email, phone, address);

        System.out.println(r.getId();
        System.out.println(r.getName());
        System.out.println(r.getEmail());
        System.out.println(r.getPhone());
        System.out.println(r.getAddress());

    }
}
