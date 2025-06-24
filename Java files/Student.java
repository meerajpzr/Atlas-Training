class Student {
    public String name;  // Student's name

    // Constructor to initialize the student's name
    public Student(String name) {
        this.name = name;
    }

    // Override toString() to return the student's name when printed
    @Override
    public String toString() {
        return name;
    }
}
