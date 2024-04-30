import java.util.Scanner;

public class RateMyDayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Rate My Day App!");

        // Ask user to rate their day
        System.out.println("Please rate your day out of 10:");

        int rating = -1; // Initialize rating variable to a value outside the valid range

        // Loop until a valid rating is provided
        while (rating < 0 || rating > 10) {
            System.out.print("Enter your rating: ");
            String input = scanner.nextLine();

            // Check if input is a valid integer
            try {
                rating = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number between 0 and 10.");
                continue;
            }

            // Check if rating is within valid range
            if (rating < 0 || rating > 10) {
                System.out.println("Invalid rating! Please enter a number between 0 and 10.");
            }
        }

        // Display appropriate message based on the rating
        String message = "";
        switch (rating) {
            case 1:
                message = "\u001B[1m\u001B[31mYour rating is 1/10. It's a tough day, but remember, challenges make you stronger.\u001B[0m";
                break;
            case 2:
                message = "\u001B[1m\u001B[31mYour rating is 2/10. Hang in there! Tough times don't last, but tough people do.\u001B[0m";
                break;
            case 3:
                message = "\u001B[1m\u001B[31mYour rating is 3/10. It's okay to have bad days. Tomorrow is a fresh start.\u001B[0m";
                break;
            case 4:
                message = "\u001B[1m\u001B[33mYour rating is 4/10. Keep pushing forward! Progress happens one step at a time.\u001B[0m";
                break;
            case 5:
                message = "\u001B[1m\u001B[33mYour rating is 5/10. You're halfway there! Keep believing in yourself.\u001B[0m";
                break;
            case 6:
                message = "\u001B[1m\u001B[33mYour rating is 6/10. Stay focused and motivated. You're making progress.\u001B[0m";
                break;
            case 7:
                message = "\u001B[1m\u001B[32mYour rating is 7/10. Well done! You're on the right track.\u001B[0m";
                break;
            case 8:
                message = "\u001B[1m\u001B[32mYour rating is 8/10. Keep up the good work! Success is just around the corner.\u001B[0m";
                break;
            case 9:
                message = "\u001B[1m\u001B[32mYour rating is 9/10. Fantastic job! You're excelling in everything you do.\u001B[0m";
                break;
            case 10:
                message = "\u001B[1m\u001B[32mYour rating is 10/10. Outstanding! You've had an amazing day.\u001B[0m";
                break;
        }

        System.out.println(message);

        // Close scanner
        scanner.close();
    }
}
