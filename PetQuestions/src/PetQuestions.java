import java.util.Scanner;

public class PetQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);



        System.out.print( "Greetings. What is your pet's name? " );
        String name = keyboard.nextLine();
        System.out.print( "What kind of animal is " + name + "? " );
        String breed = keyboard.nextLine();
        System.out.print( "How old is " + name + "? ");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}