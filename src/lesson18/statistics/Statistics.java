package lesson18.statistics;

import java.util.Set;

/**
 * @author a.shestovsky
 */
public class Statistics {

    private Set<StatisticsItem> statistics;
    private int lecturesDuration;
    private double lecturesPercentage;

    public Statistics(Set<StatisticsItem> statistics) {
        this.statistics = statistics;
    }

    public Set<StatisticsItem> getStatistics() {
        return statistics;
    }

    public int getLecturesDuration() {
        return lecturesDuration;
    }

    public void setLecturesDuration(int lecturesDuration) {
        this.lecturesDuration = lecturesDuration;
    }

    public double getLecturesPercentage() {
        return lecturesPercentage;
    }

    public void setLecturesPercentage(double lecturesPercentage) {
        this.lecturesPercentage = lecturesPercentage;
    }

}