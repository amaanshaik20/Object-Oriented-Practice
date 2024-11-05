package Encapsulation;

import java.util.Scanner;

class Customer1 {
    private int cId;
    private String cName;
    private String cEmail;
    private long phone;
    private String password;

    public void setCustomerDetails(int cId, String cName, String cEmail, long phone, String password) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.phone = phone;
        this.password = password;
    }

    public int getcId() {
        return cId;
    }

    public String getPassword() {
        return password;
    }

    public long getPhone() {
        return phone;
    }

    public String getcEmail() {
        return cEmail;
    }

    public String getcName() {
        return cName;
    }
}

public class Encap_example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        System.out.println();
        Customer1[] array = new Customer1[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            System.out.println("Enter phone:");
            long phone = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter Password: ");
            String pasword = sc.nextLine();
            Customer1 c = new Customer1();
            c.setCustomerDetails(id, name, email, phone, pasword);
            array[i] = c;
        }
        System.out.println("The Customer Details are:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i].getcId());
            System.out.println(array[i].getcName());
            System.out.println(array[i].getcEmail());
            System.out.println(array[i].getPhone());
            // System.out.println(c.getPassword());
        }

    }

}
