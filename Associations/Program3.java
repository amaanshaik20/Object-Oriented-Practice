class Heart1 {
    private int weight;
    private int bpm;

    public Heart1(int weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }

    public int getBpm() {
        return bpm;
    }

    public int getWeight() {
        return weight;
    }
}

class Brain1 {
    private int weight;
    private String color;

    public Brain1(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}

class Bike1 {
    private String brand;
    private int mileage;

    public Bike1(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

}

class Book1 {
    private String name;
    private String author;

    public Book1(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}

class Human1 {
    Heart1 heart1 = new Heart1(250, 72);
    Brain1 brain1 = new Brain1(1250, "White");
}

class Student1 extends Human1 {
    public void hasABike1(Bike1 bike1) {
        System.out.println(bike1.getBrand());
        System.out.println(bike1.getMileage());
    }

    public void hasABook1(Book1 book1) {
        System.out.println(book1.getName());
        System.out.println(book1.getAuthor());
    }
}

public class Program3 {
    public static void main(String[] args) {
        Bike1 bike1 = new Bike1("honda", 40);
        Book1 book1 = new Book1("C", "Dennis R");

        Student1 s = new Student1();
        Human1 h = new Human1();

        System.out.println(s.heart1.getBpm());
        System.out.println(s.brain1.getColor());
        System.out.println();
        System.out.println(s.heart1.getWeight());
        System.out.println(s.brain1.getWeight());
        System.out.println();
        s.hasABike1(bike1);
        System.out.println();
        s.hasABook1(book1);
        System.out.println();
        s = null;
        h = null;
        // System.out.println(h.heart1.getBpm());
        // System.out.println(heart1.getBpm());

    }

}
