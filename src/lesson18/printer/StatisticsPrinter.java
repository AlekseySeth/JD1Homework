package lesson18.printer;

import lesson18.statistics.Statistics;
import lesson18.statistics.StatisticsItem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author a.shestovsky
 */
public class StatisticsPrinter implements PrinterToFile {

    private Statistics statistics;

    public StatisticsPrinter(Statistics statistics) {
        this.statistics = statistics;
    }

    @Override
    public void printToFile(String outputFileName) {
        File result = new File(outputFileName + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(result))) {
            writer.write("Лекции: " + statistics.getLecturesDuration() + " минут " + String.format("%2.1f", statistics.getLecturesPercentage())  + "%\n");
            for (StatisticsItem item : statistics.getStatistics()) {
                if (item.isRepeatable()) {
                    writer.write(item.toString() + "\n");
                }
            }
            writer.write("\nЛекции:\n");
            for (StatisticsItem item : statistics.getStatistics()) {
                if (!item.isRepeatable()) {
                    writer.write(item.toString() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}