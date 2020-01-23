import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2;
        int product;
        int sum;
        int average;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        product = (num1 * num2);
        sum = (num1 + num2);
        average = (num1 + num2)/2;

        if (sum > 200 && sum < 1000) {
            System.out.println("The sum is: " + sum + "*~");
        } else if (sum > 1000) {
            System.out.println("The sum is: " + sum + "*");

        } else if (sum < 200){
            System.out.println("The sum is " + sum +"~");
        }
        else {
            System.out.println("The sum is " + sum);
        }
        System.out.println("The average is " + average);

        System.out.println("The product is " + product);





    }

}