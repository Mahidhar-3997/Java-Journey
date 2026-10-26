public class Example7 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(10000);
        a1.withdraw(5000);
        a1.currentBalance();

    }

}

class Account {
    int bal = 5000;

    void deposit(int a) {
        bal += a;
        System.out.println("amount credited");
    }

    void withdraw(int a) {
        if (a > bal) {
            System.out.println("insufficient balance");
            return;
        }
        bal -= a;
    }

    void currentBalance() {
        System.out.println("current balance=" + bal + "rs");
    }

}