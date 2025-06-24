// Driver class
public class Task014 {
    public static void main(String[] args) {

        // Creating objects
        Customer customer = new Customer("Anjali", 101);
        Employee employee = new Employee("Ravi", 102, "IT", 55000);
        Manager manager = new Manager("Neha", 103, "HR", 75000, 5, "Senior");

        // Displaying all objects using toString()
        System.out.println("Customer Details:");
        System.out.println(customer);

        System.out.println("\nEmployee Details:");
        System.out.println(employee);

        System.out.println("\nManager Details:");
        System.out.println(manager);
    }
}
u