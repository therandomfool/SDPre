import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, pet;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.println( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.println( name + " what kind of pet do you have?");
    pet = keyboard.next();
    System.out.println( name + " you seem like you would have a " + pet );

    System.out.println( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.println( "How much do you weigh, " + name + "?" );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.println( "Finally what's your income, " + name + "?" );
    income = keyboard.nextDouble();

    System.out.println( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!");
    System.out.println( "Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");

    // integer does not blow up double.  just represents 1 as 1.0  2 @ 2.0 etc
    // integer or double does not blow up when input as String.  Variable is just a String, cannot do math on import junit.framework.TestCase;
    // q1 accepts everything.
    // q2 blows up on String and double needing just int
    // q3 & q4 blows up with String needing numerical input
  }
}
