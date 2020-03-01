import java.util.Scanner;

public class ComparingNumbers {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.println( "Give me two numbers. First: " );
    first = keyboard.nextDouble();
    System.out.println( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second ) {
      System.out.println( first + " is LESS THAN " + second );
    }

    if ( first <= second ) {
      System.out.println( first + " is LESS THAN/EQUAL TO " + second );
    }

    if ( first == second ) {
      System.out.println( first + " is EQUAL TO " + second );
    }

    if ( first >= second ) {
      System.out.println( first + " GREATER THAN/EQUAL TO " + second );
    }

    if ( first > second ) {
      System.out.println( first + " is GREATER THAN " + second );
    }

    if ( first != second ) {
      System.out.println( first + " is NOT EQUAL TO " + second );
      System.out.println( "Hey." );
    }

    // Study Drill Q#1 if the if statement isnt triggered i.e. the two numbers are equal, then the if statement ends
    // Study Drill Q#2 I am not understanding the directions.
  }
}
