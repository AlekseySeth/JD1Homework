package lesson18.statistics;

/**
 * @author a.shestovsky
 */
public class StatisticsItem {

    private String disciplineName;
    private int duration;
    private double percentage;
    private boolean isRepeatable;

    public StatisticsItem(String disciplineName, int duration, double percentage) {
        this.disciplineName = disciplineName;
        this.duration = duration;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return String.format("%s: %d  минут %2.1f", disciplineName, duration, percentage) + "%";
    }

    public boolean isRepeatable() {
        return isRepeatable;
    }

    public void setRepeatable(boolean repeatable) {
        isRepeatable = repeatable;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public int getDuration() {
        return duration;
    }

    public double getPercentage() {
        return percentage;
    }
}