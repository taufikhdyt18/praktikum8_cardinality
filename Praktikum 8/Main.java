import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Taufik", "Sukatani - Cikarang");

        // Create an item
        Item laptop = new Item("Laptop");

        // Order Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date orderDate = new Date();

        // Create an order
        Order order = new Order(laptop, orderDate, "Online");

        // Payments
        Payment cashPayment = new Cash(5100000);
        Payment checkPayment = new Check(5100000, "***********987");
        Payment creditPayment = new Credit(5100000, "2024-08-18");

        // Output
        System.out.println("Customer\n" + customer);
        System.out.println("\nOrder\n" + order);
        System.out.println("\nPayments");
        System.out.println(cashPayment);
        System.out.println(checkPayment);
        System.out.println(creditPayment);
    }
}
