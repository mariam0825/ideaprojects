
import Account.ATM;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu = """
                Welcome to Mariam's ATM
                1. Create Account
                2. Deposit
                3. Withdraw
                4. Check Balance
                5. Transfer
                0. Exit
                Enter an option:
                """;
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        atmLoop:
        while(true){
            System.out.println(menu);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1->{
                    System.out.println("Please enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Please enter your phone number: ");
                    String phone = scanner.nextLine();
                    System.out.println("Please enter your pin: ");
                    String pin = scanner.nextLine();
                    atm.createAccount(name, phone, pin);
                }
                case 2->{
                    System.out.println("Please enter your account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.println("How much do you want to deposit?: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    atm.deposit(accountNumber, amount);
                }
                case 3->{
                    System.out.println("Please enter your account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.println("Enter the amount you want to withdraw: ");
                    double amount = scanner.nextDouble();
                    System.out.println("Enter your pin: ");
                    String pin = scanner.nextLine();
                    scanner.nextLine();
                    atm.withdraw(accountNumber, amount, pin);
                }
                case 4->{
                    System.out.println("Please enter your account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.println("Enter your pin: ");
                    String pin = scanner.nextLine();
                    System.out.println("Dear customer, your account balance is: " + atm.getBalance(accountNumber, pin));

                }
                case 5->{
                    System.out.println("Please enter your account number: ");
                    String senderAccountNumber = scanner.nextLine();

                    System.out.println("Enter receiver account number");
                    String receiverAccountNumber = scanner.nextLine();
                    System.out.println("Enter the amount you want to transfer: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter your pin: ");
                    String pin = scanner.nextLine();
                    atm.transfer(senderAccountNumber, receiverAccountNumber, amount, pin);
                }
                case 0 -> {
                    break atmLoop;
                }

            }
        }
    }

}
