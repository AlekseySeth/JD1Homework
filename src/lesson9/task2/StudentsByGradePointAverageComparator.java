package lesson9.task2;

import java.util.Comparator;

/**
 * @author a.shestovsky
 */
public class StudentsByGradePointAverageComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getGradePointAverage() == second.getGradePointAverage()) {
            return new StudentsByFirstAndLastNameComparator().reversed().compare(first, second);
        }
        return new Double(first.getGradePointAverage()).compareTo(second.getGradePointAverage());
    }
}