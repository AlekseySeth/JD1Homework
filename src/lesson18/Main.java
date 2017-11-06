package lesson18;

import lesson18.printer.PrinterToFile;
import lesson18.printer.SchedulePrinter;
import lesson18.printer.StatisticsPrinter;
import lesson18.reader.FileReader;
import lesson18.schedule.Schedule;
import lesson18.schedule.ScheduleComposer;
import lesson18.statistics.Statistics;
import lesson18.statistics.StatisticsCounter;

import java.io.File;
import java.util.regex.Pattern;

/**
 * @author a.shestovsky
 */
public class Main {
    public static void main(String[] args) {
        File log = new File("log-file.txt");
        FileReader reader = new FileReader();
        ScheduleComposer scheduleComposer = new ScheduleComposer(Pattern.compile("([0-2]\\d):([0-5]\\d)\\s(.+)"));
        Schedule schedule =  scheduleComposer.compose(reader.readFromFile(log));

        PrinterToFile schedulePrinter = new SchedulePrinter(schedule);
        schedulePrinter.printToFile("schedule");

        Statistics statistics = new StatisticsCounter().countStatistics(schedule);

        PrinterToFile statisticsPrinter = new StatisticsPrinter(statistics);
        statisticsPrinter.printToFile("statistics");

    }
}