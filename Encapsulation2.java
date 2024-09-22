
import java.util.*;

class Employee {
    private int id;
    private String name;
    private String email;
    private String address;

    public Employee() {

    }

    public Employee(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getAddress() {
        return address;
    }

}

public class Encapsulation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] f = new Employee[n];
        for (int i = 0; i < n; i++) {

            System.out.println("Enter details:(Comma seperated):");
            String[] details = sc.nextLine().split(",");
            int id = Integer.parseInt(details[0]);
            String name = details[1];
            String email = details[2];
            String address = details[3];

            Employee e = new Employee();
            e.setId(id);
            e.setName(name);
            e.setEmail(email);
            e.setAddress(address);

            f[i] = e;

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + f[i].getId());
            System.out.println("NAME:  " + f[i].getName());
            System.out.println("EMAIL:  " + f[i].getEmail());
            System.out.println("ADDRESS:  " + f[i].getAddress());
        }

    }
}
