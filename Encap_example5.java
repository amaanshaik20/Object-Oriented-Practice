import java.util.Scanner;

class Customer4 {
    private int cId;
    private String cName;
    private String cEmail;
    private String phone;
    private String password;

    Customer4() {

    }

    Customer4(int cId, String cName, String cEmail, String phone, String password) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.phone = phone;
        this.password = password;
    }

    public void setCustomerDetails(int cId, String cName, String cEmail, String phone, String password) {
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

    public void setPhone(String phone) {
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

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }
}

public class Encap_example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer4 c = new Customer4();
        int t = 0;
        while (t == 0) {
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
                continue;
            }
            System.out.println("Enter Phone: ");
            String phone = sc.nextLine();
            if ((phone.startsWith("9") || phone.startsWith("8") || phone.startsWith("7") || phone.startsWith("6"))
                    && phone.length() == 10) {
                c.setPhone(phone);

            } else {
                System.out.println("Incorrect Number!");
                continue;
            }
            System.out.println("Enter Password: ");
            String password = sc.nextLine();
            c.setPassword(password);
            t = 1;
        }

        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getEmail());
        System.out.println(c.getPhone());
        System.out.println(c.getPassword());

    }

}
