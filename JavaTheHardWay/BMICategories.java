import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi,h,w,m,kg;

    System.out.println( "Enter you height in inches: " );
    h = keyboard.nextDouble();

    System.out.println( "Enter you weight in pounds: " );
    w = keyboard.nextDouble();

    m = h * 0.0254;
    kg = w * 0.45359237;
    bmi = kg / (m*m);

    System.out.println( "BMI Category: " );
    if (bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else  {
      System.out.println( "very severely/\"morbidly\" obese" );
    }

    // Study Drill changing statement to if starts a new code block not dependent on the chain previous
  }
}
