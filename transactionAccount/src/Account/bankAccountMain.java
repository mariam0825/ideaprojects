package Account;

import java.math.BigDecimal;
import java.util.Scanner;
public class bankAccountMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("---- Welcome to Transaction Log App ----");
        System.out.print("Set your 4-digit PIN: ");
        String pin = input.nextLine();
        try { bankAccount.setPin(pin);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); return;
        }
        while (true) {
            System.out.println();
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Select option: ");
            int option = input.nextInt();
            switch (option) {
                case 1: System.out.print("Enter deposit amount: ");
                BigDecimal depositAmount = input.nextBigDecimal();
                try {
                    bankAccount.deposit(depositAmount);
                    System.out.println( "Deposited: ₦" + depositAmount );
                    System.out.println( "New Balance: ₦" + bankAccount.getBalance() );
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                BigDecimal withdrawAmount = input.nextBigDecimal(); input.nextLine();
                System.out.print("Enter your PIN: ");
                String withdrawPin = input.nextLine();
                try { bankAccount.withdraw( withdrawAmount, withdrawPin );
                    System.out.println( "Withdrawn: ₦" + withdrawAmount );
                    System.out.println( "New Balance: ₦" + bankAccount.getBalance() );
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage()); }
                break;
                case 3: input.nextLine();
                System.out.print("Enter your PIN: ");
                String balancePin = input.nextLine();
                try {
                    BigDecimal balance = bankAccount.checkBalance(balancePin);
                    System.out.println( "Current Balance: ₦" + balance );
                }
                catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
                case 4:
                    System.out.println( "Final Balance: ₦" + bankAccount.getBalance() );
                    System.out.println( "Thank you for using Transaction Log App!" );
                    return;
                    default: System.out.println( "Invalid option. Please choose 1 - 4." );
            }
        }

    } }