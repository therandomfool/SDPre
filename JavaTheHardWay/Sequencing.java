import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);
    Double price, salesTax, total;

    System.out.println("How much is purchase price? ");
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax);
    System.out.println( "Total cost:\t" + total);

    keyboard.close();

    // moved salesTax and total to after user input to allow the variable to work
  }
}
