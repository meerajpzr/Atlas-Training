class Student {
    public int roll_no;
    public String name;

    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Mainss {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student(1, "Aman");
        students[1] = new Student(2, "Vaibhav");
        students[2] = new Student(3, "Shikar");
        students[3] = new Student(4, "Dharmesh");
        students[4] = new Student(5, "Mohit");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Element at " + i + " : { "
                    + students[i].roll_no + " " + students[i].name + " }");
        }
    }
}
