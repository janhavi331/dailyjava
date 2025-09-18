import java.util.Scanner;

public class income{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income in lakhs (e.g., 7.5 for ₹7.5L): ");
        double income = sc.nextDouble();
        double tax = 0.0;

        // Convert income to actual rupees for calculation
        double actualIncome = income * 100000;

        if (actualIncome <= 250000) {
            tax = 0;
        } else if (actualIncome <= 500000) {
            tax = (actualIncome - 250000) * 0.05;
        } else if (actualIncome <= 1000000) {
            tax = (250000 * 0.05) + (actualIncome - 500000) * 0.20;
        } else {
            tax = (250000 * 0.05) + (500000 * 0.20) + (actualIncome - 1000000) * 0.30;
        }

        System.out.println("Income Tax to be paid: ₹" + tax);
    }
}
