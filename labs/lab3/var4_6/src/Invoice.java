public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void printInvoice(Customer customer) {
        System.out.println("Счет для " + customer.getName() + ": " + amount + " руб.");
    }
}
