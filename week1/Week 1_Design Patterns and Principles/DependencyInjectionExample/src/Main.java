// Main.java
public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        CustomerService customerService = new CustomerService(customerRepository);

        System.out.println(customerService.getCustomerById(1)); // Output: Customer 1: John Doe
        System.out.println(customerService.getCustomerById(2)); // Output: Customer 2: Jane Smith
        System.out.println(customerService.getCustomerById(3)); // Output: Customer not found
    }
}
