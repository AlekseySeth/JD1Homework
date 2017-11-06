package lesson18.schedule;

/**
 * @author a.shestovsky
 */
public class ScheduleItem {
    private String start;
    private String finish;
    private String disciplineName;
    private boolean isLast;

    public ScheduleItem(String start, String finish, String disciplineName, boolean isLast) {
        this.start = start;
        this.finish = finish;
        this.disciplineName = disciplineName;
        this.isLast = isLast;
    }

    @Override
    public String toString() {
        return start + "-" + finish  + " " + disciplineName;
    }

    public String getStart() {
        return start;
    }

    public String getFinish() {
        return finish;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public boolean isLast() {
        return isLast;
    }

    public void setLast(boolean isLast) {
        this.isLast = isLast;
    }
}