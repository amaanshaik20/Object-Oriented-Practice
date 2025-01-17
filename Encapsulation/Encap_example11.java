package Encapsulation;

import java.util.*;

class Menu {
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

public class Encap_example11 {
    public static void main(String[] args) {

        Menu m = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Item Price: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Description: ");
        String description = sc.nextLine();

        m.setDetails(id, name, price, description);

        System.out.println();
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getPrice());
        System.out.println(m.getDesctription());
    }
}
