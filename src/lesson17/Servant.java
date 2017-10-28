package lesson17;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

/**
 * @author a.shestovsky
 */

public class Servant implements Callable<Map<Details, Integer>> {
    private static final int DETAILS_TO_FIND = 4;
    private static final int NUMBER_OF_DIFFERENT_DETAILS = 9;
    private Random random = new Random();

    private CyclicBarrier barrier;
    private Map<Details, Integer> detailsFound = new TreeMap<>();
    private Map<Details, Integer> detailsInDump = new TreeMap<>();

    public Servant(Map<Details, Integer> detailsInDump, CyclicBarrier barrier) {
        this.detailsInDump = detailsInDump;
        this.barrier = barrier;
        for (int currentDetail = 0; currentDetail < NUMBER_OF_DIFFERENT_DETAILS; currentDetail++) {
            detailsFound.put(Details.values()[currentDetail], 0);
        }
    }

    @Override
    public Map<Details, Integer> call() {
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        return findDetails();
    }

    private synchronized Map<Details, Integer> findDetails() {
        int detailsToFind = random.nextInt(DETAILS_TO_FIND) + 1;

        for (int counter = 0; counter < detailsToFind; counter++) {
            Details randomDetail = Details.values()[random.nextInt(NUMBER_OF_DIFFERENT_DETAILS)];
            int randomDetailQuantityInDump = detailsInDump.get(randomDetail);

            if (randomDetailQuantityInDump > 0) {
                detailsFound.put(randomDetail, detailsFound.get(randomDetail) + 1);
                detailsInDump.put(randomDetail, detailsInDump.get(randomDetail) - 1);
            }
        }
        return detailsFound;
    }
}