import java.util.Scanner;

public class Objective4Lab4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int num;

    System.out.println( "Enter integer please: ");
    num = keyboard.nextInt();

    if ((num % 2) == 0) {
      System.out.println( num + " is EVEN" );
    }
    else {
      System.out.println( num + " is ODD" );
    }

    keyboard.close();
  }
}
