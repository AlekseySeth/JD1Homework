package lesson18.schedule;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author a.shestovsky
 */
public class ScheduleComposer {
    private Pattern pattern;

    public ScheduleComposer(Pattern pattern) {
        this.pattern = pattern;
    }

    public Schedule compose(List<String> source) {
        List<ScheduleItem> schedule = new ArrayList<>();
        String firstLine = source.get(0);

        for (int i = 1; i < source.size(); i++) {
            String secondLine = source.get(i);
            Matcher firstMatcher = pattern.matcher(firstLine);
            Matcher secondMatcher = pattern.matcher(secondLine);

            while (firstMatcher.find()) {
                while (secondMatcher.find()) {
                    boolean isLast = false;
                    if (secondMatcher.group(3).equals("Конец")) {
                        isLast = true;
                    }
                    String start = firstMatcher.group(1) + ":" + firstMatcher.group(2);
                    String finish = secondMatcher.group(1) + ":" + secondMatcher.group(2);
                    schedule.add(new ScheduleItem(start, finish, firstMatcher.group(3), isLast));
                }
            }
            firstLine = secondLine;
        }
        return new Schedule(schedule);
    }
}