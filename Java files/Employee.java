// Employee class extends Customer
class Employee extends Customer {
    private String department;
    private double salary;

    public Employee(String name, int id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", Department: " + department + ", Salary: " + salary;
    }
}
