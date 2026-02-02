import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_guessing {
    public static void main(String[] args) {
        // Initialize the Scanner for user input
        Scanner sc = new Scanner(System.in);
        
        // Generate a target number between 0 and 100
        int random_num = (int)(Math.random() * 101);
        int user_given_num;
        int attempts = 0;
        int lives = 5;

        System.out.println("Welcome to Number guessing game.");
        System.out.println("I have picked a number from 0 to 100 can you guess it.");
        System.out.println("You got 5 lives to try. Good luck");

        // Game loop: continues as long as the player has lives remaining
        while (lives > 0) {
            System.out.println("Enter your guess.");
            
            try {
                user_given_num = sc.nextInt();
                attempts++; // Only count the attempt if input is a valid number

                if (user_given_num < random_num) {
                    System.out.println("Too low, Try again");       
                } else if (user_given_num > random_num) {
                    System.out.println("Too high, Try again");
                } else {
                    // Win condition: match found
                    System.out.println("Congratulations! You got it " + random_num + " in " + attempts + " attempts");
                    break; // Exit the loop immediately
                }
                
                // Deduct a life after a wrong (but valid) guess
                lives--;
                System.out.println("Remaining lives: " + lives);

            } catch (InputMismatchException e) {
                // Handle non-integer inputs (like letters or symbols)
                System.out.println("Please enter only numbers!");
                sc.nextLine(); // Clear the scanner buffer to prevent an infinite loop
            } 

            // Check for Loss condition
            if (lives == 0) {
                System.out.println("Game over. The number was " + random_num);
            }              
        }

        // Close the scanner to release system resources
        sc.close();
    }
}