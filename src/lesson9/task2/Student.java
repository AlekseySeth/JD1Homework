package lesson9.task2;

/**
 * @author a.shestovsky
 */

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double gradePointAverage;

    public Student(String firstName, String lastName, int age, double gradePointAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gradePointAverage = gradePointAverage;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ". Age: " + age + ". Grade point average: " + gradePointAverage;
    }
}