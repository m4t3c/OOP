package exercises.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;

public class ThreadPoolExecutor extends Thread{
    public static final int MAX_TASKS = 8;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        RandomGenerator rnd = RandomGenerator.getDefault();

        for (int task = 0; task < MAX_TASKS; task++) {
            int taskNumber = task;
            executor.submit(() -> {
                long start = System.nanoTime();
                System.out.printf("START thread=%s task=%d\n", Thread.currentThread(), taskNumber);
                try {
                    Thread.sleep(rnd.nextInt(1000));
                } catch (InterruptedException ignored) {

                }

                long stop = System.nanoTime();
                System.out.printf("STOP thread=%s task=%d t=%d\n", Thread.currentThread(), taskNumber, (stop - start));
            });
        }

        executor.shutdown();
    }
}
