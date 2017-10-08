package lesson9.task2;

import java.util.*;

/**
 * @author a.shestovsky
 */

public class University {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("George", "Washington", 67, 9.3),
                new Student("Thomas", "Jefferson", 83, 9.1),
                new Student("Andrew", "Jackson", 78, 9.0),
                new Student("Abraham", "Lincoln", 56, 9.6),
                new Student("Theodore", "Roosevelt", 60, 9.7),
                new Student("Woodrow", "Wilson", 67, 9.2),
                new Student("John", "Kennedy", 46, 9.8),
                new Student("Bill", "Clinton", 71, 7.8),
                new Student("George", "Bush", 71, 6.4),
                new Student("Barack", "Obama", 56, 8.8),
                new Student("Donald", "Trump", 71, 9.1)));

        printSmartestStudent(students);

        System.out.println("\nSorting by first + last name:\n");
        students.sort(new StudentsByFirstAndLastNameComparator());
        students.forEach(System.out::println);
        System.out.println();

        Collections.shuffle(students);

        System.out.println("Sorting by age:\n");
        students.sort(new StudentsByAgeComparator());
        students.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting by grade point average:\n");
        students.sort(new StudentsByGradePointAverageComparator().reversed());
        students.forEach(System.out::println);
    }

    public static void printSmartestStudent(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        Student smartest = students.get(0);
        while (iterator.hasNext()) {
            Student current = iterator.next();
            if (smartest.getGradePointAverage() < current.getGradePointAverage()) {
                smartest = current;
            }
        }
        System.out.println("The smartest is " + smartest.getFirstName() + " " + smartest.getLastName());
    }
}