import java.util.Scanner;

public class KeepGuessingClass {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber, guess = 0;//guess is initialized to 0
        int anotherNum = 5;
        secretNumber = 123;


        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.print("Enter the number:");
        guess = keyboard.nextInt();

        while ( guess != secretNumber &&  guess != anotherNum )
        {
            System.out.println("\nYou are wrong. Try again.");
            System.out.println("Enter the number: ");
            guess = keyboard.nextInt();
        }

        System.out.println("You are correct. You win a prize!");
        keyboard.close();
    }
}
