public class Student extends Person {
    double gpa;
    Student(double gpa, String first, String last) {
        super(first, last);
        this.gpa = gpa;
    }

    void showFullInfo() {
        System.out.println(first + " " + last + " " + gpa);
    }
}
