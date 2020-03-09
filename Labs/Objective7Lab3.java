import java.util.Scanner;

public class Objective7Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      selection = scanner.nextInt();

      if (selection == 1){
        System.out.println("HELLO!");
      }
      else if (selection == 2) {
        System.out.println(" Pizza, Pizza, Pizza");
      }
      else if ( selection == 3) {
        System.out.println("Goodbye!");
        break;
      }
      else {
        System.out.println(" Input Error!  Try this again!");
      }
    }

    scanner.close();

  }
  public static void printMenu() {
    System.out.println("__________Menu__________");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
