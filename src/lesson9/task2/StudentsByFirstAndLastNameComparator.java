package lesson9.task2;

import java.util.Comparator;

/**
 * @author a.shestovsky
 */
public class StudentsByFirstAndLastNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
        if (first.getFirstName().equals(second.getFirstName())) {
            return first.getLastName().compareTo(second.getLastName());
        }
        return first.getFirstName().compareTo(second.getFirstName());
    }
}