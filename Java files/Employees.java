// Employees.java
class Employee {
    private String name;
    private String email;
    private double salary;

    // Constructor
    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }
}

// ReportGenerator.java
class ReportGenerator {
    public void generatePdfReport(Employee employee) {
        System.out.println("Generating PDF report for " + employee.getName());
        // Placeholder for actual PDF logic
    }
}

// EmailService.java
class EmailService {
    public void sendEmail(Employee employee) {
        System.out.println("Sending email to " + employee.getEmail());
        // Placeholder for actual email logic
    }
}

// Main.java
public class Employees {
    public static void main(String[] args) {
        // Create employee object
        Employee emp = new Employee("Alice", "alice@example.com", 50000);

        // Use helper services
        ReportGenerator reportGen = new ReportGenerator();
        EmailService emailSvc = new EmailService();

        // Call methods
        reportGen.generatePdfReport(emp);
        emailSvc.sendEmail(emp);
    }
}
