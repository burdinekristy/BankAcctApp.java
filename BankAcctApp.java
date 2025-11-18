import java.util.ArrayList;

public class BankAcctApp {
    public static void main(String[] args) {
        AraryList<Customer> customers = new ArrayList<>();
        System.out.println("Welcome to the Bank Account Application!");

        while (true) {
            System.out.print("Enter 'Y' to add a new customer or 'N' to finish: ");
            String choice = new java.util.Scanner(System.in).nextLine().trim().toUpperCase();
            if (choice.equals("N")) break;

            Customer cust = new Customer();

            cust.setCustomerID(DataEntry.getStringWithLimit("Enter Customer ID (max 5): ", 5));
            cust.setCustomerSSN(DataEntry.getNumericString("Enter SSN (9 digits): "));
            cust.setLastName(DateEntry.getStringWithLimit("Enter Last Name (max 20): ", 20));
            cust.setFirstName(DataEntry.getStringWithLimit("Enter First Name (max 15): ", 15));
            cust.setStreetAddress(DataEntry.getStringWithLimit("Enter Street Address (max 20): ", 20));
            cust.setCity(DataEntry.getStringWithLimit("Enter City (max 20): ", 20));
            cust.setState(DataEntry.getStringWithLimit("Enter State (2 letters): ", 2));
            cust.setZip(DataEntry.getNumericString("Enter Zip (max 5): ", 5));
            cust.setPhoneNumber(DataEntry.getNumericString("Enter Phone Number (max 10): ", 10));

            customers.add(cust);
            System.out.println("Customer added successfully!\n");
        }

        // Display all customers
        System.out.println("\n--- Customer Information ---");
        System.out.printf("%-6s %-9s %-20s %-15 %-20s %-5s\n",
                "ID", "SSN", "Last Name", "First Name", "Address", "City", "State", "Zip", "PhoneNumber");
        for (Customer c : customers) {
            System.out.printf("%-6s %-9s %-20s %-15s %-20s %-20s %-5s %-5s %-10s\n",
                    c.getCustomerID(), c.getCustomerSSN(), c.getLastName(), c.getFirstName(),
                    c.getStreetAddress(), c.getCity(), c.getState(), c.getZip(), c.getPhoneNumber());
        }
    }
}