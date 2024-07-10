import java.util.Scanner;

public class StopWatch {

    private long startTime;
    private long endTime;
    private boolean running;

    public StopWatch() {
        startTime = 0;
        endTime = 0;
        running = false;
    }

    public void start() {
        if (!running) {
            startTime = System.currentTimeMillis();
            running = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Stopwatch is already running.");
        }
    }

    public void stop() {
        if (running) {
            endTime = System.currentTimeMillis();
            running = false;
            long elapsedTime = endTime - startTime;
            System.out.println("Stopwatch stopped.");
            System.out.println("Elapsed time: " + formatElapsedTime(elapsedTime));
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }

    private String formatElapsedTime(long elapsedTime) {
        long hours = elapsedTime / 3600000;
        long minutes = (elapsedTime % 3600000) / 60000;
        long seconds = (elapsedTime % 60000) / 1000;
        long milliseconds = elapsedTime % 1000;

        return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Start Stopwatch");
            System.out.println("2. Stop Stopwatch");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    stopwatch.start();
                    break;
                case 2:
                    stopwatch.stop();
                    break;
                case 3:
                    System.out.println("Exiting the Stopwatch program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}