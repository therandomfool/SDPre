import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int age;

    System.out.println( "How old are you? " );
    age = keyboard.nextInt();

    System.out.println( "You are: " );
    if ( age < 13 ) {
      System.out.println("\tto young to create a Facebook account " );
    }
    if ( age >= 13 ) {
      System.out.println("\told enough to create a Facebook account " );
    }

    if ( age < 16 ) {
      System.out.println( "\tto young to get a drivers license" );
    }
    if ( age >= 16 ) {
      System.out.println( "\told enough to get a drivers license" );
    }

    if ( age < 18 ) {
      System.out.println( "\tto young to get a tattoo" );
    }
    if ( age >= 18 ) {
      System.out.println( "\told enough to get a tattoo" );
    }

    if ( age < 21 ) {
      System.out.println( "\tto young to drink alcohol" );
    }
    if ( age >= 21 ) {
      System.out.println( "\told enough to drink alcohol" );
    }

    if ( age < 35 ) {
      System.out.println( "\tto young to run for President of the U.S." );
      System.out.println( "\t\t(How sad!)" );
    }
    if ( age >= 35 ) {
      System.out.println( "\told enough to run for President of the U.S." );
      System.out.println( "\t\t(Very Cool!)" );
    }

    // Study drill Q#2 >= 65
    if ( age >= 65 ) {
      System.out.println( "\tYou are old enough to retire!");
    }
    if ( age < 65 ) {
      System.out.println( "\tto young to retire!");
    }

    // Study Drills
    //  greater than 35 gets printed "you are: ".  Doesnt meet iny of the if requirements
    //  added opposite message for each

  }
}
