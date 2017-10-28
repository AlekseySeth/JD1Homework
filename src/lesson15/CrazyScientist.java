package lesson15;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author a.shestovsky
 */

public class CrazyScientist {
    private String scientistName;

    public CrazyScientist(String scientistName) {
        this.scientistName = scientistName;
    }

    public int createRobots(Future<Map<Details, Integer>> partsOfRobot) throws ExecutionException, InterruptedException {
            return partsOfRobot.get().entrySet()
                    .stream()
                    .mapToInt(Map.Entry::getValue)
                    .min().getAsInt();
    }

    public String getScientistName() {
        return scientistName;
    }
}