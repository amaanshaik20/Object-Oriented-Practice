package Interfaces;

@FunctionalInterface
interface Alpha {
    void sum();

    default void diff() {
        System.out.println("Subtracting");
        div();
    }

    static void product() {
        System.out.println("multiplicating");

    }

    private void div() {
        System.out.println("Dividing");
    }
}

public class Program3 {
    public static void main(String[] args) {
        class Beta implements Alpha {
            @Override
            public void sum() {
                System.out.println("Summing...");
            }

            static void remainder() {
                System.out.println("Remaining");
                Beta.lifting();

            }

            static void lifting() {
                System.out.println("Lifting");
            }
        }
        Beta b = new Beta();
        b.sum();
        Beta.remainder();
    }
}
