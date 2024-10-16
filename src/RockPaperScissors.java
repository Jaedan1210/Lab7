import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            String player1Choice = getPlayerChoice(scanner, "1");
            String player2Choice = getPlayerChoice(scanner, "2");

            displayResult(player1Choice, player2Choice);

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().trim().toUpperCase();

        } while (playAgain.equals("Y"));

        System.out.println("Thank you for playing the game!");
        scanner.close();
    }

    private static String getPlayerChoice(Scanner scanner, String playerName) {
        String choice;
        do {
            System.out.print("Player " + playerName + ", Please enter your move (R, P, S): ");
            choice = scanner.nextLine().trim().toUpperCase();
        } while (!isValidChoice(choice));
        return choice;
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("R") || choice.equals("P") || choice.equals("S");
    }

    private static void displayResult(String player1Choice, String player2Choice) {
        if (player1Choice.equals(player2Choice)) {
            System.out.println("It's a Tie! " + player1Choice + " vs " + player2Choice);
        } else if (player1Choice.equals("R")) {
            if (player2Choice.equals("S")) {
                System.out.println("Rock beats Scissors! Player 1 wins!");
            } else {
                System.out.println("Paper beats Rock! Player 2 wins!");
            }
        } else if (player1Choice.equals("P")) {
            if (player2Choice.equals("R")) {
                System.out.println("Paper beats Rock! Player 1 wins!");
            } else {
                System.out.println("Scissors beats Paper! Player 2 wins!");
            }
        } else if (player1Choice.equals("S")) {
            if (player2Choice.equals("P")) {
                System.out.println("Scissors beats Paper! Player 1 wins!");
            } else {
                System.out.println("Rock beats Scissors! Player 2 wins!");
            }
        }
    }
}