import java.util.Scanner;

 public class ComparingStrings {
   public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     String word;
     boolean yep, nope;

     System.out.println( "Type the word \"weasel\", please." );
     word = keyboard.next();

     yep = "weasel".equals(word);
     nope = ! word.equals("weasel");

     System.out.println( "You typed what was requested: " + yep );
     System.out.println( "You ignored polite instructions: " + nope );

     //  Study Drill switching "weasel" and word around worked fine.  Made the same equation
   }
 }
