
class Bank1 {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.setName("Amaan");
        System.out.println(b.getName());
    }
}
