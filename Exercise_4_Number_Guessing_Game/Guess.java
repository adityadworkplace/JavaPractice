import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;
        do {
            System.out.print("The range for the generated number is 0 - X. Enter X: ");
            int nLimit = sc.nextInt();
            System.out.print("Enter the maximum attempt limit: ");
            int attemptLimit = sc.nextInt();
            int attempts = 0;
            int guess = -1;

            int n = (int)(Math.random() * (nLimit + 1));
            System.out.println("The Number is generated.");

            while (guess != n && attempts != attemptLimit) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;
                if (guess < n){
                    System.out.println("Your guess is lower than the number.");
                } else if (guess > n) {
                    System.out.println("Your guess is higher than the number.");
                } else {
                    System.out.println("\nCongratulations.\nYou guessed the number right. The Number: " + n);
                    System.out.println("Number of attempts: " + attempts + "\n");
                }
            }
            if (attempts == attemptLimit){
                System.out.println("You reached the attempt limit. Limit: " + attemptLimit);
            }
            System.out.print("Enter 1 to restart the game: ");
            result = sc.nextInt();
        } while (result == 1);
        sc.close();
    }
}
