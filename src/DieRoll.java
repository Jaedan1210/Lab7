import java.util.Random;
import java.util.Scanner;
public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuerolling = true;
        while (continuerolling) {
            int rollCount = 0;
            System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");


            while (true) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    break;
                }
            }

            System.out.print("Would you like to roll the die again? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                continuerolling = false;
            }
        }

        scanner.close();
    }
}

