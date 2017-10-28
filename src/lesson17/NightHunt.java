package lesson17;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


/**
 * @author a.shestovsky
 */

public class NightHunt {
    private static final int NUMBER_OF_NIGHTS = 100;
    private static final int DAY_DURATION = 100;
    private static volatile Map<Details, Integer> detailsInDump = new TreeMap<>();
    private static int firstResult = 0;
    private static int secondResult = 0;

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        CyclicBarrier barrier = new CyclicBarrier(3);

        CrazyScientist firstScientist = new CrazyScientist("Victor Frankenstein");
        CrazyScientist secondScientist = new CrazyScientist("Elon Musk");
        FactoryDump factoryDump = new FactoryDump(detailsInDump, barrier);
        Servant firstServant = new Servant(detailsInDump, barrier);
        Servant secondServant = new Servant(detailsInDump, barrier);

        for (int i = 0; i < NUMBER_OF_NIGHTS; i++) {
            pool.submit(factoryDump);
            Future<Map<Details, Integer>> firstServantFound = pool.submit(firstServant);
            Future<Map<Details, Integer>> secondServantFound = pool.submit(secondServant);

            try {
                firstResult = firstScientist.createRobots(firstServantFound);
                secondResult = secondScientist.createRobots(secondServantFound);
                Thread.sleep(DAY_DURATION);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        pool.shutdown();

        try {
            pool.awaitTermination(30L, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(firstScientist.getScientistName() + " - " + firstResult + " robots");
        System.out.println(secondScientist.getScientistName() + " - " + + secondResult + " robots");
        System.out.println("\nThe winner is "
                + (firstResult > secondResult ? firstScientist.getScientistName() : secondScientist.getScientistName())
                + "!");
    }
}