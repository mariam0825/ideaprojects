package checkout;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CheckOutMain {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("            SEMICOLON STORE           ");
        System.out.println("======================================");

        System.out.print("What is Customer's name: ");
        String customerName = scanner.nextLine();
        int choice;
        do {
            System.out.println("--------------- MENU -------------");
            System.out.println("1. Add Item");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n---------- ADD ITEM ----------");
                    System.out.print("What did the user buy? ");
                    String itemName = scanner.nextLine();

                    System.out.print("How many pieces do you want? ");
                    int quantity = scanner.nextInt();

                    System.out.print("Price per unit cost ? ");
                    double pricePerUnit = scanner.nextDouble();
                    scanner.nextLine();
                    checkout.addProduct(itemName, pricePerUnit, quantity);
                    System.out.println("Item added successfully!");
                    break;

                case 2:
                    System.out.println("\n--------------- CART ----------------");
                    if (checkout.checkForMoreProduct() == 0) {
                        System.out.println("Your cart is empty.");
                    } else {
                        System.out.printf("%-20s %10s %15s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL");
                        System.out.println("-".repeat(50));
                        for (int count = 0; count < checkout.checkForMoreProduct(); count++) {
                            String item = checkout.getProducts().get(count);
                            int qty = checkout.getProductQuantity().get(count);
                            double price = checkout.getProductPrices().get(count);
                            double total = checkout.totalProductPrice(item);
                            System.out.printf("%-20s %10d %15.2f %15.2f%n", item, qty, price, total);
                        }
                    }
                    break;
                case 3:
                    if (checkout.checkForMoreProduct() == 0) {
                        System.out.println("You cannot checkout with an empty cart ,you must add to cart ");
                    }
//                    break;
                    System.out.print("The Store Cashier's name: ");
                    String cashierName = scanner.nextLine();
                    System.out.print("How much discount will the customer get? ");
                    double discount = scanner.nextDouble();

                    double subTotal = checkout.totalPrice();
                    double discountAmount = checkout.applyDiscount(discount);
                    double vatAmount = checkout.applyVat();
                    double billTotal = subTotal - discountAmount + vatAmount;
                    System.out.println("\n\n");
                    System.out.println("=".repeat(75));
                    System.out.println("\t\t\tSEMICOLON STORE");
                    System.out.println("\t\t\tMAIN BRANCH");
                    System.out.println("312, HERBERT MARCAULAY WAY, SABO YABA, LAGOS");
                    System.out.println("\t\tTEL: 03293828343");
                    System.out.println("=".repeat(75));
                    System.out.println("Date: " + LocalDateTime.now());
                    System.out.println("Cashier: " + cashierName);
                    System.out.println("Customer: " + customerName);
                    System.out.println("-".repeat(75));
                    System.out.printf("%-25s %8s %15s %15s%n", "ITEM", "QTY", "PRICE", "TOTAL");
                    System.out.println("-".repeat(75));
                    for (int count = 0; count < checkout.checkForMoreProduct(); count++) {
                        String item = checkout.getProducts().get(count);
                        int qty = checkout.getProductQuantity().get(count);
                        double price = checkout.getProductPrices().get(count);
                        double total = checkout.totalProductPrice(item);
                        System.out.printf("%-25s %8d %15.2f %15.2f%n", item, qty, price, total);
                    }
                    System.out.println("-".repeat(75));
                    System.out.printf("%-55s %15.2f%n", "Sub Total:", subTotal);
                    System.out.printf("%-55s %15.2f%n", "Discount:", discountAmount);
                    System.out.printf("%-55s %15.2f%n", "VAT @ 7.5%:", vatAmount);
                    System.out.println("=".repeat(75));
                    System.out.printf("%-55s %15.2f%n", "Bill Total:", billTotal);
                    System.out.println("=".repeat(75));
                    System.out.print("Amount paid: ");
                    double amountPaid = scanner.nextDouble();
                    double balance = amountPaid - billTotal;
                    System.out.printf("%-55s %15.2f%n", "Amount Paid:", amountPaid);
                    System.out.printf("%-55s %15.2f%n", "Balance:", balance);
                    System.out.println("=".repeat(75));
                    System.out.println("\t\tTHANK YOU FOR YOUR PATRONAGE");
                    System.out.println("=".repeat(75));
                    choice = 4;
                    break;

            case 4:
                System.out.println("Thank you for using Semicolon Store.");

                break;

            default:
                System.out.println("Invalid choice. Please select 1 - 4.");

            }
        }while (choice != 4);

    }
}

