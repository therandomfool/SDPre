import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double x, y;

    Scanner num = new Scanner(System.in);

    System.out.println( "Please enter a number: ");
    x = num.nextDouble();

    System.out.println( "Please enter another number: ");
    y = num.nextDouble();

    System.out.println( "The sum of " + x + " + " + y + " = " + (x+y));

    num.close();
  }
}
