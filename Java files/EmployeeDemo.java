
public class EmployeeDemo {

    // Base class
    static class Employee {
        private int pwd;
        protected int salary;
        public int empId;


        public Employee() {
            System.out.println("Employee constructor called");
        }


        public void setPwd(int pwd) {
            this.pwd = pwd;
        }


        public int getPwd() {
            return pwd;
        }
    }


    static class Hr extends Employee {
        public void displayInfo() {

            setPwd(1254);


            salary = 50000;
            empId = 10001;


            System.out.println("HR Password (via getter): " + getPwd());
            System.out.println("HR Salary: " + salary);
            System.out.println("HR Employee ID: " + empId);
        }
    }

    // Main method
    public static void main(String[] args) {
        Hr hr = new Hr();
        hr.displayInfo();
    }
}
