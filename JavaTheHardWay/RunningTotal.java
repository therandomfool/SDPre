import java.util.Scanner;

public class RunningTotal {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    System.out.println( "Type in a bunch of values and I'll add them up. " );
    System.out.println( "I'll stop when you type a zero. " );

    do {
      System.out.println("Value: " );
      current = keyboard.nextInt();
      total += current;
      // Study Drills Q#2 add if statement to make sure current is not 0 to continue to total.  If its 0 then it moves to while statement
      if ( current != 0 )
        System.out.println("The total so far is: " + total);
    } while ( current != 0 );

    System.out.println( "The final total is : " + total );
  }
}



//  Study Drills Q#1

// import java.util.Scanner;
//
// public class RunningTotal {
//   public static void main(String[] args) {
//     Scanner keyboard = new Scanner(System.in);
//     int current, total = 0;
//
//     System.out.println( "Type in a bunch of values and I'll add them up. " );
//     System.out.println( "I'll stop when you type a zero. " );
//
//     System.out.println("Value: " );
//     current = keyboard.nextInt();
//
//     while ( current != 0 ) {
//       System.out.println("Value: " );
//       current = keyboard.nextInt();
//       total += current;
//       System.out.println("The total so far is: " + total);
//     }
//
//     System.out.println( "The final total is : " + total );
//   }
// }
