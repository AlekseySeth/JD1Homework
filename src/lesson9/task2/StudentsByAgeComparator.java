package lesson9.task2;

import java.util.Comparator;

/**
 * @author a.shestovsky
 */
public class StudentsByAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getAge() == second.getAge()) {
            return new StudentsByFirstAndLastNameComparator().compare(first, second);
        }
        return new Integer(first.getAge()).compareTo(second.getAge());
    }
}