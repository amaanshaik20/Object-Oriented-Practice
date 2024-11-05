package Encapsulation;

import java.util.*;

class Restaurant2 {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;

    Restaurant2() {

    }

    Restaurant2(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public void setCustomerDetails(int id, String name, String email, String phone, String address) {
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

public class Encap_example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Restaurants: ");
        int n = sc.nextInt();
        sc.nextLine();
        Restaurant2[] f = new Restaurant2[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details:(Comma seperated):");
            String[] details = sc.nextLine().split(",");
            int id = Integer.parseInt(details[0]);
            String name = details[1];
            String email = details[2];
            String phone = details[3];
            String adddress = details[4];
            // Restaurant2 e = new Restaurant2();
            Restaurant2 r = new Restaurant2(id, name, email, phone, adddress);
            f[i] = r;

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + f[i].getId());
            System.out.println("NAME:  " + f[i].getName());
            System.out.println("EMAIL:  " + f[i].getEmail());
            System.out.println("Phone:  " + f[i].getPhone());
            System.out.println("Password:  " + f[i].getAddress());
        }

    }

}
