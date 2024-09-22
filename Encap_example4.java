import java.util.Scanner;

class Customer3 {
    private int cId;
    private String cName;
    private String cEmail;
    private long phone;
    private String password;

    Customer3() {

    }

    Customer3(int cId, String cName, String cEmail, long phone, String password) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.phone = phone;
        this.password = password;
    }

    public void setCustomerDetails(int cId, String cName, String cEmail, long phone, String password) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.phone = phone;
        this.password = password;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
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

public class Encap_example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer3 c = new Customer3();
        System.out.println("Enter ID: ");
        int cid = sc.nextInt();
        sc.nextLine();
        c.setcId(cid);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        c.setcName(name);
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        if (email.endsWith("@yahoo.com") || email.endsWith("@gmail.com")) {
            c.setcEmail(email);
        } else {
            System.out.println("Incorrect Email!");
            return;
        }
        System.out.println("Enter Phone: ");
        long phone = sc.nextLong();
        c.setPhone(phone);
        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        c.setPassword(password);

        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getEmail());
        System.out.println(c.getPhone());
        System.out.println(c.getPassword());

    }

}
