import java.util.Scanner;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;

    pin = 12345;

    System.out.println( "WELCOME TO THE BANK OF JAVA." );
    System.out.println( "ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println( "\n INCORRECT PIN. TRY AGAIN. " );
      System.out.println( "ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println( "\n PIN ACCEPTED. YOUR BALANCE IS $425.17");
  }
}
