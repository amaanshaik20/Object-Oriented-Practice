class Heart {
    private int weight;
    private int bpm;

    public Heart(int weight, int bpm) {
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

class Brain {
    private int weight;
    private String color;

    public Brain(int weight, String color) {
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

class Bike {
    private String brand;
    private int mileage;

    public Bike(String brand, int mileage) {
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

class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
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

class Human {
    Heart heart = new Heart(250, 72);
    Brain brain = new Brain(1250, "White");

    public void hasABike(Bike bike) {
        System.out.println(bike.getBrand());
        System.out.println(bike.getMileage());
    }

    public void hasABook(Book book) {
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}

public class Program2 {
    public static void main(String[] args) {
        Bike bike = new Bike("tvs", 45);
        Book book = new Book("Java", "JAMES Gosling");

        Human human = new Human();
        human.hasABike(bike);
        System.out.println();
        human.hasABook(book);
        System.out.println();

        System.out.println(human.heart.getWeight());
        System.out.println(human.heart.getBpm());
        System.out.println();
        System.out.println(human.brain.getWeight());
        System.out.println(human.brain.getColor());
        System.out.println();
        human = null;

        System.out.println(bike.getBrand());
        System.out.println(book.getName());
        System.out.println("amaan");
        // System.out.println(human.heart.getWeight());
        // System.out.println(human.brain.getWeight());

    }
}
