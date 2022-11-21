import java.util.concurrent.TimeUnit;

public class Stopwatch {
    public static void main(String args[]) throws InterruptedException{
        // start time
        long StartTime = System.currentTimeMillis();

        // sleep for 10 seconds
        TimeUnit.SECONDS.sleep(5);
        // end time
        long EndTime = System.currentTimeMillis();
        long ElapsedTime = EndTime-StartTime;
        System.out.println("Elapsed Time In milliseconds : "+ElapsedTime);

    }  
}
