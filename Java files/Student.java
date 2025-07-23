class Student {

    // Method 1: Registration Details
    void registrationDetails() {
        System.out.println("Registration Details method called.");
    }

    // Method 2: Marks Calculation
    void marksCalc() {
        System.out.println("Marks Calculation method called.");
    }

    // Method 3: Fees Calculation
    void feesCalc() {
        System.out.println("Fees Calculation method called.");
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.registrationDetails();
        s1.marksCalc();
        s1.feesCalc();
    }
}
