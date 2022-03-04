import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class CurrentTime {

    public static void main(String[] args) throws ParseException {
        long startTime = System.currentTimeMillis();

        methodToTime();   //Measure execution time for this method

        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);  //Total execution time in milli seconds

        long d = 100;

        int seconds = (int) d / 1000;

        int hours = 0;
        int minutes = 0;
        if (seconds > 59) {
            minutes = seconds - 60;

            if (minutes > 59) {
                hours = (int) minutes / 60;
            }
        }

        System.out.println(duration);
        System.out.print("\n");
        System.out.print("Hour" + hours);
        System.out.print("\n");
        System.out.print("Minutes" + minutes);
        System.out.print("\n");
        System.out.print("Seconds" + seconds);
    }

    private static void methodToTime() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
