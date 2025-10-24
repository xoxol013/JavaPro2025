package hm_8;

import java.util.Scanner;

public class Main {

    static double balance;

    public static void main(String[] args) {

        balance = getBalance();
        validateAmuont(balance, getAmount());
    }

    private static double getBalance() {
        return 1000.00;
    }

    private static double getAmount() {
        System.out.print("Balance is USD " + balance + "\n" + "Enter purchase amount, USD: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void validateAmuont(double balance, double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException ("Insufficient funds!");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.println("funds are OK. Purchase paid." + "\nBalance is USD " + balance);
        }
    }

    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;

    }
}
