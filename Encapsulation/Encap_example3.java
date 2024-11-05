package Encapsulation;

import java.util.*;

class Customer2 {
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

    public int getId() {
        return cId;
    }

    public String getName() {
        return cName;
    }

    public String getEmail() {
        return cEmail;
    }

    public long getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

}

public class Encap_example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Customer2[] f = new Customer2[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details:(Comma seperated):");
            String[] details = sc.nextLine().split(",");
            int id = Integer.parseInt(details[0]);
            String name = details[1];
            String email = details[2];
            long phone = Long.parseLong(details[3]);
            String password = details[4];
            Customer2 e = new Customer2();
            e.setCustomerDetails(id, name, email, phone, password);
            f[i] = e;

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + f[i].getId());
            System.out.println("NAME:  " + f[i].getName());
            System.out.println("EMAIL:  " + f[i].getEmail());
            System.out.println("Phone:  " + f[i].getPhone());
            System.out.println("Password:  " + f[i].getPassword());
        }

    }
}
