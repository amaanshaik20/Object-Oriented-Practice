package Encapsulation;

import java.util.*;

class Restaurant4 {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;

    Restaurant4() {

    }

    Restaurant4(int id, String name, String email, String phone, String address) {
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

public class Encap_example10 {
    public static void main(String[] args) {

        Restaurant4 r = new Restaurant4();
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
            String[] array = name.split(" ");
            String first_name = array[0].toLowerCase();
            System.out.println("Enter Email: ");
            String email = sc.nextLine();
            if (email.endsWith("@" + first_name + ".com")) {
                r.setEmail(email);
            } else {
                System.out.println("Incorrect Email!");
                continue;
            }
            System.out.println("Enter Phone: ");
            String phone = sc.nextLine();
            if ((phone.startsWith("9") || phone.startsWith("8") || phone.startsWith("7") || phone.startsWith("6"))
                    && phone.length() == 10) {
                r.setPhone(phone);

            } else {
                System.out.println("Incorrect Number!");
                continue;
            }

            System.out.println("Enter Address: ");
            String address = sc.nextLine();
            r.setAddress(address);
            k = 1;
        }
        System.out.println();
        System.out.println("The Id Of Restaurant is: " + r.getId());
        System.out.println("The Name Of Restaurant is: " + r.getName());
        System.out.println("The Email Of Restaurant is: " + r.getEmail());
        System.out.println("The Mobile Number Of Restaurant is: " + r.getPhone());
        System.out.println("The Address Of Restaurant is: " + r.getAddress());

    }

}
