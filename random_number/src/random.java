/*
 This is a random number generator
 */
import java.util.Random;
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //Ask for a random number between 1 and 100
        Random random = new Random();
        long from = 1;
        long to = 100;
        int randomNumber = random.nextInt((int)(to - from + 1)) + (int)from;

        // notice the data types of the variables declared so far
        // (int) is an explicit cast that will convert a 'long' data type to an 'int' data type

        // initialized the guessed number variable
        int guessedNumber = 0;

        //Counter that sets the initial guess count at zero

        int counter = 0;

        //Tells the user that the number is between 1 and 100 (see above)
        System.out.printf("The number is between %d and %d.\n", from, to);

        //This asks the user to start guessing, and through as series of if else statements tells
        // the user if they guessed too low or high
        //once the user guesses the correct answer it will print a statement that the user got the right answer and
        //how many tries it took.
        do
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();
            if (guessedNumber > randomNumber) {
                System.out.println("Your guess is too high!");
                counter++;
            }
            else if (guessedNumber < randomNumber) {
                System.out.println("Your guess is too low!");
                counter++;
            }
            else {
                System.out.println("You got it!");
                System.out.println("It took you " + counter + " " + "tries.");
            }
        } while (guessedNumber != randomNumber);
    }
}