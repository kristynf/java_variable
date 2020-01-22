
public class Variable {
public static void main( String[] args ) {
    //declare variables here before we use them
    int x;
    int y;
    float z;
    int answer;
    int a;
     //all three variables will be declared as integers
    double temperature;
    float Temperature;
    float GPA;
    byte age;
    //a float uses less memory than a double
    String firstName, lastName;
    String question = "unknown";
    String MovieTitle;
    //question is initialized</p>
    //assign values to the variables here
    x = 99;
    y = 2147483647; //you could also use the constant Integer.MAX_VALUE
    z = 4.0f;
    answer = 42;
    firstName = "Kristyn";
    lastName = "Ferber";
    age = 46;
    MovieTitle = "Isle of Dogs";
    // String question = "unknown"; //question is initialized
    temperature = 98.6;
    Temperature = 32.0f;

    //Use the variables here
    System.out.println("The variable x contains a value of " + x);
    System.out.print("The value " + y + " is the largest value ");
    System.out.println("you can store in an integer.");
    System.out.println("The answer to the question is: " + answer);
    System.out.println("And the question has long since been " + question);
    System.out.println("If you're not sick your temperature is "
            + temperature);
    System.out.println("If you're an ice cube your temperature is "
            + Temperature);
    System.out.println("The variable Temperature is not "
            + "the same as  temperature");
    System.out.println("My name is  " + firstName + " " + lastName);
    System.out.println("My GPA is: " + z);
    System.out.println("My age is: " + age);
    System.out.println("The last movie I saw was: " + MovieTitle);
}

}