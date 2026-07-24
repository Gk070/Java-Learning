import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main (String[] args) {
        // Java Countdown Timer Program
        System.out.println("COUNTDOWN TIMER ⌛");
        System.out.println("------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("HAPPY NEW YEAR!🎆");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); //(TASK, DELAY, PERIOD)
    }
}
