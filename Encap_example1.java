
import java.util.*;

class Customer12 {
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

public class Encap_example1 {
    public static void main(String[] ars) {
        Customer12 c = new Customer12();
        Scanner sc = new Scanner(System.in);
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
        c.setCustomerDetails(id, name, email, phone, pasword);

        System.out.println("Enter Password to see details:");
        String pas = sc.nextLine();
        if (pas.equals(pasword)) {
            System.out.println(c.getcId());
            System.out.println(c.getcName());
            System.out.println(c.getcEmail());
            System.out.println(c.getPhone());
            // System.out.println(c.getPassword());
        } else {
            System.out.println("Wrong Password!");
        }
    }
}
