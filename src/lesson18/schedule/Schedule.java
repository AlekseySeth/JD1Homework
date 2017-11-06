package lesson18.schedule;

import java.util.List;

/**
 * @author a.shestovsky
 */
public class Schedule {

    private List<ScheduleItem> schedule;

    public Schedule(List<ScheduleItem> schedule) {
        this.schedule = schedule;
    }

    public List<ScheduleItem> getSchedule() {
        return schedule;
    }
}