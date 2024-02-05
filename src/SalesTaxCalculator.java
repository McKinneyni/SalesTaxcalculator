//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Given price of a purchase
        double purchasePrice = 100.0;

        // Sales tax  (5%)
        double salesTaxRate = 0.05;

        // Calculate sales tax
        double salesTax = purchasePrice * salesTaxRate;

        // Calculate total
        double totalAmount = purchasePrice + salesTax;

        // Display the results
        System.out.println("Original Price: $" + purchasePrice);
        System.out.println("Sales Tax (5%): $" + salesTax);
        System.out.println("Total Amount: $" + totalAmount);
    }
}
