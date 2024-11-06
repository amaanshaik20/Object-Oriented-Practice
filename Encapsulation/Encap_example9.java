package Encapsulation;

import java.util.*;

class Restaurant3 {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;

    Restaurant3() {

    }

    Restaurant3(int id, String name, String email, String phone, String address) {
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

public class Encap_example9 {
    public static void main(String[] args) {

        Restaurant3 r = new Restaurant3();
        int k = 0;
        while (k == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID: ");
            int cid = sc.nextInt();
            sc.nextLine();
            r.setId(cid);
            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            r.setName(name);
            System.out.println("Enter Email: ");
            String email = sc.nextLine();
            if (email.endsWith("@" + name + ".com")) {
                r.setEmail(email);
            } else {
                System.out.println("Incorrect Email!");
                continue;
            }
            System.out.println("Enter Phone: ");
            String phone = sc.nextLine();
            r.setPhone(phone);
            System.out.println("Enter Address: ");
            String address = sc.nextLine();
            r.setAddress(address);
            k = 1;
        }
        System.out.println("THE DETAILS ARE:");
        System.out.println();

        System.out.println("The id is " + r.getId());
        System.out.println("The Name Of Restaurant is " + r.getName());
        System.out.println("The Email of Employee is " + r.getEmail());
        System.out.println("The Phone Number of Employee is" + r.getPhone());
        System.out.println("The Address of Employee is " + r.getAddress());

    }

}
