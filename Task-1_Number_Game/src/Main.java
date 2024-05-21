import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;
        int totalAttempt = 7;
        int userscore = 0;
        int round =1;

        System.out.println();
        System.out.println("============WELCOME to the NUMBER GAME================");
        System.out.println("==> You have to guess a number between 1 and 100");
        System.out.println("==> RULES:");
        System.out.println("   1- A random number is generated in this program and you have to guess it.");
        System.out.println("   2- You have " + totalAttempt + " attempts to guess the number.");
        System.out.println("   3- After each guess, Program will show if your guess is Too HIGH, Too LOW, or CORRECT.");
        System.out.println("   4- If you guess the number within " + totalAttempt + " attempts, you WIN else you LOSE");
        System.out.println("   5- After each round, you can choose to Play Again or not.");
        System.out.println();

        while(playAgain) {
            System.out.println("=============== ROUND " + round + " ================");
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            int remainingattempts = totalAttempt;
            System.out.println("random" + randomNumber );

            while (remainingattempts > 0) {
                System.out.println();
                System.out.print("Guess a number: ");
                int guess = scanner.nextInt();
                remainingattempts--;

                if (guess > randomNumber) {
                    System.out.println("Your guess is TOO HIGH, Try Again");
                    System.out.println("Attempts remaining:: " + remainingattempts);
                }
                else if (guess < randomNumber) {
                    System.out.println("Your guess is Too LOW, Try Again");
                    System.out.println("Attempts remaining:: " + remainingattempts);
                }
                else {
                    System.out.println("*****Congratulations!!! You guessed the number in " + (totalAttempt-remainingattempts) + " attempts.*****");
                    userscore++;
                    remainingattempts++;
                    break;
                }
            }
            if (remainingattempts == 0) {
                System.out.println();
                System.out.println("**You LOST the Game**");
                System.out.println("The CORRECT number was: " + randomNumber);
            }

            System.out.println();
            System.out.println(" --[ Your Score is: " + userscore+" ]--");

            System.out.println();
            System.out.println("Do you want to play Again? (y/n): ");
            String descision = scanner.next();
            if (descision.equals("y")) {
                round++;
            } else {
                playAgain = false;
            }
        }
        System.out.println();
        System.out.println("GAME OVER!!");
        System.out.println("Your final score is " + userscore);
        scanner.close();
    }
}