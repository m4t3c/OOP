package exercises.threads;

import java.time.LocalTime;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecution extends Thread{
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() ->
                System.out.println(LocalTime.now() + " Hello!"), 0, 1000, TimeUnit.MILLISECONDS);

    }
}
