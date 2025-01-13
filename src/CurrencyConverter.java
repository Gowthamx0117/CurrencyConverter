import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to the Currency Converter!");

        // Step 1: Display menu
        System.out.println("Supported currencies:");
        System.out.println("1. USD to INR");
        System.out.println("2. USD to EUR");
        System.out.println("3. USD to GBP");
        System.out.println("4. USD to AUD");
        System.out.println("5. USD to JPY");
        System.out.println("6. Exit");

        // Step 2: Exchange rates (base: USD)
        double usdToInr = 82.5;  // Example rate: 1 USD = 82.5 INR
        double usdToEur = 0.93;  // Example rate: 1 USD = 0.93 EUR
        double usdToGbp = 0.75;  // Example rate: 1 USD = 0.75 GBP
        double usdToAud = 1.5;   // Example rate: 1 USD = 1.5 AUD
        double usdToJpy = 115.0; // Example rate: 1 USD = 115.0 JPY

        // Step 3: Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt(); // Read the user's choice

        // Step 4: Validate the choice
        if (choice < 1 || choice > 6) {
            System.out.println("Invalid choice. Please restart the program and select a valid option.");
        } else if (choice == 6) {
            System.out.println("Thank you for using the Currency Converter. Goodbye!");
        } else {
            // Step 5: If choice is valid, ask for amount
            System.out.print("Enter amount in USD: ");
            double amount = scanner.nextDouble(); // Read the amount to convert

            double convertedAmount = 0.0; // Variable to store converted value

            // Step 6: Perform conversion
            switch (choice) {
                case 1: // USD to INR
                    convertedAmount = amount * usdToInr;
                    System.out.printf("Converted Amount: %.2f INR\n", convertedAmount);
                    break;
                case 2: // USD to EUR
                    convertedAmount = amount * usdToEur;
                    System.out.printf("Converted Amount: %.2f EUR\n", convertedAmount);
                    break;
                case 3: // USD to GBP
                    convertedAmount = amount * usdToGbp;
                    System.out.printf("Converted Amount: %.2f GBP\n", convertedAmount);
                    break;
                case 4: // USD to AUD
                    convertedAmount = amount * usdToAud;
                    System.out.printf("Converted Amount: %.2f AUD\n", convertedAmount);
                    break;
                case 5: // USD to JPY
                    convertedAmount = amount * usdToJpy;
                    System.out.printf("Converted Amount: %.2f JPY\n", convertedAmount);
                    break;
                default:
                    System.out.println("Unexpected error.");
            }
        }

        scanner.close();
    }
}
