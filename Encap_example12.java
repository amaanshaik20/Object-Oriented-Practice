import java.util.*;

class Menu1 {
    private int id;
    private String name;
    private int price;
    private String desctription;

    public void setDetails(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desctription = description;
    }

    public String getDesctription() {
        return desctription;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}

public class Encap_example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Items: ");
        int n = sc.nextInt();
        System.out.println();
        Menu1 a[] = new Menu1[n];

        for (int i = 0; i < n; i++) {
            Menu1 m = new Menu1();
            System.out.print("Enter Item id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Item Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Item Price: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Item Description: ");
            String description = sc.nextLine();

            m.setDetails(id, name, price, description);
            a[i] = m;
        }
        System.out.println("id | name | Price | Description");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i].getId() + "|");
            System.out.print(a[i].getName() + "|");
            System.out.print(a[i].getPrice() + "|");
            System.out.println(a[i].getDesctription() + "|");
        }
        // System.out.println(a[1].getId());
    }
}

// id
