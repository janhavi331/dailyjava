import java.util.Scanner;
import java.util.Random;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter your choice (rock, paper, scissors): ");
        String userChoice = sc.nextLine().toLowerCase();

        // Computer random choice: 0=rock, 1=paper, 2=scissors
        int compNum = rand.nextInt(3);
        String compChoice = "";
        if (compNum == 0) compChoice = "rock";
        else if (compNum == 1) compChoice = "paper";
        else compChoice = "scissors";

        System.out.println("Computer chose: " + compChoice);

        // Decide winner
        if (userChoice.equals(compChoice)) {
            System.out.println("It's a Tie!");
        }
        else if (
                (userChoice.equals("rock") && compChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && compChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && compChoice.equals("paper"))
        ) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }
    }
}
