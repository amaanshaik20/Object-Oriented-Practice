//aggregate class
class Charger {
    private String brand;
    private float voltage;

    public Charger(String brand, float voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public float getVoltage() {
        return voltage;
    }
}

// composition class
class Os {
    private String name;
    private int size;

    public Os(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

// Mobile class
class Mobile {
    // composition
    Os os = new Os("windows", 4);

    // aggregation
    public void hasA(Charger c) {
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }

}

public class Program1 {
    public static void main(String[] args) {
        Charger c = new Charger("samsung", 60.0f);

        Mobile m = new Mobile();
        m.hasA(c);
        System.out.println();
        String chargerName = m.os.getName();
        int chargerSize = m.os.getSize();
        System.out.println(chargerName);
        System.out.println(chargerSize);

        m = null;
        // m.hasA(c);
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
        // System.out.println(os.getName());

    }

}