package lesson18.statistics;

import lesson18.schedule.Schedule;
import lesson18.schedule.ScheduleItem;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author a.shestovsky
 */
public class StatisticsCounter {

    private static final int MINUTES_IN_HOUR = 60;
    private static final int HUNDRED_PERCENT = 100;

    public Statistics countStatistics(Schedule schedule) {
        Set<StatisticsItem> statistics = new LinkedHashSet<>();
        Statistics result = new Statistics(statistics);
        Map<String, Integer> items = new LinkedHashMap<>();
        Set<String> notUnique = new HashSet<>();

        double totalDuration = schedule.getSchedule().stream()
                .map(this::countItemDuration).mapToInt(Integer::valueOf).sum();
        String name;
        int duration;
        double percentage;
        int lecturesDuration = 0;

        for (ScheduleItem scheduleItem : schedule.getSchedule()) {
            name = scheduleItem.getDisciplineName();
            if (items.containsKey(name)) {
                duration = items.get(name) + countItemDuration(scheduleItem);
                items.put(name, duration);
                notUnique.add(name);
            } else {
                items.put(name, countItemDuration(scheduleItem));
            }
        }
        for (Map.Entry entry : items.entrySet()) {
            name = (String) entry.getKey();
            duration = (int) entry.getValue();
            percentage = duration * HUNDRED_PERCENT / totalDuration;
            statistics.add(new StatisticsItem(name, duration, percentage));
        }
        for (StatisticsItem statisticsItem : statistics)
            if (notUnique.contains(statisticsItem.getDisciplineName())) {
                statisticsItem.setRepeatable(true);
            } else {
                statisticsItem.setRepeatable(false);
                lecturesDuration += statisticsItem.getDuration();
            }
        double lecturesPercentage = lecturesDuration * HUNDRED_PERCENT / totalDuration;
        result.setLecturesDuration(lecturesDuration);
        result.setLecturesPercentage(lecturesPercentage);

        return result;
    }

    private int countItemDuration(ScheduleItem item) {
        int startH = Integer.valueOf(item.getStart().substring(0,2));
        int startM = Integer.valueOf(item.getStart().substring(3,5));
        int finishH = Integer.valueOf(item.getFinish().substring(0,2));
        int finishM = Integer.valueOf(item.getFinish().substring(3,5));
        return  (finishH - startH) * MINUTES_IN_HOUR + finishM - startM;
    }
}