import java.util.Scanner;

public class IncomeTaxCalculator {
	
    public static void main(String[] args) {
        double tax = calculateTax();
        System.out.println("Income tax amount is: ₹" + tax);
    }

    public static double calculateTax() {
        double income, tax = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        income = scanner.nextDouble();

        if (income <= 200000) {
            tax = 0;
        } else if (income <= 300000) {
            tax = 0.1 * (income - 200000);
        } else if (income <= 500000) {
            tax = 0.2 * (income - 300000) + 0.1 * 100000;
        } else if (income <= 1000000) {
            tax = 0.3 * (income - 500000) + 0.2 * 200000 + 0.1 * 100000;
        } else {
            tax = 0.4 * (income - 1000000) + 0.3 * 500000 + 0.2 * 200000 + 0.1 * 100000;
        }

        return tax;
    }
}
