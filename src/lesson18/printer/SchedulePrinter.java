package lesson18.printer;

import lesson18.schedule.Schedule;
import lesson18.schedule.ScheduleItem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author a.shestovsky
 */
public class SchedulePrinter implements PrinterToFile {
    private Schedule schedule;

    public SchedulePrinter(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public void printToFile(String outputFileName) {
        File result = new File(outputFileName + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(result))) {
            for (ScheduleItem item : schedule.getSchedule()) {
                writer.write(item.toString() + "\n");
                if (item.isLast()) {
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}