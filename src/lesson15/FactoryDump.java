package lesson15;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author a.shestovsky
 */

public class FactoryDump implements Runnable {
    private static final int DETAILS_TO_GENERATE = 4;
    private static final int NUMBER_OF_DIFFERENT_DETAILS = 9;
    private static final int TOTAL_DETAILS_IN_FIRST_NIGHT = 20;
    private Random random = new Random();
    private Map<Details, Integer> detailsInDump = new TreeMap<>();
    private CyclicBarrier barrier;

    public FactoryDump(CyclicBarrier barrier) {
        this.barrier = barrier;
        for (int currentDetail = 0; currentDetail < NUMBER_OF_DIFFERENT_DETAILS; currentDetail++) {
            detailsInDump.put(Details.values()[currentDetail], 0);
        }
        for (int counter = 0; counter < TOTAL_DETAILS_IN_FIRST_NIGHT; counter++) {
            Details randomDetail = Details.values()[random.nextInt(NUMBER_OF_DIFFERENT_DETAILS)];
            detailsInDump.put(randomDetail, detailsInDump.get(randomDetail) + 1);
        }
    }

    @Override
    public void run() {
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        generateRandomDetails();
    }

    public synchronized void generateRandomDetails() {
        int detailsToGenerate = random.nextInt(DETAILS_TO_GENERATE) + 1;


        for (int counter = 0; counter < detailsToGenerate; counter++) {
            Details randomDetail = Details.values()[random.nextInt(NUMBER_OF_DIFFERENT_DETAILS)];
            detailsInDump.put(randomDetail, detailsInDump.get(randomDetail) + 1);
        }
    }

    public Map<Details, Integer> getDetailsInDump() {
        return detailsInDump;
    }
}
