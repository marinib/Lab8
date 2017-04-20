import java.util.Scanner;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        // todo: use methods
        // todo: Create method to check for incorrect input (possibly try/catch)

        // Welcome message
        System.out.println("Welcome to Batting Average Calculator");
        Scanner scan = new Scanner(System.in);

        // Ask user to enter number of bats
        System.out.print("Enter number of at bats: ");
        int numOfTimesAtBat = scan.nextInt();

        // Get user input - number of at bats

        int arrayOfNums[] = new int[numOfTimesAtBat];
        for (int i = 0; i < arrayOfNums.length; i++) {
            System.out.print("Results at bat: " + (i + 1) + ": ");
            arrayOfNums[i] = scan.nextInt();
        }

        // Display batting average (ball hits (value) divided by at bats)
        double count = 0;
        for (int i = 0; i < arrayOfNums.length; i++) {
            if (arrayOfNums[i] > 0) {
                count++;
            }
        }
        System.out.println("\nBatting Average is: " + count / numOfTimesAtBat);

        // Display slugging percentage (regular average)
        double total = IntStream.of(arrayOfNums).sum();
        System.out.println("Slugging Percentage is: " + total / numOfTimesAtBat);
    }
}