
class Bank {
    private int account_number;
    private int pin;
    private int money;

    public void setAccountNumber(int account_number, int pin, int money) {
        if (account_number == 2468 && pin == 786) {
            this.money = money;
        } else {
            System.out.println("Wrong credentals");
        }
    }

    public int getMoney(int account_number, int pin) {
        if (account_number == 2468 && pin == 786) {
            System.out.println("Money in Bank:");
            return money;
        } else {
            System.out.println("Wrong credentals");
        }
        return 0;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setAccountNumber(2468, 786, 20006);
        int money = b.getMoney(2468, 786);
        System.out.println(money);
        // System.out.println(b.account_number);
    }
}
